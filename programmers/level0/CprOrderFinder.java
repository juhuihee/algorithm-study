/**
 * [프로그래머스] PCCE 기출문제 5번 / 심폐소생술
 * https://school.programmers.co.kr/learn/courses/30/lessons/340203
 * Level 0 | 연습문제
 */
public class CprOrderFinder {
  public static int[] solution(String[] cpr) {
    int[] answer = { 0, 0, 0, 0, 0 };
    String[] basicOrder = { "check", "call", "pressure", "respiration", "repeat" };

    for (int i = 0; i < cpr.length; i++) {
      for (int j = 0; j < basicOrder.length; j++) {
        if (cpr[i].equals(basicOrder[j])) {
          answer[i] = j + 1; // 순서는 1부터
          break;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    // 테스트 케이스 1
    String[] cpr1 = { "call", "respiration", "repeat", "check", "pressure" };
    int[] result1 = solution(cpr1);
    int[] expected1 = { 2, 4, 5, 1, 3 };

    System.out.println("=== 테스트 1 ===");
    System.out.print("입력: ");
    printArray(cpr1);
    System.out.print("결과: ");
    printArray(result1);
    System.out.print("정답: ");
    printArray(expected1);
    System.out.println("통과: " + checkResult(result1, expected1));
    System.out.println();

    // 테스트 케이스 2
    String[] cpr2 = { "pressure", "check", "call", "respiration", "repeat" };
    int[] result2 = solution(cpr2);
    int[] expected2 = { 3, 1, 2, 4, 5 };

    System.out.println("=== 테스트 2 ===");
    System.out.print("입력: ");
    printArray(cpr2);
    System.out.print("결과: ");
    printArray(result2);
    System.out.print("정답: ");
    printArray(expected2);
    System.out.println("통과: " + checkResult(result2, expected2));
    System.out.println();

    // 테스트 케이스 3 (정순서)
    String[] cpr3 = { "check", "call", "pressure", "respiration", "repeat" };
    int[] result3 = solution(cpr3);
    int[] expected3 = { 1, 2, 3, 4, 5 };

    System.out.println("=== 테스트 3 (정순서) ===");
    System.out.print("입력: ");
    printArray(cpr3);
    System.out.print("결과: ");
    printArray(result3);
    System.out.print("정답: ");
    printArray(expected3);
    System.out.println("통과: " + checkResult(result3, expected3));
  }

  // 배열 출력 헬퍼
  private static void printArray(String[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1)
        System.out.print(", ");
    }
    System.out.println("]");
  }

  private static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1)
        System.out.print(", ");
    }
    System.out.println("]");
  }

  // 결과 비교 헬퍼
  private static boolean checkResult(int[] result, int[] expected) {
    if (result.length != expected.length)
      return false;
    for (int i = 0; i < result.length; i++) {
      if (result[i] != expected[i])
        return false;
    }
    return true;
  }
}
