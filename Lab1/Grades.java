package Lab1;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Grades {
    public static void main(String[] args) {
      
        //Grades Students Exercises
        
        //Variables
        float sumOfGrades = 0;
        float counterPass = 0;
        float counterFail = 0;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many grades will you check?: ");
        
        int gradesToCheck = scan.nextInt();

        for(int i = 1; i<=gradesToCheck; i++) {

            System.out.println("Input Grade: ");
            float grade = scan.nextFloat();
            
                sumOfGrades += grade;

                if (grade >= 60) {
                    counterPass++;
                }
                else {
                    counterFail++;
                }
        }

        //Calculate Average
        float average = sumOfGrades/(counterFail + counterPass);

        System.out.println("The Average is: " + average);
        System.out.println("The # of Passing Students: " + counterPass);
        System.out.println("The # of Failing Students: " + counterFail);

    }
  }
