public class NicknameRule {
  public String solution(String nickname) {
    String answer = "";
    for (int i = 0; i < nickname.length(); i++) {
      if (nickname.charAt(i) == 'l') {
        answer += "I";
      } else if (nickname.charAt(i) == 'w') {
        answer += "vv";
      } else if (nickname.charAt(i) == 'W') {
        answer += "VV";
      } else if (nickname.charAt(i) == 'O') {
        answer += "0";
      } else {
        answer += nickname.charAt(i);
      }
    }
    while (answer.length() < 4) {
      answer += "o";
    }
    if (answer.length() > 8) {
      answer = answer.substring(0, 8);
    }
    return answer;
  }

  public static void main(String[] args) {
    NicknameRule sol = new NicknameRule();

    // 테스트 케이스 1
    String test1 = "WORLDworld";
    String result1 = sol.solution(test1);
    String expected1 = "VV0RLDvv";
    System.out.println("Test 1: " + (result1.equals(expected1) ? "PASS" : "FAIL"));
    System.out.println("  Input: " + test1);
    System.out.println("  Expected: " + expected1);
    System.out.println("  Result: " + result1);
    System.out.println();

    // 테스트 케이스 2
    String test2 = "GO";
    String result2 = sol.solution(test2);
    String expected2 = "G0oo";
    System.out.println("Test 2: " + (result2.equals(expected2) ? "PASS" : "FAIL"));
    System.out.println("  Input: " + test2);
    System.out.println("  Expected: " + expected2);
    System.out.println("  Result: " + result2);
    System.out.println();

    // 추가 테스트 케이스 3 - 길이 조정 (4자 미만)
    String test3 = "a";
    String result3 = sol.solution(test3);
    String expected3 = "aooo";
    System.out.println("Test 3: " + (result3.equals(expected3) ? "PASS" : "FAIL"));
    System.out.println("  Input: " + test3);
    System.out.println("  Expected: " + expected3);
    System.out.println("  Result: " + result3);
    System.out.println();

    // 추가 테스트 케이스 4 - 길이 조정 (8자 초과)
    String test4 = "abcdefghijk";
    String result4 = sol.solution(test4);
    String expected4 = "abcdefgh";
    System.out.println("Test 4: " + (result4.equals(expected4) ? "PASS" : "FAIL"));
    System.out.println("  Input: " + test4);
    System.out.println("  Expected: " + expected4);
    System.out.println("  Result: " + result4);
    System.out.println();

    // 추가 테스트 케이스 5 - l, w, W, O 모두 포함
    String test5 = "lOwW";
    String result5 = sol.solution(test5);
    String expected5 = "I0vvVV";
    System.out.println("Test 5: " + (result5.equals(expected5) ? "PASS" : "FAIL"));
    System.out.println("  Input: " + test5);
    System.out.println("  Expected: " + expected5);
    System.out.println("  Result: " + result5);
    System.out.println();

    // 추가 테스트 케이스 6 - 치환 후 8자 초과
    String test6 = "wwwww";
    String result6 = sol.solution(test6);
    String expected6 = "vvvvvvvv";
    System.out.println("Test 6: " + (result6.equals(expected6) ? "PASS" : "FAIL"));
    System.out.println("  Input: " + test6);
    System.out.println("  Expected: " + expected6);
    System.out.println("  Result: " + result6);
    System.out.println();

    System.out.println("=== 모든 테스트 완료! ===");
  }
}
