/**
 * [프로그래머스] 가운데 글자 가져오기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * Level 1 | 문자열
 */

class GetMiddleChar {
    public String solution(String s) {
        if(s.length() % 2 == 0){
          return s.substring(s.length()/2-1, s.length()/2+1);
        } else {
          return s.substring(s.length()/2, s.length()/2+1);
        }
    }
    
    public String solution2(String s){
      int length = s.length();
      int middle = length / 2;

      if(length % 2 == 0){
        return s.substring(middle - 1, middle + 1); // 짝수 : 2글자
      } else {
        return s.substring(middle, middle + 1); // 홀수 : 1글자
      }
    }

    public String solution3(String s){
      int middle = s.length() / 2;
      return s.length() % 2 == 0 ? s.substring(middle - 1, middle + 1) : s.substring(middle, middle + 1);
    }

    public String solution4(String s){
      int middle = s.length() / 2;

      if(s.length() % 2 == 0){
        return s.substring(middle - 1, middle + 1);
      } else {
        return String.valueOf(s.charAt(middle)); // char -> String
        // 또는
        // return s.substring(middle, middle + 1);
      }
    }
    public static void main(String[] args) {
        GetMiddleChar sol = new GetMiddleChar();
        
        // solution 테스트
        System.out.println("=== solution ===");
        System.out.println(sol.solution("abcde"));  // "c"
        System.out.println(sol.solution("qwer"));   // "we"
        
        // solution2 테스트
        System.out.println("\n=== solution2 ===");
        System.out.println(sol.solution2("abcde")); // "c"
        System.out.println(sol.solution2("qwer"));  // "we"
        
        // solution3 테스트
        System.out.println("\n=== solution3 ===");
        System.out.println(sol.solution3("abcde")); // "c"
        System.out.println(sol.solution3("qwer"));  // "we"
        
        // solution4 테스트
        System.out.println("\n=== solution4 ===");
        System.out.println(sol.solution4("abcde")); // "c"
        System.out.println(sol.solution4("qwer"));  // "we"
    }
}