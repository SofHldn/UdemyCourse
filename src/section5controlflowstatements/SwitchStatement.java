package section5controlflowstatements;

public class SwitchStatement {
    public static void main(String[] args) {

        char myChar = 'F';

        switch (myChar){

            case 'A':
                System.out.println("this is an A");
                break;
            case 'B':
                System.out.println("this is a B");
                break;
            case 'C': case 'D':
                System.out.println("this is a " + myChar);
                break;

            default:
                System.out.println("not found");




        }


    }






}
