import java.util.Scanner;
public class ShopApp
{
   public static void main (String[] args) {
/** Holds products with their repected price and stock level inside an array*/
           Product[] Names = {
                   new Product("water", 10, 1),
                   new Product("pepsi", 7, 2),
                   new Product("food", 5, 5),
                   new Product("salt", 15, 3),
                   new Product("bread", 6, 4),

           };


       Scanner sc = new Scanner(System.in);
       int impute;
       do {
/** Main manu for the user to select the desired option*/


           System.out.println("-----------------------------------------");
           System.out.println("       *** Welcome to our Shop *** ");
           System.out.println("-----------------------------------------");
           System.out.println(" Student Number: 2411631");
           System.out.println("--------------SHOPPING MENU--------------");
           System.out.println("     1. Display all products");
           System.out.println("               ");
           System.out.println("     2. Buy stock");
           System.out.println("               ");
           System.out.println("     3. Sell stock");
           System.out.println("               ");
           System.out.println("     4. Re-price item");
           System.out.println("               ");
           System.out.println("     5. Display total value");
           System.out.println("               ");
           System.out.println("-------------ENTER YOUR CHOICE-----------");
           System.out.print("Select option: ");



/** Holds all the possible selections of the user in the main menu
 * it uses a switch case iside a do while loop for the thr menu to keep looping to the start when finished the task*/
           impute = sc.nextInt();
           sc.nextLine();
           switch (impute) {
               case 1:
                   displayProducts(Names);
                   break;

               case 2: buyStock(Names,sc);
               break;


               case 3: sellStock(Names,sc);
               break;


               case 4: priceChange(Names, sc);
               break;


               case 5: sumOfPrices(Names);
               break;

           }


       } while (impute != 0);





   }

/** Method for cae 1, it uses a for loop to loop through all the characteristics of the products in the shop*/
   public static void displayProducts (Product[] NANA)
{
    System.out.println("List for all products");
    System.out.println("*********");
    for (Product theProduct : NANA) {
        System.out.println("Product name: " + theProduct.getName());
        System.out.println("Price: £" + theProduct.getPrice());
        System.out.println("Stock level: " + theProduct.getStockLevel());
        System.out.println("**************");
    }
}
/** method for user to buy product stock*/
public static void buyStock (Product[] products, Scanner sc) {
    displayProducts(products);

    System.out.println("Eneter product name: " );
    String productName = sc.nextLine();

    Product selectedProduct = null;
    for (Product product : products) {
        if (product != null && product.getName().equalsIgnoreCase(productName)) {
            selectedProduct = product;
            break;
        }
    }

    /** Check if the product was found*/
    if (selectedProduct == null) {
        System.out.println("Product not found. Please enter a valid product name.");
        return;
    }

    System.out.println("Enter quantity desired: ");
    int buyquantity = sc.nextInt();
    sc.nextLine();

    if (buyquantity <= 0) {
        System.out.println("Not enough stock level.");
        return;
    }

    /** Buy stock using the buyStock method of the Product class*/
    double totalPrice = selectedProduct.buyStock(buyquantity);

    // Display the result
    if (totalPrice > 0) {
        System.out.println("Stock bought successfully. Total cost: $" + totalPrice);
    } else {
        System.out.println("Invalid quantity or zero quantity. No stock bought.");
    }
}

    /**
     * Method to sell product stock to user
     * @param pr name of the Array of products
     * @param sc name given to th Scanner
     */
    public static void sellStock(Product[] pr,Scanner sc) {
        displayProducts(pr);
        System.out.println("Enter product name: ");
        String nameOfProduct = sc.nextLine();
        Product product = Findproduct(pr, nameOfProduct);
        /** Check if the product was found*/
        if (product == null) {
            System.out.println("Product not found. Please enter a valid product name.");
            return;
        }

        System.out.println("Enter quantity: ");

        int quantity = sc.nextInt();
        if (product.sell(quantity)) {
            System.out.println("Sold " + quantity + " " + product.getName() + "£ " + product.getPrice());

        } else {
            System.out.println(" Stock unavailable.");

        }
    }

    /**
     *Method to use in other methods to give the ability to search product by name.
     * @param products is the Array of products
     * @param nameOfProduct an object to hold name of products
     * @return
     */
    public static Product Findproduct(Product[] products, String nameOfProduct){
        for (Product pr : products) {
            if(pr.getName().equalsIgnoreCase(nameOfProduct))
                return pr;
        }
        return null;

    }

    /**
     * Method for user to change price of the products.
     * @param pr is a name given to the Array of products
     * @param sc in the name given to the Scanner
     */
    public static void priceChange(Product[] pr, Scanner sc)
    {
        System.out.println("enter product name: ");
        String NameOfProduct = sc.nextLine();
        Product pro = Findproduct(pr, NameOfProduct);
        if( pro == null) {
            System.out.println("Error: product not found");
            return;
        }
        System.out.println("Enter new peice: ");
        double newPrice = sc.nextDouble();
        pro.setPrice(newPrice);
        System.out.println("Product " + pro.getName() + " has been changed to £" + newPrice);
    }

    /**
     * Method sum up all the products prices
     * @param pr is re-name of the Array of products
     * @return
     */
    public static double totalPrice(Product[] pr) {
       double valueTotal = 0;
       for (Product pro : pr)
       {
           valueTotal += pro.getStockLevel() * pro.getPrice();
       }
       return valueTotal;

}

    /**
     * Method sum up all the products prices
     * @param NANA is re-name of the Array of products
     * totalValue stores the value of all the product stock price added up togather
     */
    public static void sumOfPrices( Product[] NANA) {
       double totalValue = 0;
       System.out.print(" sum of total value of stock: £");

      for (Product pro : NANA){
          totalValue = totalValue + pro.getPrice() * pro.getStockLevel();


      }
      System.out.println(totalValue);
      System.out.println("");
}
    }











