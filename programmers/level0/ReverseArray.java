/**
 * [프로그래머스] 배열의 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 * Level 0 | 연습문제
 */
public class ReverseArray {
  public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length];
    int j = 0;
    for (int i = num_list.length - 1; i >= 0; i--) {
      answer[j++] = num_list[i];
    }
    return answer;
  }

  public static void main(String[] args) {
    ReverseArray sol = new ReverseArray();

    // 테스트 1
    int[] test1 = { 1, 2, 3, 4, 5 };
    int[] result1 = sol.solution(test1);
    // 출력: [5, 4, 3, 2, 1]
    for (int num : result1) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 테스트 2
    int[] test2 = { 1, 1, 1, 1, 1, 2 };
    int[] result2 = sol.solution(test2);
    // 출력: [2, 1, 1, 1, 1, 1]
    for (int num : result2) {
      System.out.print(num + " ");
    }
  }
}
