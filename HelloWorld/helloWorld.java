import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args){

        float amountToSpend = 0;
        float gasPrice = 0;
        float gallons;
        
        Scanner keyboardScanner = new Scanner(System.in);
            
            System.out.print("How much money you want to spend?: ");
            if (!keyboardScanner.hasNextFloat()) {
                System.out.print("Valor Invalido");
                keyboardScanner.next();
            } else {
                amountToSpend = keyboardScanner.nextFloat();
            }
            System.out.print("What is the gasoline price?: ");

            if (!keyboardScanner.hasNextFloat()) {
                System.out.print("Valor Invalido");
                keyboardScanner.next();
            } else {
                gasPrice = keyboardScanner.nextFloat();     
            }

            if (amountToSpend<=0 || gasPrice<=0){
                System.out.print("Input must be greater than zero");
            } 
            else{
                gallons = amountToSpend / gasPrice;
                System.out.println("You will be able to buy: " + gallons + " gallons");
            }   
            
    }

}