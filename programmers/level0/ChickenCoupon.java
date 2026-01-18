/**
 * [프로그래머스] 치킨 쿠폰
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 * Level 0 | 코딩테스트 입문
 */
public class ChickenCoupon {
  public static void main(String[] args) {
    System.out.println("=== 치킨 쿠폰 테스트 ===\n");

    // 테스트 케이스 1
    test(100, 11);

    // 테스트 케이스 2
    test(1081, 120);

    // 테스트 케이스 3: 쿠폰 딱 10개
    test(10, 1);

    // 테스트 케이스 4: 쿠폰 9개 (서비스 못 받음)
    test(9, 0);

    // 테스트 케이스 5: 쿠폰 19개
    test(19, 2);
  }

  static void test(int chicken, int expected) {
    int result = solution(chicken);

    System.out.println("입력: " + chicken + "마리");
    System.out.println("Expected: " + expected + "마리");
    System.out.println("Actual:   " + result + "마리");
    System.out.println(result == expected ? "PASS" : "FAIL");
    System.out.println();
  }

  static int solution(int chicken) {
    int coupons = chicken;
    int answer = 0;

    while (coupons >= 10) {
      int service = coupons / 10;
      answer += service;
      coupons = coupons % 10 + service;
    }

    return answer;
  }
}
