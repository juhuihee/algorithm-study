package level2;

/**
 * [프로그래머스] 할인행사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131127
 * Level 2 | 연습문제
 */
import java.util.HashMap;

public class DiscountEvent {
  public int solution(String[] want, int[] number, String[] discount) {
    HashMap<String, Integer> wantMap = new HashMap<>();
    for (int i = 0; i < want.length; i++) {
      wantMap.put(want[i], number[i]);
    }
    int answer = 0;

    for (int i = 0; i < discount.length - 9; i++) {
      HashMap<String, Integer> discount10d = new HashMap<>();

      for (int j = i; j < i + 10; j++) {
        if (wantMap.containsKey(discount[j])) {
          discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) + 1);
        }
      }

      if (discount10d.equals(wantMap))
        answer++;
    }
    return answer;
  }

  public static void main(String[] args) {
    DiscountEvent sol = new DiscountEvent();

    // 샘플 1 (정답: 3)
    System.out.println(sol.solution(
        new String[] { "banana", "apple", "rice", "pork", "pot" },
        new int[] { 3, 2, 2, 2, 1 },
        new String[] { "chicken", "apple", "apple", "banana", "rice", "apple",
            "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana" })); // 3

    // 샘플 2 (정답: 0)
    System.out.println(sol.solution(
        new String[] { "apple" },
        new int[] { 10 },
        new String[] { "banana", "banana", "banana", "banana", "banana",
            "banana", "banana", "banana", "banana", "banana" })); // 0

    // 수량 초과 (정답: 0)
    System.out.println(sol.solution(
        new String[] { "apple" },
        new int[] { 1 },
        new String[] { "apple", "apple", "apple", "apple", "apple",
            "apple", "apple", "apple", "apple", "apple" })); // 0
  }
}
