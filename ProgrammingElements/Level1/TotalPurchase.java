import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double unitPrice = in.nextDouble(); 
            int quantity = in.nextInt();       
            
            
            double total = unitPrice * quantity;
            
            System.out.println("The total purchase price is INR " + total +
                    " if the quantity " + quantity +
                    " and unit price is INR " + unitPrice);
        } 
    }
}