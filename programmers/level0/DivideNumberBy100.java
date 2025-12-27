import java.util.Scanner;
/**
 * [프로그래머스] PCCE 기출문제 3번 / 수 나누기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340205
 * Level 0 | 연습문제
 */
public class DivideNumberBy100 {
  public static int solution(int number) {
    int answer = 0;

    for (int i = 2; i < number; i++) {
      answer += number % 100;
      number /= 100;
    }
    return answer;
  }

  public static void main(String[] args) {
    // 테스트 케이스 1
    int result1 = solution(12345);
    System.out.println("Test 1: " + result1 + " (Expected: 68)");
    // 45 + 23 = 68

    // 테스트 케이스 2
    int result2 = solution(100);
    System.out.println("Test 2: " + result2 + " (Expected: 0)");
    // 조건 i<100에서 i=2부터 시작, 첫 반복에서 number=1이 되어 종료

    // 테스트 케이스 3
    int result3 = solution(10203);
    System.out.println("Test 3: " + result3 + " (Expected: 105)");
    // 3 + 2 + 0 = 5? 아니면 03 + 02 = 5?
    // 실제: 03 + 02 + 00 = 5

    // 테스트 케이스 4
    int result4 = solution(99999);
    System.out.println("Test 4: " + result4 + " (Expected: 297)");
    // 99 + 99 + 99 = 297

    // 테스트 케이스 5
    int result5 = solution(50);
    System.out.println("Test 5: " + result5 + " (Expected: 0)");
    // i=2부터 시작, 50 % 100 = 50, 50/100 = 0, 다음 i=3, 3<0 false

    // Scanner 버전 (수동 입력 테스트용)
    System.out.println("\n=== Scanner 테스트 (숫자 입력) ===");
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자 입력: ");
    int number = sc.nextInt();
    int answer = 0;

    for (int i = 2; i < number; i++) {
      answer += number % 100;
      number /= 100;
    }
    System.out.println("결과: " + answer);
  }
}
