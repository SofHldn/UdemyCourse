package section4expressionsstatementscodeblocksmethods;

public class OverloadMethod {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(-10));
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){

        if(feet < 0 || inches < 0 || inches >12 ){
            return -1;
        }

        double cm = (feet * 12 * 2.54) + (inches * 2.54);
        return cm;



    }

    public  static double calcFeetAndInchesToCentimeters (double inches){
        if(inches < 0){
            return -1;
        }

        double feet = Math.floor(inches/12);
        double newInches = inches%12;

        return (calcFeetAndInchesToCentimeters(feet, newInches));



    }


}
