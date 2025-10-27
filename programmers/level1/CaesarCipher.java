/**
 * [프로그래머스] 시저 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * Level 1 | 연습문제
 */
public class CaesarCipher {
    
    public String solution(String s, int n) {
      StringBuilder answer = new StringBuilder();

      for(char c : s.toCharArray()) { // 문자열을 char 배열로 변환
        if(c == ' ') {
          answer.append(c); // 공백은 그대로
        }
        else if(Character.isUpperCase(c)) { // 대문자 확인
          char newChar = (char)((c - 'A' + n) % 26 + 'A'); // 대문자 처리: 'A' ~ 'Z' 범위에서 n만큼 밀기
          answer.append(newChar);
        }
        else {
          char newChar = (char)((c - 'a' + n) % 26 + 'a'); // 소문자 처리: 'a' ~ 'z' 범위에서 n만큼 밀기
          answer.append(newChar);
        }
      }

      return answer.toString();
    }
    
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        
        // 테스트 케이스
        System.out.println(cc.solution("AB", 1));      // "BC"
        System.out.println(cc.solution("z", 1));       // "a"
        System.out.println(cc.solution("a B z", 4));   // "e F d"
        System.out.println(cc.solution("Z", 1));       // "A"
        System.out.println(cc.solution("XYZ", 3));     // "ABC"
    }
}