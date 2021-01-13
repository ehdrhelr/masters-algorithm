package cs10_week2;

public class ReverseInteger {

    public int reverse(int x) {
        String xStr = "" + x;
        StringBuilder sb = new StringBuilder(xStr);
        sb.reverse();
        String result = sb.toString();
        if (result.endsWith("-")) {
            result = "-"+ result.substring(0, result.length() - 1);
        }

        int answer = 0;
        try {
            answer = Integer.parseInt(result);
        } catch (NumberFormatException nfe) {

        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int result = ri.reverse(120);
        System.out.println(result);
    }
}
