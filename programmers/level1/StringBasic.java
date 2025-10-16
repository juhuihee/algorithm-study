/**
 * [프로그래머스] 문자열 다루기 기본
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * Level 1 | 연습문제
 */

public class StringBasic {
   public boolean solution(String s) {
        int len = s.length();
        int count = 0;
        
        if(len == 4 || len == 6){
          for(int i = 0; i < len; i++){
            if(Character.isDigit(s.charAt(i))){
              count ++;
            }
          }
        }
        
        return (count == len);
    }
    
    public static void main(String[] args) {
        StringBasic sol = new StringBasic();
        
        // 테스트 케이스
        System.out.println(sol.solution("a234"));  // false
        System.out.println(sol.solution("1234"));  // true
        System.out.println(sol.solution("12345")); // false (길이 5)
        System.out.println(sol.solution("123456")); // true
        System.out.println(sol.solution("12a456")); // false
    }
}
