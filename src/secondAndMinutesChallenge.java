import com.sun.org.apache.bcel.internal.generic.RET;

public class secondAndMinutesChallenge {

    public static void main(String[] arg){
        System.out.println(getDurationString( -178937));
    }

    private static String getDurationString(double minutes, double seconds){
        if(minutes<0 || seconds<0 && seconds>59){
            return "Invalid Value";
        }
        int hours = (int) minutes/60;
        int remainingMinutes = (int) minutes % 60 + (int) seconds / 60;
        int remainingSeconds = (int)seconds % 60;
        return hours+"h"+" "+remainingMinutes+"m"+" "+remainingSeconds+"s";

    }
    private static String getDurationString(double seconds){
        if(seconds<0){
            return "Invalid Value";
        }

        int remainingMinutes = (int) seconds / 60;
        int remainingSeconds = (int)seconds % 60;
        return getDurationString(remainingMinutes,remainingSeconds);

    }

}
