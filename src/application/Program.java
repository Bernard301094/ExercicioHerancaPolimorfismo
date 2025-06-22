package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        List <Product> products = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);

            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();

                Product product = new UsedProduct(name, price, new SimpleDateFormat("dd/MM/yyyy").parse(manufactureDate));
                products.add(product);

            } else {
                Product product = new Product(name, price);
                products.add(product);

            }
        }

        System.out.println("\nPRICE TAGS:");

        for (Product product : products) {
            System.out.println(product.getName() + product.priceTag());

        }

    }
}
