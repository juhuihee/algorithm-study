/**
 * [프로그래머스] 배열의 평균값
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 * Level 0 | 연습문제
 */
public class ArrayAverage {
  public double solution(int[] numbers) {
    double sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return sum / numbers.length;
  }

  public static void main(String[] args) {
    ArrayAverage sol = new ArrayAverage();

    // 테스트 케이스 1
    int[] test1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(sol.solution(test1)); // 5.5

    // 테스트 케이스 2
    int[] test2 = { 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };
    System.out.println(sol.solution(test2)); // 94.0

    // 추가 테스트
    int[] test3 = { 1 };
    System.out.println(sol.solution(test3)); // 1.0

    int[] test4 = { 10, 20, 30 };
    System.out.println(sol.solution(test4)); // 20.0
  }
}
