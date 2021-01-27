package cs10_week4;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int result = m % n + s - 1;
        if (result == 0) result = n;
        if (result > n) result -= n;
        return result;
    }

    public static void main(String[] args) {
        int result = saveThePrisoner(5, 3, 5);
        System.out.println(result);
    }
}
