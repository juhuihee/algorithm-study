/**
 * [프로그래머스] 점의 위치 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120841
 * Level 0 | 연습문제
 */
public class QuadrantCheck {
  public int solution(int[] dot) {
    if (dot[0] > 0 && dot[1] > 0)
      return 1;
    else if (dot[0] < 0 && dot[1] > 0)
      return 2;
    else if (dot[0] < 0 && dot[1] < 0)
      return 3;
    else
      return 4;
  }

  public static void main(String[] args) {
    QuadrantCheck sol = new QuadrantCheck();

    System.out.println(sol.solution(new int[] { 2, 4 })); // 1
    System.out.println(sol.solution(new int[] { -7, 4 })); // 2
    System.out.println(sol.solution(new int[] { -4, -7 })); // 3
    System.out.println(sol.solution(new int[] { 3, -4 })); // 4
  }
}
