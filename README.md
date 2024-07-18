# ShopApp Java Project

## Overview
**ShopApp** is a simple console-based Java application that allows users to manage a small shop. Users can display available products, buy stock, sell stock, change product prices, and display the total value of all stock.

## Features
- **Display all products**: View the list of products along with their prices and stock levels.
- **Buy stock**: Purchase additional stock for a specific product.
- **Sell stock**: Sell a specified quantity of a product.
- **Re-price item**: Change the price of a product.
- **Display total value**: Calculate and display the total value of all stock in the shop.

## Requirements
- Java Development Kit (JDK) 8 or higher
- A Java IDE or a text editor
- Command line interface (CLI)

## How to Run
1. Clone the repository to your local machine:
   ```sh
   git clone https://github.com/yourusername/ShopApp.git
   ```
2. Navigate to the project directory:
   ```sh
   cd ShopApp
   ```
3. Compile the Java files:
   ```sh
   javac ShopApp.java Product.java
   ```
4. Run the application:
   ```sh
   java ShopApp
   ```

## Code Structure

### ShopApp.java
This is the main class containing the `main` method and other methods to handle user interactions and operations.

#### Methods:
- **main(String[] args)**: Entry point of the application. Displays the main menu and handles user input.
- **displayProducts(Product[] products)**: Displays all products with their details.
- **buyStock(Product[] products, Scanner sc)**: Handles buying stock for a specific product.
- **sellStock(Product[] products, Scanner sc)**: Handles selling stock of a specific product.
- **priceChange(Product[] products, Scanner sc)**: Allows the user to change the price of a product.
- **sumOfPrices(Product[] products)**: Calculates and displays the total value of all stock.
- **Findproduct(Product[] products, String productName)**: Finds and returns a product by its name.

### Product.java
This class represents a product in the shop. It contains fields and methods to manage the product's name, stock level, price, and purchased quantity.

#### Methods:
- **Product(String name, int stockLevel, double price)**: Constructor to initialize a product.
- **buyStock(int quantity)**: Buys a specified quantity of stock.
- **setPrice(double newPrice)**: Sets a new price for the product.
- **getName()**: Returns the name of the product.
- **getStockLevel()**: Returns the stock level of the product.
- **getPrice()**: Returns the price of the product.
- **sell(int quantity)**: Sells a specified quantity of the product.

## Usage
1. **Display all products**: Choose option `1` from the main menu to view all available products.
2. **Buy stock**: Choose option `2`, enter the product name and the quantity to purchase.
3. **Sell stock**: Choose option `3`, enter the product name and the quantity to sell.
4. **Re-price item**: Choose option `4`, enter the product name and the new price.
5. **Display total value**: Choose option `5` to view the total value of all stock.

