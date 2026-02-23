/**
 * [프로그래머스] 피자 나눠먹기(1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 * Level 0 | 연습문제
 */

public class PizzaSlice1 {
  public int solution(int n) {
    return (int) Math.ceil((double) n / 7);
  }

  public static void main(String[] args) {
    PizzaSlice1 sol = new PizzaSlice1();

    System.out.println(sol.solution(7)); // 예상: 1
    System.out.println(sol.solution(1)); // 예상: 1
    System.out.println(sol.solution(15)); // 예상: 3
  }
}
