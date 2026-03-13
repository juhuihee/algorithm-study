package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [프로그래머스] 기능개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * Level 2 | 연습문제
 */

public class FunctionDevelopment {
  public static int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> days = new LinkedList<>();

    // 1. 며칠 걸리는지 계산
    for (int i = 0; i < progresses.length; i++) {
      days.offer((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
    }

    // 2. 배포날짜별 묶기
    ArrayList<Integer> answer = new ArrayList<>();
    int count = 1;
    int mark = days.poll();

    while (!days.isEmpty()) {
      if (days.peek() <= mark) {
        count++;
        days.poll();
      } else {
        answer.add(count);
        count = 1;
        mark = days.poll();
      }
    }
    answer.add(count);

    // 3. int[] 변환 후 반환
    int[] result = new int[answer.size()];
    for (int i = 0; i < answer.size(); i++) {
      result[i] = answer.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(java.util.Arrays.toString(solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 }))); // [2, 1]
    System.out.println(java.util.Arrays.toString(solution(new int[] { 95, 90, 99, 99, 80, 99 }, new int[] { 1, 1, 1, 1, 1, 1 }))); // [1, 3, 2]
  }
}
