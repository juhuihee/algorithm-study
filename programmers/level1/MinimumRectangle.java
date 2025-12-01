/**
 * [프로그래머스] - 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * Level 1 | 연습문제
 * 핵심: 각 명함을 회전 가능 → 큰값/작은값으로 정리
 */
public class MinimumRectangle {
  public int solution(int[][] sizes) {
    int maxWidth = 0; // 큰 값들 중 최댓값
    int maxHeight = 0; // 작은 값들 중 최댓값

    // 각 명함마다 처리
    for (int i = 0; i < sizes.length; i++) {
      int w = sizes[i][0]; // 현재 명함의 가로
      int h = sizes[i][1]; // 현재 명함의 세로

      // 큰 값 / 작은 값으로 정리
      int bigger = Math.max(w, h);
      int smaller = Math.min(w, h);

      // 최댓값 갱신
      maxWidth = Math.max(maxWidth, bigger);
      maxHeight = Math.max(maxHeight, smaller);
    }

    return maxWidth * maxHeight;
  }

  public static void main(String[] args) {
    MinimumRectangle sol = new MinimumRectangle();

    // 테스트 케이스
    int[][] test1 = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
    System.out.println(sol.solution(test1)); // 4000
  }
}