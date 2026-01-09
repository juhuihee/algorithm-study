package level2;

/**
 * [프로그래머스] 네트워크
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162
 * Level 2 | 깊이/너비 우선 탐색(DFS/BFS)
 */
public class Network {
  static class Solution {
    int n;
    int[][] computers;
    boolean[] visited;

    public int solution(int n, int[][] computers) {
      this.n = n;
      this.computers = computers;
      this.visited = new boolean[n];

      int answer = 0;

      for (int i = 0; i < n; i++) {
        if (!visited[i]) {
          dfs(i);
          answer++;
        }
      }
      return answer;
    }

    void dfs(int computer) {
      visited[computer] = true;

      for (int i = 0; i < n; i++) {
        if (computers[computer][i] == 1 && !visited[i]) {
          dfs(i);
        }
      }
    }
  }

  public static void main(String[] args) {
    Solution sol = new Solution(); // 한 번만 생성!

    // 테스트 1
    int[][] computers1 = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
    int result1 = sol.solution(3, computers1);
    System.out.println("테스트 1: " + result1 + " (정답: 2)");

    // 테스트 2 (같은 객체 재사용!)
    int[][] computers2 = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
    int result2 = sol.solution(3, computers2);
    System.out.println("테스트 2: " + result2 + " (정답: 1)");
  }
}