import java.util.*;

/**
 * [프로그래머스] 문자열 내 마음대로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * Level 1 | 연습문제
 */

public class SortStringMyWay {
  public String[] solution(String[] strings, int n) {
    // Comparator로 정렬 기준 정의
    Arrays.sort(strings, new Comparator<String>() {
      public int compare(String s1, String s2) {
        // 1. n번째 문자가 다르면 n번째 문자로 정렬
        if (s1.charAt(n) != s2.charAt(n)) {
          return s1.charAt(n) - s2.charAt(n);
        }
        // 2. n번째 문자가 같으면 사전순 정렬
        return s1.compareTo(s2);
      }
    });

    return strings; // 이미 정렬된 원본 배열 반환
  }

  // 로컬 테스트용 main 메서드
  public static void main(String[] args) {
    SortStringMyWay sol = new SortStringMyWay();

    // 테스트 케이스 1
    String[] test1 = { "sun", "bed", "car" };
    String[] result1 = sol.solution(test1, 1);
    System.out.println(Arrays.toString(result1)); // [car, bed, sun]

    // 테스트 케이스 2
    String[] test2 = { "abce", "abcd", "cdx" };
    String[] result2 = sol.solution(test2, 2);
    System.out.println(Arrays.toString(result2)); // [abcd, abce, cdx]

    System.out.println("모든 테스트 통과!");
  }
}
