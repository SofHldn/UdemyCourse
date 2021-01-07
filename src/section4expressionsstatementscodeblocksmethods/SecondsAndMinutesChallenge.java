package section4expressionsstatementscodeblocksmethods;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(3945));
    }


    public static String getDurationString (int minutes, int seconds){

        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }

        int hours = minutes/60;
        int minutesLeft = minutes%60;

        return String.format("%02d", hours) + "h "+ String.format("%02d", minutesLeft) + "m " + String.format("%02d", seconds) + "s";

    }

    public static String getDurationString (int seconds){

        if(seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds/60;
        int secondsLeft = seconds%60;

        return getDurationString(minutes, secondsLeft);
    }

}
