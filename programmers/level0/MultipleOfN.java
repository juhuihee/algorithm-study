/**
 * [프로그래머스] - n의 배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 * Lv.0 | 연습문제
 */
public class MultipleOfN {
  public int solution(int num, int n) {
    if (num % n == 0) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    MultipleOfN sol = new MultipleOfN();

    // 테스트 케이스 1: 배수인 경우
    System.out.println(sol.solution(98, 2)); // 1 (98은 2의 배수)

    // 테스트 케이스 2: 배수가 아닌 경우
    System.out.println(sol.solution(34, 3)); // 0 (34는 3의 배수 아님)

    // 추가 테스트
    System.out.println(sol.solution(100, 10)); // 1
    System.out.println(sol.solution(15, 5)); // 1
    System.out.println(sol.solution(7, 3)); // 0
  }
}
