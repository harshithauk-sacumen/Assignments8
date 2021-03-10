package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {

        // variables
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        List<Product> product = new ArrayList<Product>();

        do {
            // read input values
            System.out.println("Enter product details,");
            System.out.print("Name: ");
            productName = scan.nextLine();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per item): ");
            price = scan.nextDouble();

            // calculate total price for that product
            totalPrice = price * quantity;

            // calculate overall price
            overAllPrice += totalPrice;

            // create Product class object and add it to the list
            product.add(new Product(
                    productName, quantity, price, totalPrice));

            // ask for continue?
            System.out.print("Want to add more item? (y or n): ");
            choice = scan.next().charAt(0);

            // read remaining characters, don't store (no use)
            scan.nextLine();
        } while (choice == 'y' || choice == 'Y');

        // display all product with its properties
        Product.displayFormat();
        for (Product p : product) {
            p.display();
        }

        // overall price
        System.out.println("\nTotal Price = " + overAllPrice);

        // close Scanner
        scan.close();
    }
}
