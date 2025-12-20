
/**
 * [프로그래머스] - 덧셈식 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181947
 * Lv.0 | 연습문제 
 */

import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class PrintAddition {
    // 프로그래머스 제출용
    public static class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;

            System.out.println(a + " + " + b + " = " + c);
        }
    }

    // 테스트용 main
    public static void main(String[] args) {
        System.out.println("=== 테스트 시작 ===\n");

        // 테스트 케이스 1: 4 5
        test("4 5", "4 + 5 = 9");

        // 테스트 케이스 2: 10 20
        test("10 20", "10 + 20 = 30");

        // 테스트 케이스 3: 0 0
        test("0 0", "0 + 0 = 0");

        // 테스트 케이스 4: 100 200
        test("100 200", "100 + 200 = 300");

        System.out.println("\n=== 테스트 완료 ===");
    }

    // 테스트 헬퍼 함수
    private static void test(String input, String expected) {
        System.out.println("입력: " + input);
        System.out.print("출력: ");

        // System.in을 테스트 입력으로 변경
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Solution 실행
        Solution.main(null);

        System.out.println("예상: " + expected);
        System.out.println();
    }
}