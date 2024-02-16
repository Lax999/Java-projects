public class Product
{
    private String name;
    private int stockLevel;
    private double price;
    private int purchasedQuantity;


    public Product(String name,int stockLevel, double price)
    {
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.purchasedQuantity = 0;
    }

    public double buyStock(int quantity) {
        if (quantity <= 0)
        {
            return 0;
        }
       int remainingStock = Math.max(0, stockLevel - quantity);
        int purchasedQuantity = stockLevel - remainingStock;
        stockLevel = remainingStock;
        return purchasedQuantity * price;
    }


    public void setPrice(double newPrice)
    {
if (newPrice >= 0)
{
    price = newPrice;
}
    }

    public String getName()
    {
return name;
    }

    public int getStockLevel()
    {
return stockLevel;
    }

    public double getPrice()
    {
return price;
    }
    public boolean sell (int quantity)
    {
        if (quantity <= 0) {
            return false;
        }
        if (stockLevel >= quantity)
        {
            stockLevel -= quantity;
            return true;
        }
        return false;


    }

}
