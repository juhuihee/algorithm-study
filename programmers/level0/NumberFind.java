
public class NumberFind {
  public int solution(int num, int k) {
    // int → String 변환
    String numStr = String.valueOf(num);

    // 각 자리 숫자 확인
    for (int i = 0; i < numStr.length(); i++) {
      // charAt(i) - '0' : 문자 → 숫자 변환
      if (numStr.charAt(i) - '0' == k) {
        return i + 1; // 1부터 시작하므로 +1
      }
    }

    // 못 찾으면 -1
    return -1;
  }

  public static void main(String[] args) {
    NumberFind sol = new NumberFind();

    // 테스트 케이스
    System.out.println(sol.solution(29183, 1)); // 3
    System.out.println(sol.solution(232443, 4)); // 4
    System.out.println(sol.solution(123456, 7)); // -1

    // 추가 테스트
    System.out.println(sol.solution(10203, 0)); // 2 (첫 번째 0)
    System.out.println(sol.solution(99999, 9)); // 1 (첫 번째 9)
  }
}