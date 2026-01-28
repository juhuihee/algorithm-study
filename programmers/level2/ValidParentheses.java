package level2;

/**
 * [프로그래머스] 올바른 괄호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * Level 2 | 연습문제
 */
import java.util.ArrayDeque;

public class ValidParentheses {
  public boolean solution(String s) {
    ArrayDeque<Character> stack = new ArrayDeque<>();

    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else { // c == ')'
        if (stack.isEmpty() || stack.pop() != '(') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  // 로컬 테스트용
  public static void main(String[] args) {
    ValidParentheses vp = new ValidParentheses();

    // 테스트 케이스
    String[] testCases = {
        "()()", // true
        "(())()", // true
        ")()(", // false
        "(()(", // false
        "()", // true
        "()))", // false
        "(((", // false
        ")))", // false
        "(()())", // true
        "((())())", // true
    };

    boolean[] expected = {
        true, true, false, false, true,
        false, false, false, true, true
    };

    System.out.println("=== 올바른 괄호 테스트 ===\n");

    for (int i = 0; i < testCases.length; i++) {
      boolean result = vp.solution(testCases[i]);
      String status = (result == expected[i]) ? "pass" : "fail";

      System.out.printf("Test %d: %s\n", i + 1, status);
      System.out.printf("입력: \"%s\"\n", testCases[i]);
      System.out.printf("예상: %b, 결과: %b\n\n", expected[i], result);
    }
  }
}
