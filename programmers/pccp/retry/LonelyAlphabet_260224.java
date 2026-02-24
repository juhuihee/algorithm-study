package retry;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class LonelyAlphabet_260224 {
  public String solution(String input_string) {
    char[] arr = input_string.toCharArray();

    HashMap<Character, Integer> groupCount = new HashMap<>();

    char prev = arr[0];
    groupCount.put(prev, 1);

    for (int i = 1; i < arr.length; i++) {
      char cur = arr[i];

      if (cur != prev) {
        groupCount.put(cur, groupCount.getOrDefault(cur, 0) + 1);
      }

      prev = cur;
    }

    ArrayList<Character> lonely = new ArrayList<>();
    for (char key : groupCount.keySet()) {
      if (groupCount.get(key) >= 2) {
        lonely.add(key);
      }
    }

    Collections.sort(lonely);

    if (lonely.isEmpty()) {
      return "N";
    } else {
      StringBuilder sb = new StringBuilder();
      for (char c : lonely) {
        sb.append(c);
      }
      return sb.toString();
    }
  }

  public static void main(String[] args) {
    LonelyAlphabet_260224 la = new LonelyAlphabet_260224();

    // 테스트 케이스 1
    String test1 = "edeaaabbccd";
    String result1 = la.solution(test1);
    System.out.println("Test 1: " + test1);
    System.out.println("Result: " + result1);
    System.out.println("Expected: de");
    System.out.println("Pass: " + result1.equals("de"));
    System.out.println();

    // 테스트 케이스 2
    String test2 = "eeddee";
    String result2 = la.solution(test2);
    System.out.println("Test 2: " + test2);
    System.out.println("Result: " + result2);
    System.out.println("Expected: e");
    System.out.println("Pass: " + result2.equals("e"));
    System.out.println();

    // 테스트 케이스 3
    String test3 = "string";
    String result3 = la.solution(test3);
    System.out.println("Test 3: " + test3);
    System.out.println("Result: " + result3);
    System.out.println("Expected: N");
    System.out.println("Pass: " + result3.equals("N"));
    System.out.println();

    // 테스트 케이스 4
    String test4 = "zbzbz";
    String result4 = la.solution(test4);
    System.out.println("Test 4: " + test4);
    System.out.println("Result: " + result4);
    System.out.println("Expected: bz");
    System.out.println("Pass: " + result4.equals("bz"));
  }
}
