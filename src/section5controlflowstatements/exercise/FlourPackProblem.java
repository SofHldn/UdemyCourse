package section5controlflowstatements.exercise;

public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(5,3,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {


        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int diff = (bigCount * 5) + (smallCount * 1) - goal;

        if (diff < 0) {
            return false;
        } else if (diff == 0) {
            return true;
        } else {

            return smallCount>= goal%5;
        }
    }
}
