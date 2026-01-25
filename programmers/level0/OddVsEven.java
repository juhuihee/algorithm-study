/**
 * [프로그래머스] 홀수 vs 짝수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 * Level 0 | 연습문제
 */

public class OddVsEven {
  public int solution(int[] num_list) {
    int oddSum = 0;
    int evenSum = 0;

    for (int i = 0; i < num_list.length; i++) {
      if ((i + 1) % 2 != 0) { // 홀수번째
        oddSum += num_list[i];
      } else { // 짝수번째
        evenSum += num_list[i];
      }
    }
    return oddSum > evenSum ? oddSum : evenSum;
  }

  // 테스트 코드
  public static void main(String[] args) {
    OddVsEven sol = new OddVsEven();

    // 테스트 케이스 1
    int[] test1 = { 4, 2, 6, 1, 7, 6 };
    int result1 = sol.solution(test1);
    System.out.println("Test 1: " + result1 + " (Expected: 17) " +
        (result1 == 17 ? "PASS" : "FAIL"));
    // 홀수번째(1,3,5번): 4+6+7=17
    // 짝수번째(2,4,6번): 2+1+6=9

    // 테스트 케이스 2
    int[] test2 = { -1, 2, 5, 6, 3 };
    int result2 = sol.solution(test2);
    System.out.println("Test 2: " + result2 + " (Expected: 8) " +
        (result2 == 8 ? "PASS" : "FAIL"));
    // 홀수번째(1,3,5번): -1+5+3=7
    // 짝수번째(2,4번): 2+6=8

    // 추가 테스트 - 동점
    int[] test3 = { 1, 2 };
    int result3 = sol.solution(test3);
    System.out.println("Test 3: " + result3 + " (Expected: 2) " +
        (result3 == 2 ? "PASS" : "FAIL"));
    // 홀수번째: 1, 짝수번째: 2
  }
}
