package section4expressionsstatementscodeblocksmethods.exercise;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }


    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){


        firstNumber *= 1000;
        secondNumber *= 1000;
        return (int)firstNumber == (int)secondNumber;

    }

}