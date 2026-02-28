/**
 * [프로그래머스] 세균 증식
 * https://school.programmers.co.kr/learn/courses/30/lessons/120910
 * Level 0 | 연습문제
 */

public class BacteriaGrowth {
  public static int solution(int n, int t) {
    return (int) (n * Math.pow(2, t));
  }

  public static void main(String[] args) {
    System.out.println(solution(2, 10)); // 2048
    System.out.println(solution(7, 15)); // 229376
  }
}
