package section5controlflowstatements;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = sc.hasNextInt();


            if (hasNextInt) {
                int number = sc.nextInt();

//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number < min){
                    min = number;
                }
                if(number > max){
                    max = number;
                }
            } else {
                break;
            }
            sc.nextLine();
        }

        System.out.println("min = "+min +", max = " + max);


    }


}
