/**
 * [프로그래머스] 짝수와 홀수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12937
 * Level 1 | 연습문제
 */
public class EvenOdd {
  // 내가 직접 푼 방법 - 삼항 연산자
    public String solution(int num) {
      return (num % 2 == 0) ? "Even" : "Odd";
    }

    // 참고: if-else 방식
    public String solution2(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        EvenOdd sol = new EvenOdd();
        
        // 테스트 케이스
        System.out.println(sol.solution(3));  // "Odd"
        System.out.println(sol.solution(4));  // "Even"
        System.out.println(sol.solution(0));  // "Even" (0은 짝수!)
        System.out.println(sol.solution(-1)); // "Odd"
        System.out.println(sol.solution(-2)); // "Even"

        System.out.println("\n=== solution2() ===");
        System.out.println(sol.solution2(3));  // "Odd"
        System.out.println(sol.solution2(4));  // "Even"
    }
}