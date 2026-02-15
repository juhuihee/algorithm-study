package retry;

/**
 * [프로그래머스] k번째 수
 * https://school.programmers.co.kr/learn/courses/30/lessons//42748
 * Level 1 | 연습문제
 */
import java.util.Arrays;

public class KthNumber_260215 {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int idx = 0; idx < commands.length; idx++) {
      int i = commands[idx][0];
      int j = commands[idx][1];
      int k = commands[idx][2];

      // 1. i부터 j까지 자르기 (i-1부터 j까지, j는 포함 안 됨)
      int[] temp = Arrays.copyOfRange(array, i - 1, j);

      // 2. 정렬
      Arrays.sort(temp);

      // 3. k번째 값 (k-1번째 인덱스)
      answer[idx] = temp[k - 1];
    }
    return answer;
  }

  public static void main(String[] args) {
    KthNumber_260215 sol = new KthNumber_260215();

    // 테스트 케이스 1
    int[] array1 = { 1, 5, 2, 6, 3, 7, 4 };
    int[][] commands1 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
    int[] result1 = sol.solution(array1, commands1);
    int[] expected1 = { 5, 6, 3 };

    System.out.println("Test 1:");
    System.out.println("Result:   " + Arrays.toString(result1));
    System.out.println("Expected: " + Arrays.toString(expected1));
    System.out.println("Pass: " + Arrays.equals(result1, expected1));
    System.out.println();

    // 테스트 케이스 2 (직접 추가)
    int[] array2 = { 3, 1, 4, 1, 5, 9, 2, 6 };
    int[][] commands2 = { { 1, 3, 2 }, { 2, 6, 4 }, { 5, 8, 3 } };
    int[] result2 = sol.solution(array2, commands2);
    // commands2 설명:
    // {1,3,2}: [3,1,4] → [1,3,4] → 2번째 = 3
    // {2,6,4}: [1,4,1,5,9] → [1,1,4,5,9] → 4번째 = 5
    // {5,8,3}: [5,9,2,6] → [2,5,6,9] → 3번째 = 6
    int[] expected2 = { 3, 5, 6 };

    System.out.println("Test 2:");
    System.out.println("Result:   " + Arrays.toString(result2));
    System.out.println("Expected: " + Arrays.toString(expected2));
    System.out.println("Pass: " + Arrays.equals(result2, expected2));
    System.out.println();

    // 테스트 케이스 3 (엣지 케이스: 원소 1개)
    int[] array3 = { 10, 20, 30, 40, 50 };
    int[][] commands3 = { { 3, 3, 1 }, { 1, 1, 1 }, { 5, 5, 1 } };
    int[] result3 = sol.solution(array3, commands3);
    int[] expected3 = { 30, 10, 50 };

    System.out.println("Test 3 (Edge Case - Single Element):");
    System.out.println("Result:   " + Arrays.toString(result3));
    System.out.println("Expected: " + Arrays.toString(expected3));
    System.out.println("Pass: " + Arrays.equals(result3, expected3));
  }
}
