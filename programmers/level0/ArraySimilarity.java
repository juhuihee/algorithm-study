/**
 * [프로그래머스] 배열의 유사도
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 * Level 0 | 연습문제
 */
public class ArraySimilarity {
  public static int solution(String[] s1, String[] s2) {
    int answer = 0;
    for (String a : s1) {
      for (String b : s2) {
        if (a.equals(b)) {
          answer++;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(new String[] { "a", "b", "c" }, new String[] { "com", "b", "d", "p", "c" })); // 2
    System.out.println(solution(new String[] { "n", "omg" }, new String[] { "m", "dot" })); // 0
  }
}
