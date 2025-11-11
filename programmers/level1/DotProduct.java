/**
 * [프로그래머스] 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 * Level 1 | 월간 코드 챌린지 시즌1
 */
class DotProduct {
  public int solution(int[] a, int[] b) {
    int answer = 0;

    // a[i] * b[i]를 모두 더하기
    for (int i = 0; i < a.length; i++) {
      answer += a[i] * b[i];
    }

    return answer;
  }

  public static void main(String[] args) {
    DotProduct d = new DotProduct();
    System.out.println(d.solution(new int[] { 1, 2, 3, 4 }, new int[] { -3, -1, 0, 2 })); // 3
    System.out.println(d.solution(new int[] { -1, 0, 1 }, new int[] { 1, 0, -1 })); // -2
  }
}