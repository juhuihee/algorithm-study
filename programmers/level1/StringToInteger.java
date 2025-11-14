/**
 * [프로그래머스] 문자열을 정수로 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 * Level 1 | 연습문제
 */

class StringToInteger {
  public int solution(String s) {
    return Integer.parseInt(s);
  }

  public static void main(String[] args) {
    StringToInteger sol = new StringToInteger();

    // 테스트 케이스
    System.out.println(sol.solution("1234")); // 1234
    System.out.println(sol.solution("-1234")); // -1234
    System.out.println(sol.solution("+1234")); // 1234
  }
}