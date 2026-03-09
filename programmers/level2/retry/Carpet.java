package level2.retry;

import java.util.Arrays;

/**
 * [프로그래머스] 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * Level 2 | 연습문제
 */
public class Carpet {
  public int[] solution(int brown, int yellow) {
    int total = brown + yellow;
    int[] answer = new int[2];

    for (int h = 1; h <= (int) Math.sqrt(total); h++) {
      int w = total / h;
      if (total % h != 0)
        continue;
      if (2 * w + 2 * h - 4 == brown) {
        answer[0] = w;
        answer[1] = h;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Carpet c = new Carpet();

    System.out.println(Arrays.toString(c.solution(10, 2))); // [4, 3]
    System.out.println(Arrays.toString(c.solution(8, 1))); // [3, 3]
    System.out.println(Arrays.toString(c.solution(24, 24))); // [8, 6]
  }
}
