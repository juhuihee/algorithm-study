/**
 * [프로그래머스] 짝수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 * Level 0
 */

class Solution {
  public int solution(int n) {
    int answer = 0;
    for (int i = 2; i <= n; i += 2) {
      answer += i;
    }
    return answer;
  }
}

public class SumOfEvenNumbers {
  public static void main(String[] args) {
    Solution sol = new Solution();

    // 테스트 케이스
    System.out.println(sol.solution(10)); // 예상: 30 (2+4+6+8+10)
    System.out.println(sol.solution(4)); // 예상: 6 (2+4)
  }
}