package section5controlflowstatements.exercise;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome (int number){
        int reverse = 0;

        if(number < 0){
            number *= -1;
        }
        int numberTemp = number;

        while(numberTemp>0) {
            int lastDigit = numberTemp % 10;
            reverse *= 10;
            reverse += lastDigit;
            numberTemp /= 10;

        }

        return number == reverse;

    }


}
