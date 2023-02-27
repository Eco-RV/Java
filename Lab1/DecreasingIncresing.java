package Lab1;

import java.util.Scanner;

public class DecreasingIncresing {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 Números: ");
        
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println("Decreasing");
        }
        else {
            if (n1 < n2 && n2 < n3) {
                System.out.println("Incresing");
            }
            else {
                System.out.println("Neither inc / decr.");
            }
        }
    }
}
