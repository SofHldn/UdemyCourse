package section3firststeps;

public class OperatorChallenge {
    public static void main(String[] args) {

        double myDouble1 = 20.00D;
        double mydouble2 = 80.00D;
        boolean remainder;
        double result = (myDouble1+mydouble2)*100;
        System.out.println("Result: "+ result);

        double myRemainder = result % 40.00;
        System.out.println("Remainder: " + myRemainder);

        boolean hasNoRemainder = myRemainder==0 ? true:false;
        System.out.println(hasNoRemainder);

        if(!hasNoRemainder){
            System.out.println("Got some output");

        }

    }


}
