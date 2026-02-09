package level2;

/**
 * [프로그래머스] 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * Level 2 | 연습문제
 */
public class CarpetDimensions {
  public int[] solution(int brown, int yellow) {
    int totalSize = brown + yellow;
    int sqrt = (int) Math.sqrt(totalSize);
    for (int vertical = 3; vertical <= sqrt; vertical++) {
      if (totalSize % vertical == 0) {
        int horizontal = (int) (totalSize / vertical);
        if (brown == (horizontal + vertical - 2) * 2) {
          return new int[] { horizontal, vertical };
        }
      }
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    CarpetDimensions cd = new CarpetDimensions();

    // Test Case 1: brown=10, yellow=2 → [4, 3]
    int[] result1 = cd.solution(10, 2);
    System.out.println("Test 1: [4, 3] → " +
        (result1[0] == 4 && result1[1] == 3 ? "PASS" : "FAIL"));
    System.out.println("  Expected: [4, 3], Got: [" + result1[0] + ", " + result1[1] + "]");

    // Test Case 2: brown=8, yellow=1 → [3, 3]
    int[] result2 = cd.solution(8, 1);
    System.out.println("Test 2: [3, 3] → " +
        (result2[0] == 3 && result2[1] == 3 ? "PASS" : "FAIL"));
    System.out.println("  Expected: [3, 3], Got: [" + result2[0] + ", " + result2[1] + "]");

    // Test Case 3: brown=24, yellow=24 → [8, 6]
    int[] result3 = cd.solution(24, 24);
    System.out.println("Test 3: [8, 6] → " +
        (result3[0] == 8 && result3[1] == 6 ? "PASS" : "FAIL"));
    System.out.println("  Expected: [8, 6], Got: [" + result3[0] + ", " + result3[1] + "]");

    // Additional Test: brown=12, yellow=4 → [5, 4]
    int[] result4 = cd.solution(12, 4);
    System.out.println("Test 4: [5, 4] → " +
        (result4[0] == 5 && result4[1] == 4 ? "PASS" : "FAIL"));
    System.out.println("  Expected: [5, 4], Got: [" + result4[0] + ", " + result4[1] + "]");

    // Edge Test: brown=14, yellow=4 → [6, 3]
    int[] result5 = cd.solution(14, 4);
    System.out.println("Test 5: [6, 3] → " +
        (result5[0] == 6 && result5[1] == 3 ? "PASS" : "FAIL"));
    System.out.println("  Expected: [6, 3], Got: [" + result5[0] + ", " + result5[1] + "]");
  }
}
