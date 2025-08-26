public class Profit {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100.0;

        System.out.print(
            "The Cost Price is INR " + (int) costPrice + " and Selling Price is INR " + (int) sellingPrice + "\n" +
            "The Profit is INR " + (int) profit + " and the Profit Percentage is " + profitPercent
        );
    }
}