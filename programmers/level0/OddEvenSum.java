/**
 * [프로그래머스] - 홀짝에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 * Lv.0 | 연습문제
 */
public class OddEvenSum {
  public int solution(int n) {
    int answer = 0;

    if (n % 2 != 0) { // 홀수
      for (int i = 1; i <= n; i += 2) {
        answer += i;
      }
    } else { // 짝수
      for (int i = 2; i <= n; i += 2) {
        answer += i * i;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    OddEvenSum sol = new OddEvenSum();

    // 테스트 케이스 1: 홀수
    System.out.println(sol.solution(7)); // 16 (1+3+5+7)

    // 테스트 케이스 2: 짝수
    System.out.println(sol.solution(10)); // 220 (4+16+36+64+100)

    // 추가 테스트
    System.out.println(sol.solution(1)); // 1
    System.out.println(sol.solution(2)); // 4
    System.out.println(sol.solution(5)); // 9 (1+3+5)
  }
}
