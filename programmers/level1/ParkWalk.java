/**
 * [프로그래머스] 공원 산책
 * https://school.programmers.co.kr/learn/courses/30/lessons/172928
 * Level 1 | 구현
 */

public class ParkWalk {

  public int[] solution(String[] park, String[] routes) {
    // 시작 위치 찾기
    int currentRow = -1, currentCol = -1;
    for (int i = 0; i < park.length; i++) {
      for (int j = 0; j < park[i].length(); j++) {
        if (park[i].charAt(j) == 'S') {
          currentRow = i;
          currentCol = j;
          break;
        }
      }
    }

    // 명령 수행
    for (String route : routes) {
      String[] parts = route.split(" ");
      String direction = parts[0];
      int distance = Integer.parseInt(parts[1]);

      // 가상 이동
      int newRow = currentRow;
      int newCol = currentCol;
      boolean isValid = true;

      for (int i = 0; i < distance; i++) {
        // 이동
        if (direction.equals("N"))
          newRow--;
        else if (direction.equals("S"))
          newRow++;
        else if (direction.equals("W"))
          newCol--;
        else if (direction.equals("E"))
          newCol++;

        // 범위 & 장애물 체크
        if (newRow < 0 || newRow >= park.length ||
            newCol < 0 || newCol >= park[0].length() ||
            park[newRow].charAt(newCol) == 'X') {
          isValid = false;
          break;
        }
      }

      // 무효면 무시
      if (!isValid)
        continue;

      // 유효면 실제 이동
      currentRow = newRow;
      currentCol = newCol;
    }

    return new int[] { currentRow, currentCol };
  }

  public static void main(String[] args) {
    ParkWalk pw = new ParkWalk();

    // 테스트 케이스 1
    String[] park1 = { "SOO", "OOO", "OOO" };
    String[] routes1 = { "E 2", "S 2", "W 1" };
    int[] result1 = pw.solution(park1, routes1);
    System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [2, 1]

    // 테스트 케이스 2
    String[] park2 = { "SOO", "OXX", "OOO" };
    String[] routes2 = { "E 2", "S 2", "W 1" };
    int[] result2 = pw.solution(park2, routes2);
    System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [0, 1]

    // 테스트 케이스 3
    String[] park3 = { "OSO", "OOO", "OXO", "OOO" };
    String[] routes3 = { "E 2", "S 3", "W 1" };
    int[] result3 = pw.solution(park3, routes3);
    System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // [0, 0]
  }
}