/**
 * [프로그래머스] 이웃한 칸
 * https://school.programmers.co.kr/learn/courses/30/lessons/250125
 * Level 1 | PCCE 기출문제
 */
class NeighborCell {
  public int solution(String[][] board, int h, int w) {
    int n = board.length;
    int count = 0;
    int[] dh = { 0, 1, -1, 0 };
    int[] dw = { 1, 0, 0, -1 };

    for (int i = 0; i < dh.length; i++) {
      int h_check = h + dh[i];
      int w_check = w + dw[i];

      if (0 <= h_check && h_check < n && 0 <= w_check && w_check < n) {
        if (board[h][w].equals(board[h_check][w_check])) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    NeighborCell n = new NeighborCell();
    System.out.println(n.solution(
        new String[][] { { "blue", "red", "orange", "red" },
            { "red", "red", "blue", "orange" },
            { "blue", "orange", "red", "red" },
            { "orange", "orange", "red", "blue" } },
        1, 1)); // 2
  }
}