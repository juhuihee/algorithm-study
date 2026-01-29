package level2;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * [프로그래머스] 괄호 회전하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76502
 * Level 2 | 연습문제
 */

public class RotateParentheses {
  public int solution(String s) {
    HashMap<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    int n = s.length();
    s += s;
    int answer = 0;

    A: for (int i = 0; i < n; i++) {
      ArrayDeque<Character> stack = new ArrayDeque<>();
      for (int j = i; j < i + n; j++) {
        char c = s.charAt(j);

        if (!map.containsKey(c)) {
          stack.push(c);
        } else {
          if (stack.isEmpty() || !stack.pop().equals(map.get(c)))
            continue A;
        }
      }

      if (stack.isEmpty())
        answer++;
    }
    return answer;
  }

  public static void main(String[] args) {
    RotateParentheses rp = new RotateParentheses();

    // 테스트 케이스
    String[] testCases = {
        "[](){}", // 3
        "}]()[{", // 2
        "[)(]", // 0
        "}}}", // 0
        "{{{}", // 0
    };

    int[] expected = { 3, 2, 0, 0, 0 };

    System.out.println("=== 괄호 회전하기 테스트 ===\n");

    for (int i = 0; i < testCases.length; i++) {
      int result = rp.solution(testCases[i]);
      String status = (result == expected[i]) ? "pass" : "fail";

      System.out.printf("Test %d: %s\n", i + 1, status);
      System.out.printf("입력: \"%s\"\n", testCases[i]);
      System.out.printf("예상: %d, 결과: %d\n\n", expected[i], result);
    }
  }
}
