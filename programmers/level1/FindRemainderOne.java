/**
 * [프로그래머스] 나머지가 1이 되는 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * Level 1 | 연습문제
 */

public class FindRemainderOne {
  public int solution(int n) {
        for(int i = 2; i <= n; i++){
          if(n % i == 1){
            return i;
          }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        FindRemainderOne sol = new FindRemainderOne();
        
        // 테스트 케이스
        System.out.println(sol.solution(10)); // 3
        System.out.println(sol.solution(12)); // 11
    }
}
