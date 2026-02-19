public class LetterLength {
  public int solution(String message) {
    return message.length() * 2;
  }

  public static void main(String[] args) {
    LetterLength sol = new LetterLength();

    // 기본 테스트케이스
    System.out.println(sol.solution("hello") == 10 ? "PASS" : "FAIL"); // 5 * 2
    System.out.println(sol.solution("I love you") == 20 ? "PASS" : "FAIL"); // 10 * 2

    // 엣지 케이스
    System.out.println(sol.solution("a") == 2 ? "PASS" : "FAIL"); // 최소 길이
    System.out.println(sol.solution("") == 0 ? "PASS" : "FAIL"); // 빈 문자열
    System.out.println(sol.solution("ab cd") == 10 ? "PASS" : "FAIL"); // 공백 포함
  }
}
