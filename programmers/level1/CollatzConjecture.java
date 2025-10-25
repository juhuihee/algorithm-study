/**
 * [프로그래머스] 콜라츠 추측
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 * Level 1 | 연습문제
 */
public class CollatzConjecture {
    
    public int solution(int num) {
        long n = num;  // int 오버플로우 방지를 위해 long 사용
        int count = 0;
        
        while(n != 1) {
            if(count >= 500) {  // 500번 넘으면 -1 반환
                return -1;
            }
            
            if(n % 2 == 0) {  // 짝수면
                n /= 2;        // 2로 나누기
            } else {           // 홀수면
                n = n * 3 + 1; // 3 곱하고 1 더하기
            }
            
            count++;  // 작업 횟수 증가
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        CollatzConjecture cc = new CollatzConjecture();
        
        // 테스트 케이스
        System.out.println(cc.solution(6));       // 8
        System.out.println(cc.solution(16));      // 4
        System.out.println(cc.solution(626331));  // -1
        System.out.println(cc.solution(1));       // 0
    }
}