package section4expressionsstatementscodeblocksmethods.exercise;

public class MintesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays (long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {

            long days = minutes / 60 / 24;
            long year = days / 365;
            long daysRemaining = days % 365;

            System.out.println(minutes + " min = " + year + " y and " + daysRemaining + " d");
        }
    }

}
