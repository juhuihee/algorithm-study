/**
 * [프로그래머스] 바탕화면 정리
 * https://school.programmers.co.kr/learn/courses/30/lessons/161990
 * Level 1 | 연습문제
 */

public class CleanUpDesktop {
  public int[] solution(String[] wallpaper) {
    int minRow = Integer.MAX_VALUE;
    int minCol = Integer.MAX_VALUE;
    int maxRow = Integer.MIN_VALUE;
    int maxCol = Integer.MIN_VALUE;

    for (int i = 0; i < wallpaper.length; i++) {
      for (int j = 0; j < wallpaper[i].length(); j++) {
        if (wallpaper[i].charAt(j) == '#') {
          minRow = Math.min(minRow, i);
          minCol = Math.min(minCol, j);
          maxRow = Math.max(maxRow, i);
          maxCol = Math.max(maxCol, j);
        }
      }
    }
    return new int[] { minRow, minCol, maxRow + 1, maxCol + 1 };
  }

  public static void main(String[] args) {
    CleanUpDesktop sol = new CleanUpDesktop();

    // 테스트 1
    String[] wallpaper1 = { ".#...", "..#..", "...#." };
    int[] result1 = sol.solution(wallpaper1);
    System.out.println("[" + result1[0] + ", " + result1[1] + ", " +
        result1[2] + ", " + result1[3] + "]");
    System.out.println("기댓값: [0, 1, 3, 4]");
    System.out.println();

    // 테스트 2
    String[] wallpaper2 = { "..........", ".....#....", "......##..", "...##.....", "....#....." };
    int[] result2 = sol.solution(wallpaper2);
    System.out.println("[" + result2[0] + ", " + result2[1] + ", " +
        result2[2] + ", " + result2[3] + "]");
    System.out.println("기댓값: [1, 3, 5, 8]");
    System.out.println();

    // 테스트 3
    String[] wallpaper3 = { ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...." };
    int[] result3 = sol.solution(wallpaper3);
    System.out.println("[" + result3[0] + ", " + result3[1] + ", " +
        result3[2] + ", " + result3[3] + "]");
    System.out.println("기댓값: [0, 0, 7, 9]");
    System.out.println();

    // 테스트 4
    String[] wallpaper4 = { "..", "#." };
    int[] result4 = sol.solution(wallpaper4);
    System.out.println("[" + result4[0] + ", " + result4[1] + ", " +
        result4[2] + ", " + result4[3] + "]");
    System.out.println("기댓값: [1, 0, 2, 1]");
  }
}
