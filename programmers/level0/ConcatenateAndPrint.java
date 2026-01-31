import java.io.ByteArrayInputStream;
import java.util.Scanner;
/**
 * [프로그래머스] 문자열 붙여서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181946
 * Level 0 | 연습문제
 */

public class ConcatenateAndPrint {
  public static void main(String[] args) {
    String[] testCases = {
        "hello world", // 예상 출력: helloworld
        "apple pie", // 예상 출력: applepie
        "coding test" // 예상 출력: codingtest
    };

    System.out.println("=== 테스트 시작 ===\n");

    for (int i = 0; i < testCases.length; i++) {
      System.out.println("테스트 " + (i + 1) + ": " + testCases[i]);

      // 입력 시뮬레이션
      ByteArrayInputStream in = new ByteArrayInputStream(testCases[i].getBytes());
      System.setIn(in);

      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();

      System.out.print("출력: ");
      System.out.println(a + b);
      System.out.println();

      sc.close();
    }

    System.out.println("=== 테스트 완료 ===");
  }
}
