/**
 * [프로그래머스] 행렬의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12950
 * Level 1 | 연습문제
 */

public class AddMatrix {

  public int[][] solution(int[][] arr1, int[][] arr2) {
    // arr1의 행 개수: arr1.length
    // arr1의 열 개수: arr1[0].length

    // 결과를 담을 2차원 배열 생성
    int[][] answer = new int[arr1.length][arr1[0].length];

    for (int i = 0; i < arr1.length; i++) { // 행
      for (int j = 0; j < arr1[0].length; j++) { // 열
        // 같은 위치끼리 더해서 저장
        answer[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    AddMatrix sol = new AddMatrix();

    // 테스트 케이스 1
    int[][] result1 = sol.solution(
        new int[][] { { 1, 2 }, { 2, 3 } },
        new int[][] { { 3, 4 }, { 5, 6 } });
    // [[4, 6], [7, 9]]
    for (int[] row : result1) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    System.out.println("---");

    // 테스트 케이스 2
    int[][] result2 = sol.solution(
        new int[][] { { 1 }, { 2 } },
        new int[][] { { 3 }, { 4 } });
    // [[4], [6]]
    for (int[] row : result2) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}