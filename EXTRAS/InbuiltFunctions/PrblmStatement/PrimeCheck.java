import java.util.Scanner;

public class PrimeCheck {
    static Scanner sc = new Scanner(System.in);

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        if (n == 2) return true;  
        if (n % 2 == 0) return false; 

       
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
        
        sc.close();
    }
}
