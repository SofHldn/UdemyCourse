package section5controlflowstatements.exercise;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage (){

        Scanner sc = new Scanner(System.in);
        double counter = 0;
        double sum = 0;

        while(true) {

            //System.out.println("Enter number:");
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int number = sc.nextInt();
                sum += number;
                counter++;

            } else {
                break;
            }

            sc.nextLine();

        }

        if(counter == 0){
            System.out.println("SUM = " + (int)sum + " AVG = " + (int)counter);
        }else {
            System.out.println("SUM = " + (int)sum + " AVG = " + (int)Math.round(sum/counter));
        }


    }

}
