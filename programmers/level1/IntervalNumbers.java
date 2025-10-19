/**
 * [프로그래머스] x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 * Level 1 | 연습문제
 */

public class IntervalNumbers {
    
    public long[] solution(int x, int n) {
      long[] answer = new long[n];

      for(int i = 0; i < n; i++){
        answer[i] = (long) x * (i + 1);
      }

      return answer;

    }
    
    public static void main(String[] args) {
        IntervalNumbers sol = new IntervalNumbers();
        
        // 테스트 케이스 1
        long[] result1 = sol.solution(2, 5);
        System.out.print("Test 1: ");
        printArray(result1);
        System.out.println("Expected: [2, 4, 6, 8, 10]");
        System.out.println();
        
        // 테스트 케이스 2
        long[] result2 = sol.solution(4, 3);
        System.out.print("Test 2: ");
        printArray(result2);
        System.out.println("Expected: [4, 8, 12]");
        System.out.println();
        
        // 테스트 케이스 3
        long[] result3 = sol.solution(-4, 2);
        System.out.print("Test 3: ");
        printArray(result3);
        System.out.println("Expected: [-4, -8]");
        System.out.println();
        
        // 추가 테스트
        long[] result4 = sol.solution(10000000, 3);
        System.out.print("Test 4: ");
        printArray(result4);
        System.out.println("Expected: [10000000, 20000000, 30000000]");
    }
    
    // 배열 출력 헬퍼 메서드
    public static void printArray(long[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}