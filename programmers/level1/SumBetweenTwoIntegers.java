/**
 * [프로그래머스] 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 * Level 1 | 연습문제
 */

public class SumBetweenTwoIntegers {
  public long solution(int a, int b) {
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        SumBetweenTwoIntegers sol = new SumBetweenTwoIntegers();
        
        // 테스트 케이스 1
        int a1 = 3;
        int b1 = 5;
        long result1 = sol.solution(a1, b1);
        System.out.println("테스트 1:");
        System.out.println("a = " + a1 + ", b = " + b1);
        System.out.println("결과: " + result1);
        System.out.println("예상: 12");
        System.out.println("통과: " + (result1 == 12 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 2
        int a2 = 3;
        int b2 = 3;
        long result2 = sol.solution(a2, b2);
        System.out.println("테스트 2:");
        System.out.println("a = " + a2 + ", b = " + b2);
        System.out.println("결과: " + result2);
        System.out.println("예상: 3");
        System.out.println("통과: " + (result2 == 3 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 3
        int a3 = 5;
        int b3 = 3;
        long result3 = sol.solution(a3, b3);
        System.out.println("테스트 3:");
        System.out.println("a = " + a3 + ", b = " + b3);
        System.out.println("결과: " + result3);
        System.out.println("예상: 12");
        System.out.println("통과: " + (result3 == 12 ? "PASS" : "FAIL"));
    }
}
