package cs10_week3;

public class WeirdString {

    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int runner = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals(" ")) {
                if (runner % 2 == 0) {
                    strArr[i] = strArr[i].toUpperCase();
                } else {
                    strArr[i] = strArr[i].toLowerCase();
                }
                runner++;
                continue;
            }
            runner = 0;
        }
        for (String str : strArr) {
            answer += str;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";

        String result = new WeirdString().solution(s);
        System.out.println(result);
    }
}
