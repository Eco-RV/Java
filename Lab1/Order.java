package Lab1;

import java.util.Scanner;

public class Order {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 3 Numbers: \n");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.print(n1 + "-" + n2 + "-" + n3);
                }
                else {
                    System.out.print(n1 + "-" + n3 + "-" + n2);
                }
            }
            else {
                System.out.print(n3 + "-" + n1 + "-" + n2);
            }
        } 
        else {
            if (n2>n3) {
                if (n1 > n3) {
                    System.out.print(n2 + "-" + n1 + "-" + n3);
                }
                else {
                    System.out.print(n2 + "-" + n3 + "-" + n1);
                }
            }
            else {
                System.out.print(n3 + "-" + n2 + "-" + n1);
            }
        }
    }
}
