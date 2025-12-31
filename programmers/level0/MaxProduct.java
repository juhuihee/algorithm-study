import java.util.Arrays;

/**
 * [프로그래머스] - 최대값 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120847
 * Lv.0 | 연습문제
 */

public class MaxProduct {
  public int solution(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length - 1] * numbers[numbers.length - 2];
  }

  public static void main(String[] args) {
    MaxProduct sol = new MaxProduct();

    // 테스트 케이스 1
    int[] test1 = { 1, 2, 3, 4, 5 };
    int result1 = sol.solution(test1);
    int expected1 = 20;
    System.out.println("Test 1: " + (result1 == expected1 ? "PASS" : "FAIL"));
    System.out.println("  Input: " + Arrays.toString(test1));
    System.out.println("  Expected: " + expected1);
    System.out.println("  Result: " + result1);
    System.out.println();

    // 테스트 케이스 2
    int[] test2 = { 0, 31, 24, 10, 1, 9 };
    int result2 = sol.solution(test2);
    int expected2 = 744;
    System.out.println("Test 2: " + (result2 == expected2 ? "PASS" : "FAIL"));
    System.out.println("  Input: " + Arrays.toString(test2));
    System.out.println("  Expected: " + expected2);
    System.out.println("  Result: " + result2);
    System.out.println();

    // 추가 테스트 케이스 3 - 2개만 있을 때
    int[] test3 = { 5, 3 };
    int result3 = sol.solution(test3);
    int expected3 = 15;
    System.out.println("Test 3: " + (result3 == expected3 ? "PASS" : "FAIL"));
    System.out.println("  Input: " + Arrays.toString(test3));
    System.out.println("  Expected: " + expected3);
    System.out.println("  Result: " + result3);
    System.out.println();

    // 추가 테스트 케이스 4 - 큰 수들
    int[] test4 = { 100, 99, 98, 97 };
    int result4 = sol.solution(test4);
    int expected4 = 9900;
    System.out.println("Test 4: " + (result4 == expected4 ? "PASS" : "FAIL"));
    System.out.println("  Input: " + Arrays.toString(test4));
    System.out.println("  Expected: " + expected4);
    System.out.println("  Result: " + result4);
    System.out.println();

    // 추가 테스트 케이스 5 - 0 포함
    int[] test5 = { 0, 0, 10, 20 };
    int result5 = sol.solution(test5);
    int expected5 = 200;
    System.out.println("Test 5: " + (result5 == expected5 ? "PASS" : "FAIL"));
    System.out.println("  Input: " + Arrays.toString(test5));
    System.out.println("  Expected: " + expected5);
    System.out.println("  Result: " + result5);
    System.out.println();

    System.out.println("=== 모든 테스트 완료! ===");
  }
}
