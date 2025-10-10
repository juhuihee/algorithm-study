/**
 * [프로그래머스] 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * Level 1 | 연습문제
 */

public class SumOfDigits {
  // 방법 1: String 변환 방식
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }
        
        return answer;
    }
    
    // 방법 2: 숫자 연산 방식
    public int solutionWithMath(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        SumOfDigits sol = new SumOfDigits();
        
        // 테스트 케이스 1
        int n1 = 123;
        int result1 = sol.solution(n1);
        int result1Math = sol.solutionWithMath(n1);
        System.out.println("테스트 1:");
        System.out.println("n = " + n1);
        System.out.println("String 방식 결과: " + result1);
        System.out.println("Math 방식 결과: " + result1Math);
        System.out.println("예상: 6");
        System.out.println("통과: " + (result1 == 6 && result1Math == 6 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 2
        int n2 = 987;
        int result2 = sol.solution(n2);
        int result2Math = sol.solutionWithMath(n2);
        System.out.println("테스트 2:");
        System.out.println("n = " + n2);
        System.out.println("String 방식 결과: " + result2);
        System.out.println("Math 방식 결과: " + result2Math);
        System.out.println("예상: 24");
        System.out.println("통과: " + (result2 == 24 && result2Math == 24 ? "PASS" : "FAIL"));
    }
}
