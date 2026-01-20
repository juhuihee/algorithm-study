/**
 * [프로그래머스] 구슬을 나누는 경우의 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 * Level 0 | 연습문제
 */

public class DividingMarbles {
  public int solution(int balls, int share) {
    if (share == 0 || balls == share)
      return 1;

    long result = 1;
    for (int i = 0; i < share; i++) {
      result *= (balls - i);
      result /= (i + 1);
    }
    return (int) result;
  }

  public static void main(String[] args) {
    DividingMarbles sol = new DividingMarbles();

    // 기본 테스트 (문제 예시)
    System.out.println(sol.solution(3, 2)); // 3 (3C2)
    System.out.println(sol.solution(5, 3)); // 10 (5C3)

    // 예외 케이스
    System.out.println(sol.solution(5, 0)); // 1 (0개 뽑기)
    System.out.println(sol.solution(5, 5)); // 1 (전부 뽑기)
    System.out.println(sol.solution(10, 1)); // 10 (1개만 뽑기)

    // 큰 숫자 (오버플로우 테스트)
    System.out.println(sol.solution(30, 15)); // 155117520
    System.out.println(sol.solution(20, 10)); // 184756

    // 기타
    System.out.println(sol.solution(4, 2)); // 6 (4C2)
    System.out.println(sol.solution(7, 3)); // 35 (7C3)
  }
}
