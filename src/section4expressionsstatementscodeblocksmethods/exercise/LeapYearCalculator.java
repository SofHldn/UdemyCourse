package section4expressionsstatementscodeblocksmethods.exercise;

public class LeapYearCalculator {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));


    }

    public static boolean isLeapYear(int year){

        if(year >= 1 && year <= 9999){

            if(year%4 == 0 && year%100 != 0){
                return true;

            }else if (year%4 == 0 && year%100 == 0 && year%400 == 0){
                return true;
            }else {
                return false;
            }

        }else {
            return false;
        }



    }


}
