import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long n = in.nextLong();              
            long handshakes = n * (n - 1) / 2;   
            
            System.out.println("The maximum number of handshakes is " + handshakes);
        } 
    }
}