public class SalesTax {


    double purchasePrice;
    double salesTax;

    public void getSalesTax(){
        //Get input
        purchasePrice = 100.00;
        salesTax = purchasePrice * 0.05;
        System.out.println("The item with a purchase price of $" + purchasePrice + " has a sales tax of $" + salesTax + ".");

        }

    }

