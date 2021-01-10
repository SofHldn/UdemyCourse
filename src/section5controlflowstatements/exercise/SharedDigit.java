package section5controlflowstatements.exercise;

public class SharedDigit {

    public static boolean hasSharedDigit (int a, int b){
        if(a < 10 || a >= 100 || b < 10 || b >= 100){
            return false;
        }

        int aFirst = a/10;
        int aSecond = a%10;
        int bFirst = b/10;
        int bSecond = b%10;

        return aFirst == bFirst || aFirst == bSecond || aSecond == bFirst || aSecond == bSecond;


    }
}
