package section5controlflowstatements.exercise;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(1000);
        System.out.println(reverse(-2));
        System.out.println(getDigitCount(234));
    }

    public static void numberToWords (int number){

        if(number < 0){
            System.out.println("Invalid Value");
        }else if (number == 0){
            System.out.println("Zero");
        }else {

            int reverse = reverse(number);


            while(reverse > 0) {

                int lastDigit = reverse % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                }

                reverse /=10;

            }
            if(getDigitCount(number) != getDigitCount(reverse(number))){
                for (int i = 0; i < getDigitCount(number) - getDigitCount(reverse(number)); i++) {
                    System.out.println("Zero");
                }
            }

        }



    }

    public static int reverse (int number){

        int numberTemp = number < 0 ? number * -1 : number;

        int reverse = 0;

        while (numberTemp > 0) {
            int digit = numberTemp % 10;
            reverse *= 10;
            reverse += digit;
            numberTemp /= 10;
        }

        return number < 0 ? reverse * -1 : reverse;
    }

    public static int getDigitCount (int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count = 0;

        while(number > 0){
            count ++;
            number /=10;

        }
        return count;


    }

}
