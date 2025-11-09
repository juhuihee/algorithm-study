/**
 * [프로그래머스] 신규 아이디 추천
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 * Level 1 | 2021 카카오 신입 공채
 */
public class NewIdRecommendation {
    
    public String solution(String new_id) {
      // 1단계: 소문자로 치환
      String result = new_id.toLowerCase();

      // 2단계: 특정 문자만 남기기
      result = result.replaceAll("[^a-z0-9-_.]", "");
      
      // 3단계: .. → .
      while (result.contains("..")) {
        result = result.replace("..", ".");
      }
      
      // 4단계: 처음/끝 . 제거
      if (!result.isEmpty() && result.startsWith(".")) {
        result = result.substring(1);
      }
      if (!result.isEmpty() && result.endsWith(".")) {
        result = result.substring(0, result.length() - 1);
      }
      
      // 5단계: 빈 문자열이면 "a"
      if (result.isEmpty()) {
        result = "a";
      }

      // 6단계: 15자 제한 + 끝 . 제거
      if (result.length() >= 16) {
        result = result.substring(0,15);
        if (result.endsWith(".")) {
          result = result.substring(0, 14);
        }
      }

      // 7단계: 2자 이하면 마지막 문자 반복
      while (result.length() <= 2) {
        result += result.charAt(result.length() - 1);
      }
      
      return result;
    }
    
    public static void main(String[] args) {
        NewIdRecommendation s = new NewIdRecommendation();
        
        // 테스트 케이스
        System.out.println(s.solution("...!@BaT#*..y.abcdefghijklm")); 
        // 예상: "bat.y.abcdefghi"
        
        System.out.println(s.solution("z-+.^.")); 
        // 예상: "z--"
        
        System.out.println(s.solution("=.=")); 
        // 예상: "aaa"
        
        System.out.println(s.solution("123_.def")); 
        // 예상: "123_.def"
        
        System.out.println(s.solution("abcdefghijklmn.p")); 
        // 예상: "abcdefghijklmn"
    }
}