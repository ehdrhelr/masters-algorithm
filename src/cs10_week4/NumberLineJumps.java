package cs10_week4;

public class NumberLineJumps {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && ((x2 - x1) % (v1 - v2) == 0)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String result = kangaroo(0, 2, 5, 3);
        System.out.println(result);
    }
}
