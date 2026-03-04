/**
 * [프로그래머스] 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 * Level 0 | 연습문제
 */
public class CommonMultipleCheck {
  public int solution(int number, int n, int m) {
    return (number % n == 0 && number % m == 0) ? 1 : 0;
  }

  public static void main(String[] args) {
    CommonMultipleCheck sol = new CommonMultipleCheck();

    System.out.println(sol.solution(10, 5, 2)); // 1
    System.out.println(sol.solution(10, 5, 3)); // 0
    System.out.println(sol.solution(6, 3, 2)); // 1
  }
}
