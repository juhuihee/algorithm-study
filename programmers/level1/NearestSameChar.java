import java.util.Arrays;
/**
 * [프로그래머스] 가장 가까운 같은 글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 * Level 1 | 연습문제
 */
public class NearestSameChar {
  public int[] solution(String s) {
    int[] answer = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
      answer[i] = -1;

      for (int j = i - 1; j >= 0; j--) {
        if (s.charAt(i) == s.charAt(j)) {
          answer[i] = i - j;
          break;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    NearestSameChar sol = new NearestSameChar();

    // 테스트 1
    int[] result1 = sol.solution("banana");
    int[] expected1 = { -1, -1, -1, 2, 2, 2 };
    System.out.println("Input: banana");
    System.out.println("Result:   " + Arrays.toString(result1));
    System.out.println("Expected: " + Arrays.toString(expected1));
    System.out.println("Pass: " + Arrays.equals(result1, expected1));
    System.out.println();

    // 테스트 2
    int[] result2 = sol.solution("foobar");
    int[] expected2 = { -1, -1, 1, -1, -1, -1 };
    System.out.println("Input: foobar");
    System.out.println("Result:   " + Arrays.toString(result2));
    System.out.println("Expected: " + Arrays.toString(expected2));
    System.out.println("Pass: " + Arrays.equals(result2, expected2));
  }
}
