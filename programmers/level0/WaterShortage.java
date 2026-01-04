/**
 * [프로그래머스] - 물 부족
 * https://school.programmers.co.kr/learn/courses/30/lessons/340202
 * Lv.0 | 연습문제
 */
public class WaterShortage {
  public int solution(int storage, int usage, int[] change) {
    int total_usage = 0;
    for (int i = 0; i < change.length; i++) {
      usage += usage * change[i] / 100;
      total_usage += usage;
      if (total_usage > storage) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    WaterShortage sol = new WaterShortage();

    // 테스트 케이스 1: 3일째 부족
    int storage1 = 1000;
    int usage1 = 100;
    int[] change1 = { 10, 20, 30, 40 };
    int result1 = sol.solution(storage1, usage1, change1);
    System.out.println("Test 1: " + result1);
    System.out.println("Expected: 3");
    System.out.println("(Day 0: 110, Day 1: 242, Day 2: 556, Day 3: 1112 > 1000)");
    System.out.println("Pass: " + (result1 == 3));
    System.out.println();

    // 테스트 케이스 2: 부족하지 않음
    int storage2 = 10000;
    int usage2 = 100;
    int[] change2 = { 5, 5, 5 };
    int result2 = sol.solution(storage2, usage2, change2);
    System.out.println("Test 2: " + result2);
    System.out.println("Expected: -1");
    System.out.println("(총 사용량 344 < 10000)");
    System.out.println("Pass: " + (result2 == -1));
    System.out.println();

    // 테스트 케이스 3: 첫날 바로 부족
    int storage3 = 100;
    int usage3 = 50;
    int[] change3 = { 100, 50, 30 };
    int result3 = sol.solution(storage3, usage3, change3);
    System.out.println("Test 3: " + result3);
    System.out.println("Expected: 0");
    System.out.println("(Day 0: 100, 총 100 = 100, 바로 초과)");
    System.out.println("Pass: " + (result3 == 0));
    System.out.println();

    // 테스트 케이스 4: 마지막 날 부족
    int storage4 = 500;
    int usage4 = 100;
    int[] change4 = { 10, 10, 10 };
    int result4 = sol.solution(storage4, usage4, change4);
    System.out.println("Test 4: " + result4);
    System.out.println("Expected: 2");
    System.out.println("(Day 0: 110, Day 1: 231, Day 2: 485, 총 826 > 500)");
    System.out.println("Pass: " + (result4 == 2));
    System.out.println();

    // 테스트 케이스 5: 변화율 0
    int storage5 = 300;
    int usage5 = 100;
    int[] change5 = { 0, 0, 0 };
    int result5 = sol.solution(storage5, usage5, change5);
    System.out.println("Test 5: " + result5);
    System.out.println("Expected: 2");
    System.out.println("(Day 0: 100, Day 1: 100, Day 2: 100, 총 300 = 300, Day 3에서 초과)");
    System.out.println("Pass: " + (result5 == 2));
    System.out.println();
  }
}
