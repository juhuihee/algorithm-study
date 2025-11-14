/**
 * [프로그래머스] 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 * Level 1 | 월간 코드 챌린지 시즌2
 */

public class AddNegativePositive {

  public int solution(int[] absolutes, boolean[] signs) {
    int sum = 0;
    for (int i = 0; i < signs.length; i++) {
      if (signs[i]) {
        sum += absolutes[i];
      } else {
        sum -= absolutes[i];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    AddNegativePositive sol = new AddNegativePositive();

    // 테스트 케이스
    System.out.println(sol.solution(
        new int[] { 4, 7, 12 },
        new boolean[] { true, false, true })); // 9

    System.out.println(sol.solution(
        new int[] { 1, 2, 3 },
        new boolean[] { false, false, true })); // 0
  }
}