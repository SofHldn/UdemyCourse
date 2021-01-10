package section5controlflowstatements;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int i = 1;
        int sum = 0;


        while(true){


            System.out.println("Enter number #" +i+":");

            boolean hasNext = sc.hasNextInt();

            if(hasNext) {

                int number = sc.nextInt();
                i++;
                sum += number;
            }else {

                System.out.println("Invalid number");
            }

            sc.nextLine();

            if(i == 11){
                break;
            }

        }

        sc.close();
        System.out.println(sum);


    }






}
