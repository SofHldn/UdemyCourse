package section5controlflowstatements.exercise;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
        System.out.println(1.25*1.5);
        System.out.println(0.375/1.875);
        System.out.println(0.2*300);

    }

    public static void printSquareStar (int number){
        if(number< 5){
            System.out.println("Invalid Value");
        }else {

            for (int i = 1; i <= number; i++) {
                System.out.println();

                for (int j = 1; j <= number; j++) {

                    if (i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}


