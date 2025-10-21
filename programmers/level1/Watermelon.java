/**
 * [프로그래머스] 수박수박수박수박수박수?
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 * Level 1 | 연습문제
 */

public class Watermelon {
    
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
          if(i % 2 == 0) {
            sb.append("수");
          } else {
            sb.append("박");
          }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Watermelon wm = new Watermelon();
        
        // 테스트 케이스 1
        System.out.println(wm.solution(3));
        // 예상 출력: 수박수
        
        // 테스트 케이스 2
        System.out.println(wm.solution(4));
        // 예상 출력: 수박수박
        
        // 테스트 케이스 3 (추가)
        System.out.println(wm.solution(1));
        // 예상 출력: 수
        
        // 테스트 케이스 4 (추가)
        System.out.println(wm.solution(10));
        // 예상 출력: 수박수박수박수박수박
    }
}