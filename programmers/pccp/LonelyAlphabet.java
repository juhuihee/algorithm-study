// [PCCP 모의고사 1회 - 1번] 외톨이 알파벳
// https://school.programmers.co.kr/tryouts (PCCP 모의고사)
// Level: PCCP 모의고사
// 알고리즘: HashMap, 문자열 그룹화

import java.util.*;

public class LonelyAlphabet {

  public String solution(String inputString) {
    // 1. 문자열을 문자 배열로 변환
    char[] arr = inputString.toCharArray();

    // 2. 각 알파벳의 그룹 개수 저장 (키: 알파벳, 값: 그룹 수)
    HashMap<Character, Integer> groupCount = new HashMap<>();

    // 3. 첫 문자는 무조건 1개 그룹으로 시작
    char prev = arr[0];
    groupCount.put(prev, 1);

    // 4. 두 번째 문자부터 순회하며 그룹 카운트
    for (int i = 1; i < arr.length; i++) {
      char current = arr[i];

      // 이전 문자와 다르면 새로운 그룹 시작
      if (current != prev) {
        groupCount.put(current, groupCount.getOrDefault(current, 0) + 1);
      }
      // 같으면 아무것도 안 함 (같은 그룹 계속)

      prev = current; // 이전 문자 업데이트
    }

    // 5. 그룹이 2개 이상인 알파벳 찾기 (외톨이 알파벳)
    ArrayList<Character> lonely = new ArrayList<>();
    for (char key : groupCount.keySet()) {
      if (groupCount.get(key) >= 2) {
        lonely.add(key);
      }
    }

    // 6. 알파벳 순으로 정렬
    Collections.sort(lonely);

    // 7. 결과 출력
    if (lonely.isEmpty()) {
      return "N"; // 외톨이 알파벳 없음
    } else {
      StringBuilder sb = new StringBuilder();
      for (char c : lonely) {
        sb.append(c);
      }
      return sb.toString();
    }
  }

  // 테스트 코드
  public static void main(String[] args) {
    LonelyAlphabet la = new LonelyAlphabet();

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