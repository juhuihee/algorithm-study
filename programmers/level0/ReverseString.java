/**
 * [프로그래머스] 배열 원소의 길이
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 * Level 0 | 연습문제
 */
public class ReverseString {
  public String solution(String my_string) {
    String answer = "";

    for (int i = my_string.length() - 1; i >= 0; i--) {
      answer += my_string.charAt(i);
    }
    return answer;
  }

  public static void main(String[] args) {
    ReverseString sol = new ReverseString();

    // 테스트 1
    String result1 = sol.solution("jaron");
    System.out.println("Input: jaron");
    System.out.println("Result: " + result1);
    System.out.println("Expected: noraj");
    System.out.println("Pass: " + result1.equals("noraj"));
    System.out.println();

    // 테스트 2
    String result2 = sol.solution("bread");
    System.out.println("Input: bread");
    System.out.println("Result: " + result2);
    System.out.println("Expected: daerb");
    System.out.println("Pass: " + result2.equals("daerb"));
  }
}
