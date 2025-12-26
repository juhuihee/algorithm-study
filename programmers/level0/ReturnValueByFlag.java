/**
 * [프로그래머스] flag에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * Level 0 | 연습문제
 */
public class ReturnValueByFlag {
  public int solution(int a, int b, boolean flag) {
    if (flag) {
      return a + b;
    }
    return a - b;
  }

  public static void main(String[] args) {
    ReturnValueByFlag sol = new ReturnValueByFlag();

    // 테스트 케이스 1: flag = true
    int result1 = sol.solution(-4, 7, true);
    System.out.println("Test 1: " + result1 + " (Expected: 3)");

    // 테스트 케이스 2: flag = false
    int result2 = sol.solution(-4, 7, false);
    System.out.println("Test 2: " + result2 + " (Expected: -11)");

    // 추가 테스트
    int result3 = sol.solution(10, 5, true);
    System.out.println("Test 3: " + result3 + " (Expected: 15)");

    int result4 = sol.solution(10, 5, false);
    System.out.println("Test 4: " + result4 + " (Expected: 5)");

    int result5 = sol.solution(0, 0, true);
    System.out.println("Test 5: " + result5 + " (Expected: 0)");

    int result6 = sol.solution(0, 0, false);
    System.out.println("Test 6: " + result6 + " (Expected: 0)");
  }
}
