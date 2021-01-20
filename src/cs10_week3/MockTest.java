package cs10_week3;

import java.util.*;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            int firstRunner = i;
            int secondRunner = i;
            int thirdRunner = i;

            firstRunner %= 5;
            secondRunner %= 8;
            thirdRunner %= 10;

            int answer = answers[i];

            if (answer == first[firstRunner]) firstCnt++;
            if (answer == second[secondRunner]) secondCnt++;
            if (answer == third[thirdRunner]) thirdCnt++;
        }

        int[] scores = new int[] {firstCnt, secondCnt, thirdCnt};

        int maxScore = -1;

        for (int score : scores) {
            maxScore = Math.max(maxScore, score);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) list.add(i + 1);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answers1 = {1, 2, 3, 4, 5}; // {1}
        int[] answers2 = {1, 3, 2, 4, 2}; // {1, 2, 3}

        int[] answer = new MockTest().solution(answers1);
        System.out.println(Arrays.toString(answer));
    }
}
