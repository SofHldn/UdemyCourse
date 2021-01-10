package section5controlflowstatements.exercise;


public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }


    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 0;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {

                boolean isPrime = true;

                while (isPrime) {
                    for (int j = 2; j <= (long) Math.sqrt(i); j++) {

                        if (i % j == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        largestPrime = i;
                        break;
                    }
                }
            }
        }
        return largestPrime;

    }
}
