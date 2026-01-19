public class RSP {
  public String solution(String rsp) {
    String answer = "";

    // 방법 1: charAt 사용
    for (int i = 0; i < rsp.length(); i++) {
      char c = rsp.charAt(i); // ← 이거!

      // 이기는 값으로 변환
      if (c == '2') {
        answer += '0'; // 가위(2) → 바위(0)
      } else if (c == '0') {
        answer += '5'; // 바위(0) → 보(5)
      } else if (c == '5') {
        answer += '2'; // 보(5) → 가위(2)
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    RSP sol = new RSP();

    // 테스트 케이스 1
    String result1 = sol.solution("2");
    System.out.println(result1); // "0"
    System.out.println(result1.equals("0") ? "통과" : "실패");

    // 테스트 케이스 2
    String result2 = sol.solution("205");
    System.out.println(result2); // "052"
    System.out.println(result2.equals("052") ? "통과" : "실패");

    // 추가 테스트
    String result3 = sol.solution("0");
    System.out.println(result3); // "5"
    System.out.println(result3.equals("5") ? "통과" : "실패");

    String result4 = sol.solution("5");
    System.out.println(result4); // "2"
    System.out.println(result4.equals("2") ? "통과" : "실패");

    String result5 = sol.solution("0205");
    System.out.println(result5); // "5052"
    System.out.println(result5.equals("5052") ? "통과" : "실패");
  }
}
