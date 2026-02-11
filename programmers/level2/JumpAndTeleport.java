package level2;

/**
 * [프로그래머스] 점프와 순간 이동
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 * Level 2 | 연습문제
 */

public class JumpAndTeleport {
  public int solution(int n) {
    return Integer.toBinaryString(n).replace("0", "").length();
  }

  public static void main(String[] args) {
    JumpAndTeleport sol = new JumpAndTeleport();

    // 테스트 케이스 1: n=5
    int result1 = sol.solution(5);
    System.out.println("n=5: " + result1);
    System.out.println("예상: 2, 실제: " + result1 + " → " + (result1 == 2 ? "pass" : "fail"));
    System.out.println("5 → 101 → 11 → length=2");
    System.out.println();

    // 테스트 케이스 2: n=6
    int result2 = sol.solution(6);
    System.out.println("n=6: " + result2);
    System.out.println("예상: 2, 실제: " + result2 + " → " + (result2 == 2 ? "pass" : "fail"));
    System.out.println("6 → 110 → 11 → length=2");
    System.out.println();

    // 테스트 케이스 3: n=5000
    int result3 = sol.solution(5000);
    System.out.println("n=5000: " + result3);
    System.out.println("예상: 5, 실제: " + result3 + " → " + (result3 == 5 ? "pass" : "fail"));
    System.out.println("5000 → 1001110001000 → 11111 → length=5");
    System.out.println();

    // 추가 테스트: n=1 (최소값)
    int result4 = sol.solution(1);
    System.out.println("n=1: " + result4);
    System.out.println("예상: 1, 실제: " + result4 + " → " + (result4 == 1 ? "pass" : "fail"));
    System.out.println("1 → 1 → 1 → length=1");
    System.out.println();

    // 추가 테스트: n=1000000000 (최대값)
    int result5 = sol.solution(1000000000);
    System.out.println("n=1000000000: " + result5);
    System.out.println("2진수: " + Integer.toBinaryString(1000000000));
    System.out.println("1의 개수: " + result5);
  }
}
