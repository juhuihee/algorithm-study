/**
 * [프로그래머스] 이상한 문자 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * Level 1 | 문자열 변환
 */

public class WeirdString {
  // 1차 시도 로컬테스트 통과, 프로그래머스 실패 - 다른 테스트 케이스 통과 못함
  public String solution(String s) {
    String answer = "";
    String[] words = s.split(" ");

    for(String word : words){
      for(int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);

        if(i % 2 == 0){
          // 짝수 : 대문자
          answer += Character.toUpperCase(c);
        } else {
          // 홀수 : 소문자
          answer += Character.toLowerCase(c);
        }
      }
      answer += " "; // 단어 사이 공백
    }
    // 마지막 공백 제거
    answer = answer.trim();
        
    return answer;
  }

  // 2차 해결 - 한 글자씩 처리
    public String solution2(String s) {
        String answer = "";
        int idx = 0;  // 단어 내 인덱스
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer += ' ';
                idx = 0;  // 공백 만나면 인덱스 리셋
            } else {
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
      WeirdString sol = new WeirdString();

      // 테스트 케이스
      System.out.println("=== solution (처음 버전) ===");
        System.out.println(sol.solution("try hello world")); // "TrY HeLlO WoRlD"
        System.out.println(sol.solution("a b c"));            // "A B C"
        System.out.println(sol.solution("a  b"));             // "A B" (공백 1개만!)
        System.out.println(sol.solution("a   b"));            // "A B" (공백 1개만!)
        
        System.out.println("\n=== solution2 (성공 버전) ===");
        System.out.println(sol.solution2("try hello world")); // "TrY HeLlO WoRlD"
        System.out.println(sol.solution2("a b c"));            // "A B C"
        System.out.println(sol.solution2("a  b"));             // "A  B" (공백 2개 유지!)
        System.out.println(sol.solution2("a   b"));            // "A   B" (공백 3개 유지!)
  }
}