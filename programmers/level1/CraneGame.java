import java.util.*;

/**
 * [프로그래머스] 크레인 인형뽑기
 * https://school.programmers.co.kr/learn/courses/30/lessons/64061
 * Level 1 | 연습문제
 */

class Solution {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();

    // moves를 순회
    for (int i = 0; i < moves.length; i++) {
      int col = moves[i] - 1; // 1번→0열

      // 해당 열을 위에서 아래로 탐색
      for (int row = 0; row < board.length; row++) {
        if (board[row][col] != 0) { // 인형 발견!
          int doll = board[row][col];
          board[row][col] = 0; // 인형 제거

          // 스택 비교
          if (!stack.isEmpty() && stack.peek() == doll) {
            stack.pop(); // 터뜨림
            answer += 2;
          } else {
            stack.push(doll); // 쌓기
          }

          break; // 인형 찾았으니 다음 move로!
        }
      }
    }

    return answer;
  }
}

// 테스트 코드
public class CraneGame {
  public static void main(String[] args) {
    Solution sol = new Solution();

    // 테스트 케이스 1
    int[][] board = {
        { 0, 0, 0, 0, 0 },
        { 0, 0, 1, 0, 3 },
        { 0, 2, 5, 0, 1 },
        { 4, 2, 4, 4, 2 },
        { 3, 5, 1, 3, 1 }
    };
    int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

    int result = sol.solution(board, moves);
    System.out.println("결과: " + result); // 4
    System.out.println("예상: 4");
    System.out.println(result == 4 ? "통과" : "실패");
  }
}
