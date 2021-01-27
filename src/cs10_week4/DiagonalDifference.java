package cs10_week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a = new ArrayList<>(Arrays.asList(11, 2, 4));
        List<Integer> b = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> c = new ArrayList<>(Arrays.asList(10, 8, -12));
        arr.add(a);
        arr.add(b);
        arr.add(c);
        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
