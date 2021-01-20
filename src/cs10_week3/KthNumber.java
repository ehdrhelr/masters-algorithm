package cs10_week3;

import java.util.Arrays;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int k = commands[i][2] - 1;

            int cutSize = end - start + 1;
            int[] cutArr = new int[cutSize];
            int cutIndex = 0;

            for (int j = start; j <= end; j++) {
                cutArr[cutIndex] = array[j];
                cutIndex++;
            }

            Arrays.sort(cutArr);

            answer[i] = cutArr[k];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = new KthNumber().solution(arr, commands);

        System.out.println(Arrays.toString(result));
    }
}
