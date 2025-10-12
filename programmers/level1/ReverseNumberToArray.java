/**
 * [프로그래머스] 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * Level 1 | 연습문제
 */

class ReverseNumberToArray {
    // 방법 1: 숫자 연산 방식
    public int[] solution(long n) {
        int size = String.valueOf(n).length();
        int[] answer = new int[size];
        int index = 0;
        
        while (n > 0) {
            answer[index] = (int)(n % 10);
            n /= 10;
            index++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        ReverseNumberToArray sol = new ReverseNumberToArray();
        
        // 테스트 케이스 1
        long n1 = 12345;
        int[] result1 = sol.solution(n1);
        System.out.println("테스트 1:");
        System.out.println("n = " + n1);
        System.out.print("결과: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("예상: 5 4 3 2 1");
        
        // 배열 비교
        int[] expected1 = {5, 4, 3, 2, 1};
        boolean pass1 = java.util.Arrays.equals(result1, expected1);
        System.out.println("통과: " + (pass1 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 2
        long n2 = 987654321;
        int[] result2 = sol.solution(n2);
        System.out.println("테스트 2:");
        System.out.println("n = " + n2);
        System.out.print("결과: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("예상: 1 2 3 4 5 6 7 8 9");
        
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean pass2 = java.util.Arrays.equals(result2, expected2);
        System.out.println("통과: " + (pass2 ? "PASS" : "FAIL"));
    }
}