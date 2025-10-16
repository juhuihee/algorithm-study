/**
 * [프로그래머스] 문자열 다루기 기본
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * Level 1 | 연습문제
 */

public class StringBasic {
  // 내가 직접 푼 방법
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

    // 참고: 조기 종료 방식
    public boolean solution2(String s) {
        int len = s.length();
        
        if(len != 4 && len != 6) {
            return false;
        }
        
        for(int i = 0; i < len; i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        
        return true;
    }
    
    // 참고: 정규표현식 사용
    public boolean solution3(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("\\d+");
    }
    
    public static void main(String[] args) {
        StringBasic sol = new StringBasic();
        
        // 테스트 케이스
        System.out.println(sol.solution("a234"));  // false
        System.out.println(sol.solution("1234"));  // true
        System.out.println(sol.solution("12345")); // false (길이 5)
        System.out.println(sol.solution("123456")); // true
        System.out.println(sol.solution("12a456")); // false

        System.out.println("\n=== solution2() ===");
        System.out.println(sol.solution2("1234"));  // true
        System.out.println(sol.solution2("a234"));  // false
    
        System.out.println("\n=== solution3() ===");
        System.out.println(sol.solution3("1234"));  // true
        System.out.println(sol.solution3("a234"));  // false
    }
}
