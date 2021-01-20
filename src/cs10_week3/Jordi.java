package cs10_week3;

import java.util.Stack;

public class Jordi {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int index : moves) {
            for (int j = 0; j < board.length; j++) {
                int finding = board[j][index - 1];
                if (finding != 0) {
                    if (stack.size() == 0) { // isEmpty를 사용하거나, stack에 처음 0을 추가해주는 방법도 있다.
                        stack.push(finding);
                        board[j][index - 1] = 0;
                        break;
                    }
                    if (finding != stack.peek()) {
                        stack.push(finding);
                        board[j][index - 1] = 0;
                        break;
                    } else if (finding == stack.peek()) {
                        stack.pop();
                        answer += 2;
                        board[j][index - 1] = 0;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int result = new Jordi().solution(board, moves);

        System.out.println(result);
    }

}
