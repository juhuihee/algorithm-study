/**
 * [프로그래머스] 짝수 홀수 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 * Level 0 | 연습문제
 */

public class EvenOddCount {
  public int[] solution(int[] num_list) {
    int[] answer = new int[2];

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        answer[0]++; // 짝수 개수
      } else {
        answer[1]++; // 홀수 개수
      }
    }
    return answer;
  }

  // 테스트 코드
  public static void main(String[] args) {
    EvenOddCount sol = new EvenOddCount();

    // 테스트 케이스 1
    int[] test1 = { 1, 2, 3, 4, 5 };
    int[] result1 = sol.solution(test1);
    System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]");
    System.out.println("Expected: [2, 3] " +
        (result1[0] == 2 && result1[1] == 3 ? "PASS" : "FAIL"));
    // 짝수: 2개 (2, 4)
    // 홀수: 3개 (1, 3, 5)
    System.out.println();

    // 테스트 케이스 2
    int[] test2 = { 1, 3, 5, 7 };
    int[] result2 = sol.solution(test2);
    System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]");
    System.out.println("Expected: [0, 4] " +
        (result2[0] == 0 && result2[1] == 4 ? "PASS" : "FAIL"));
    // 짝수: 0개
    // 홀수: 4개 (1, 3, 5, 7)
    System.out.println();

    // 테스트 케이스 3
    int[] test3 = { 2, 4, 6, 8 };
    int[] result3 = sol.solution(test3);
    System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]");
    System.out.println("Expected: [4, 0] " +
        (result3[0] == 4 && result3[1] == 0 ? "PASS" : "FAIL"));
    // 짝수: 4개 (2, 4, 6, 8)
    // 홀수: 0개
    System.out.println();

    // 테스트 케이스 4 - 음수 포함
    int[] test4 = { -1, -2, 0, 3, 4 };
    int[] result4 = sol.solution(test4);
    System.out.println("Test 4: [" + result4[0] + ", " + result4[1] + "]");
    System.out.println("Expected: [3, 2] " +
        (result4[0] == 3 && result4[1] == 2 ? "PASS" : "FAIL"));
    // 짝수: 3개 (-2, 0, 4)
    // 홀수: 2개 (-1, 3)
  }
}
