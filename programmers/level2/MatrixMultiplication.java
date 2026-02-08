package level2;
/**
 * [프로그래머스] 행렬의 곱셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12949
 * Level 2 | 연습문제
 */

public class MatrixMultiplication {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int r1 = arr1.length;
    int c1 = arr1[0].length;
    int r2 = arr2.length;
    int c2 = arr2[0].length;

    int[][] answer = new int[r1][c2];

    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        for (int k = 0; k < c1; k++) {
          answer[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    MatrixMultiplication sol = new MatrixMultiplication();
    // 테스트 1
    int[][] arr1_1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
    int[][] arr2_1 = { { 3, 3 }, { 3, 3 } };
    int[][] result1 = sol.solution(arr1_1, arr2_1);
    System.out.println("Test 1:");
    printMatrix(result1);
    // 예상: [[15, 15], [15, 15], [15, 15]]

    // 테스트 2
    int[][] arr1_2 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
    int[][] arr2_2 = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } };
    int[][] result2 = sol.solution(arr1_2, arr2_2);
    System.out.println("\nTest 2:");
    printMatrix(result2);
    // 예상: [[22, 22, 11], [36, 28, 18], [29, 20, 14]]

    // 테스트 3 - 1x3 * 3x1 = 1x1
    int[][] arr1_3 = { { 1, 2, 3 } };
    int[][] arr2_3 = { { 4 }, { 5 }, { 6 } };
    int[][] result3 = sol.solution(arr1_3, arr2_3);
    System.out.println("\nTest 3:");
    printMatrix(result3);
    // 예상: [[32]]

    // 테스트 4 - 2x2 * 2x2 = 2x2
    int[][] arr1_4 = { { 1, 0 }, { 0, 1 } };
    int[][] arr2_4 = { { 5, 6 }, { 7, 8 } };
    int[][] result4 = sol.solution(arr1_4, arr2_4);
    System.out.println("\nTest 4:");
    printMatrix(result4);
    // 예상: [[5, 6], [7, 8]] (단위행렬)
  }

  // 행렬 출력 헬퍼 메서드
  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      System.out.print("[");
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
        if (j < matrix[i].length - 1) {
          System.out.print(", ");
        }
      }
      System.out.println("]");
    }
  }
}
