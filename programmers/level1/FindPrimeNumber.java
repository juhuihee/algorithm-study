import java.util.*;

/**
 * [프로그래머스] 소수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 * Level 1 | 연습문제
 */
public class FindPrimeNumber {
  public int solution(int n) {
    // 1. 소수 판별 배열 초기화 (true = 소수 가능성)
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false; // 0, 1은 소수 아님

    // 2. 에라토스테네스의 체: 소수의 배수들을 제거
    for (int i = 2; i * i <= n; i++) { // √n까지만 체크
      if (isPrime[i]) {
        // i의 배수를 모두 제거 (i*i부터 시작)
        for (int j = i * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }

    // 3. 소수 개수 카운트
    int count = 0;
    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    FindPrimeNumber sol = new FindPrimeNumber();
    System.out.println(sol.solution(10)); // 4
    System.out.println(sol.solution(5)); // 3
    System.out.println(sol.solution(100)); // 25
    System.out.println("모든 테스트 통과!");
  }
}