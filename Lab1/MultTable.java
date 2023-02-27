package Lab1;

import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;            
            System.out.println(num + "x" + i + "=" + result);
        }
    }
}
