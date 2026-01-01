/**
 * [프로그래머스] - 두 수의 연산값 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 * Lv.0 | 연습문제
 */

public class CompareOperationValues {
  public int solution(int a, int b) {
    int concat = Integer.parseInt("" + a + b);
    int multiply = 2 * a * b;
    return Math.max(concat, multiply);
  }

  public static void main(String[] args) {
    CompareOperationValues sol = new CompareOperationValues();

    // 테스트 케이스 1
    int result1 = sol.solution(2, 91);
    System.out.println("Test 1: " + result1);
    System.out.println("Expected: 364");
    System.out.println("Pass: " + (result1 == 364));
    System.out.println();

    // 테스트 케이스 2
    int result2 = sol.solution(91, 2);
    System.out.println("Test 2: " + result2);
    System.out.println("Expected: 912");
    System.out.println("Pass: " + (result2 == 912));
    System.out.println();

    // 추가 테스트 케이스 3 (같을 때)
    int result3 = sol.solution(9, 91);
    System.out.println("Test 3: " + result3);
    System.out.println("Expected: 1638");
    System.out.println("Pass: " + (result3 == 1638));
    System.out.println();

    // 추가 테스트 케이스 4 (작은 수)
    int result4 = sol.solution(1, 1);
    System.out.println("Test 4: " + result4);
    System.out.println("Expected: 11");
    System.out.println("Pass: " + (result4 == 11));
    System.out.println();

    // 추가 테스트 케이스 5 (큰 수)
    int result5 = sol.solution(100, 50);
    System.out.println("Test 5: " + result5);
    System.out.println("Expected: 10050");
    System.out.println("Pass: " + (result5 == 10050));
  }
}
