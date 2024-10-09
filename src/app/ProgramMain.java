package app;

public class ProgramMain {

    public static void main(String[] args) {
        String productName = "smartphone";
        int productNumber = 1;
        double price = 243.0682;
        int days = 5;
        int count = 10;
        double saleInDay = price * count;
        double totalSales = saleInDay * days;

        System.out.printf("Product No %d: %s, %n" +
                "total sales for %d days is EUR %.2f, %n" +
                "sales by day is EUR %.2f. %n",
                productNumber, productName, days, totalSales, saleInDay);

        productNumber = 2;
        productName = "laptop";
        count = 2;
        days = 7;
        price = 749.06075;
        saleInDay = price * count;
        totalSales = saleInDay * days;

        System.out.printf("Product No %d: %s, %n" +
                        "total sales for %d days is EUR %.2f, %n" +
                        "sales by day is EUR %.2f. %n",
                productNumber, productName, days, totalSales, saleInDay);
    }
}