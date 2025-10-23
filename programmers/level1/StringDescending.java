/**
 * [프로그래머스] 문자열 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 * Level 1 | 문자열 정렬
 */

import java.util.Arrays;

public class StringDescending {
    // for문 역순
    public String solution(String s) {

        char[] arr = s.toCharArray(); // 문자열을 문자배열로 변환
        Arrays.sort(arr); // 정렬

        String answer = "";
        for(int i = arr.length - 1; i >= 0; i--){ // 역순으로 만들기
          answer += arr[i]; // 매번 새로운 String 객체 생성
        }

        return answer;
    }

    // StringBuilder
    public String solution2(String s){
      char[] arr = s.toCharArray();
      Arrays.sort(arr);

      StringBuilder sb = new StringBuilder(new String(arr));
      sb.reverse(); // 내부 배열만 뒤집음

      String answer = sb.toString();
      return answer;
    }

    // 메서드 체이닝(간결하게)
    public String solution3(String s){
      char[] arr = s.toCharArray();
      Arrays.sort(arr);

      return new StringBuilder(new String(arr)).reverse().toString();
    }
    
    public static void main(String[] args) {
    StringDescending sol = new StringDescending();
    
    // 기본 테스트
    System.out.println(sol.solution("Zbcdefg"));  // "gfedcbZ"
    System.out.println(sol.solution("abce"));      // "ecba"
    
    // 추가 테스트
    System.out.println(sol.solution("z"));         // "z" (문자 1개)
    System.out.println(sol.solution("ZzAa"));      // "zaZA" (대소문자 섞임)
    System.out.println(sol.solution("abcABC"));    // "cbaCBA"
    
    // solution2, solution3도 테스트
    System.out.println("\n=== solution2 ===");
    System.out.println(sol.solution2("Zbcdefg")); // "gfedcbZ"
    
    System.out.println("\n=== solution3 ===");
    System.out.println(sol.solution3("Zbcdefg")); // "gfedcbZ"
  }
}