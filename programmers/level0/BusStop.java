public class BusStop {
  public int solution(int[] seat, String[][] passengers) {
    int total_seats = 0;
    for (int i = 0; i < seat.length; i++) {
      total_seats += seat[i];
    }

    int num_passenger = 0;
    for (int i = 0; i < passengers.length; i++) {
      num_passenger += func4(passengers[i]);
      num_passenger -= func3(passengers[i]);
    }
    int answer = func1(total_seats - num_passenger);
    return answer;
  }

  public int func1(int num) {
    if (0 > num) {
      return 0;
    } else {
      return num;
    }
  }

  public int func2(int num) {
    if (num > 0) {
      return 0;
    } else {
      return num;
    }
  }

  public int func3(String[] station) {
    int num = 0;
    for (int i = 0; i < station.length; i++) {
      if (station[i].equals("Off")) {
        num += 1;
      }
    }
    return num;
  }

  public int func4(String[] station) {
    int num = 0;
    for (int i = 0; i < station.length; i++) {
      if (station[i].equals("On")) {
        num += 1;
      }
    }
    return num;
  }

  public static void main(String[] args) {
    BusStop sol = new BusStop();

    // 테스트 케이스 1
    int[] seat1 = { 1, 1, 1, 1, 1 };
    String[][] passengers1 = {
        { "On", "On", "On" },
        { "Off", "On", "Off" },
        { "Off", "Off", "On" }
    };
    int result1 = sol.solution(seat1, passengers1);
    System.out.println("Test 1: " + result1);
    System.out.println("Expected: [예상 결과]");
    System.out.println();

    // 테스트 케이스 2
    int[] seat2 = { 2, 3, 1 };
    String[][] passengers2 = {
        { "On", "On" },
        { "Off", "On" },
        { "On", "Off" }
    };
    int result2 = sol.solution(seat2, passengers2);
    System.out.println("Test 2: " + result2);
    System.out.println("Expected: [예상 결과]");
    System.out.println();

    // 테스트 케이스 3 - 추가 테스트
    int[] seat3 = { 1, 1, 1, 1 };
    String[][] passengers3 = {
        { "On" },
        { "On" },
        { "On" },
        { "Off" }
    };
    int result3 = sol.solution(seat3, passengers3);
    System.out.println("Test 3: " + result3);
    System.out.println("Expected: [예상 결과]");
    System.out.println();
  }
}
