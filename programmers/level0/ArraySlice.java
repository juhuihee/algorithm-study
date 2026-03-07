import java.util.Arrays;

/**
 * [프로그래머스] 배열 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 * Level 0 | 연습문제
 */

public class ArraySlice {
  public static int[] solution(int[] numbers, int num1, int num2) {
    return Arrays.copyOfRange(numbers, num1, num2 + 1);
  }

  public static void main(String[] args) {
    // 테스트 케이스
    int[][] numbersArr = {
        { 1, 2, 3, 4, 5 },
        { 1, 2, 3, 4, 5 }
    };
    int[] num1s = { 2, 0 };
    int[] num2s = { 3, 4 };
    int[][] expecteds = {
        { 3, 4 },
        { 1, 2, 3, 4, 5 }
    };

    for (int i = 0; i < numbersArr.length; i++) {
      int[] result = solution(numbersArr[i], num1s[i], num2s[i]);
      boolean pass = Arrays.equals(result, expecteds[i]);
      System.out.println("TC" + (i + 1) + (pass ? " PASS" : "FAIL")
          + " | 결과: " + Arrays.toString(result)
          + " | 기댓값: " + Arrays.toString(expecteds[i]));
    }
  }
}
