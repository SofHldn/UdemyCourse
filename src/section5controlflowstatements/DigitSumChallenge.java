package section5controlflowstatements;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(4));

    }

    private static int sumDigits (int number){
        int sum = 0;
        int digit;

        if(number<10){
            return -1;
        }

            while (true) {
                digit = number % 10;
                number /= 10;
                sum += digit;
                if(number <1){
                    break;
                }
            }
            return sum;


    }

}
