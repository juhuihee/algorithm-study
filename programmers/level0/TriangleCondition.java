import java.util.Arrays;

/**
 * [프로그래머스] 삼각형의 완성조건(1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120889
 * Level 0 | 연습문제
 */
public class TriangleCondition {
  public static int solution(int[] sides) {
    Arrays.sort(sides);
    return sides[2] < sides[0] + sides[1] ? 1 : 2;
  }

  public static void main(String[] args) {
    int[][] tests = { { 1, 2, 3 }, { 3, 6, 2 }, { 199, 72, 222 } };
    int[] expected = { 2, 2, 1 };

    for (int i = 0; i < tests.length; i++) {
      int result = solution(tests[i]);
      String pass = result == expected[i] ? "PASS" : "FAIL";
      System.out
          .println(pass + " | sides=" + Arrays.toString(tests[i]) + " | expected=" + expected[i] + " | got=" + result);
    }
  }
}
