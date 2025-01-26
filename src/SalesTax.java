import java.util.Scanner;

public class SalesTax {


    double purchasePrice;
    double salesTax;

    public void getSalesTax(){
        //Create Scanner class
        Scanner scn = new Scanner(System.in);
        System.out.print("What is the cost of the item($): ");

        purchasePrice = scn.nextDouble();
        salesTax = purchasePrice * 0.05;
        System.out.println("The item with a purchase price of " + purchasePrice + " has a sales tax of " + salesTax + ".");

        }

    }

