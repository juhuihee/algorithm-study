import java.util.Arrays;

/**
 * [프로그래머스] 예산
 * https://school.programmers.co.kr/learn/courses/30/lessons/12982
 * Level 1 | 연습문제
 */

public class Budget {
  public int solution(int[] d, int budget) {
    // 1. 오름차순 정렬 (작은 것부터)
    Arrays.sort(d);

    // 2. 변수 초기화
    int sum = 0; // 현재까지 쓴 금액
    int count = 0; // 지원한 부서 개수

    // 3. 배열 순회하면서 더하기
    for (int money : d) {
      // 예산 안에 들어오면
      if (sum + money <= budget) {
        sum += money; // 금액 추가
        count++; // 부서 +1
      }
      // 예산 초과하면 멈춤 (어차피 뒤는 더 비쌈)
    }

    return count;
  }

  public static void main(String[] args) {
    Budget sol = new Budget();

    // 테스트 1: 기본 케이스
    int[] d1 = { 1, 3, 2, 5, 4 };
    int budget1 = 9;
    System.out.println(sol.solution(d1, budget1)); // 3

    // 테스트 2: 모두 지원 가능
    int[] d2 = { 2, 2, 3, 3 };
    int budget2 = 10;
    System.out.println(sol.solution(d2, budget2)); // 4

    // 테스트 3: 하나만 가능
    int[] d3 = { 10, 20, 30 };
    int budget3 = 15;
    System.out.println(sol.solution(d3, budget3)); // 1

    // 테스트 4: 예산 딱 맞음
    int[] d4 = { 5, 10, 15 };
    int budget4 = 30;
    System.out.println(sol.solution(d4, budget4)); // 3
  }
}
