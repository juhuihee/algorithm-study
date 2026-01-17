/**
 * [프로그래머스] PCCE 기출문제 4번 / 저축
 * https://school.programmers.co.kr/learn/courses/30/lessons/250130
 * Level 0 | 연습문제
 */
public class MonthlySavings {
  public static void main(String[] args) {
    System.out.println("=== PCCE 4번: 저축 테스트 ===\n");

    // 테스트 케이스 1
    test(28, 6, 8, 12);

    // 테스트 케이스 2
    test(75, 8, 25, 2);

    // 테스트 케이스 3: 이미 70 이상
    test(70, 5, 10, 4);

    // 테스트 케이스 4: 이미 100 이상
    test(100, 5, 10, 1);
  }

  static void test(int start, int before, int after, int expected) {
    int money = start;
    int month = 1;

    // 70원 미만일 동안 before씩 저축
    while (money < 70) {
      money += before;
      month++;
    }

    // 100원 미만일 동안 after씩 저축
    while (money < 100) {
      money += after;
      month++;
    }

    // 결과 출력
    System.out.println("Input: start=" + start + ", before=" + before + ", after=" + after);
    System.out.println("   Expected: " + expected + "개월");
    System.out.println("   Actual:   " + month + "개월");
    System.out.println("   " + (month == expected ? "PASS" : "FAIL"));
    System.out.println();
  }

}