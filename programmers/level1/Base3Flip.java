/**
 * [프로그래머스] 3진법 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 * Level 1 | 월간 코드 챌린지 시즌1
 */
public class Base3Flip {
    public int solution(int n) {
      
      // 1. n을 3진법 문자열로 변환
      String base3 = Integer.toString(n, 3);

      // 2. 문자열 뒤집기
      String reversed = new StringBuilder(base3).reverse().toString();

      // 3. 3진법 문자열을 10진법으로 변환
      int answer = Integer.parseInt(reversed, 3);

      return answer;
    }
    
    public static void main(String[] args) {
        Base3Flip sol = new Base3Flip();
        
        System.out.println(sol.solution(45));  // 7
        System.out.println(sol.solution(125)); // 229
    }
}