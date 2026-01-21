import java.util.ArrayList;
import java.util.Arrays;

/**
 * [프로그래머스] 헴버거 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 * Level 1 | 연습문제
 */
public class MakingHamburgers {
  public int solution(int[] ingredient) {
    ArrayList<Integer> stack = new ArrayList<>();
    int count = 0;

    for (int i = 0; i < ingredient.length; i++) {
      stack.add(ingredient[i]);

      if (stack.size() >= 4) {
        int size = stack.size();
        if (stack.get(size - 4) == 1 &&
            stack.get(size - 3) == 2 &&
            stack.get(size - 2) == 3 &&
            stack.get(size - 1) == 1) {

          stack.remove(size - 1);
          stack.remove(size - 2);
          stack.remove(size - 3);
          stack.remove(size - 4);
          count++;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    MakingHamburgers sol = new MakingHamburgers();

    // 테스트 케이스 1
    int[] test1 = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
    int result1 = sol.solution(test1);
    System.out.println("테스트 1: " + result1);
    System.out.println("예상: 2");
    System.out.println("통과: " + (result1 == 2 ? "pass" : "fail"));
    System.out.println();

    // 테스트 케이스 2
    int[] test2 = { 1, 3, 2, 1, 2, 1, 3, 1, 2 };
    int result2 = sol.solution(test2);
    System.out.println("테스트 2: " + result2);
    System.out.println("예상: 0");
    System.out.println("통과: " + (result2 == 0 ? "pass" : "fail"));
    System.out.println();

    // 추가 테스트 케이스 3 (연속 햄버거)
    int[] test3 = { 1, 2, 3, 1, 1, 2, 3, 1 };
    int result3 = sol.solution(test3);
    System.out.println("테스트 3: " + result3);
    System.out.println("예상: 2");
    System.out.println("통과: " + (result3 == 2 ? "pass" : "fail"));
    System.out.println();

    // 추가 테스트 케이스 4 (햄버거 없음)
    int[] test4 = { 1, 2, 3, 2, 1, 3 };
    int result4 = sol.solution(test4);
    System.out.println("테스트 4: " + result4);
    System.out.println("예상: 0");
    System.out.println("통과: " + (result4 == 0 ? "pass" : "fail"));
    System.out.println();

    // 추가 테스트 케이스 5 (딱 1개)
    int[] test5 = { 1, 2, 3, 1 };
    int result5 = sol.solution(test5);
    System.out.println("테스트 5: " + result5);
    System.out.println("예상: 1");
    System.out.println("통과: " + (result5 == 1 ? "pass" : "fail"));
  }
}
