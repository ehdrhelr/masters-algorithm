package cs10_week4;

public class TimeConversion {

    static String timeConversion(String s) {
        if (s.endsWith("AM")) {
            s = s.replace("AM", "");
            if (s.startsWith("12")) {
                s = s.replaceFirst("12", "00");
            }
        } else if (s.endsWith("PM")) {
            s = s.replace("PM", "");
            String timeStr = s.substring(0, 2);
            int timeInt = Integer.parseInt(timeStr) + 12;
            if (timeInt == 24) {
                timeStr = "12";
            } else {
                timeStr = "" + timeInt;
            }
            s = timeStr + s.substring(2);
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "12:45:54PM";
        String result = timeConversion(s);
        System.out.println(result);
    }
}
