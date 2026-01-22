import java.util.Arrays;
import java.util.HashMap;

/**
 * [프로그래머스] 달리기 경주
 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
 * Level 1 | 연습문제
 */

public class RunningRace {
  public String[] solution(String[] players, String[] callings) {
    // 1. 선수 이름 → 현재 위치 저장
    HashMap<String, Integer> positionMap = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      positionMap.put(players[i], i);
    }

    // 2. 호명될 때마다 위치 교환
    for (String calling : callings) {
      int currentPos = positionMap.get(calling); // 현재 위치 O(1)

      if (currentPos > 0) { // 맨 앞이 아니면
        String frontPlayer = players[currentPos - 1]; // 앞 선수

        // 배열에서 교환
        players[currentPos - 1] = calling;
        players[currentPos] = frontPlayer;

        // HashMap도 업데이트!
        positionMap.put(calling, currentPos - 1);
        positionMap.put(frontPlayer, currentPos);
      }
    }

    return players;
  }

  public static void main(String[] args) {
    RunningRace rr = new RunningRace();

    // 테스트 1
    String[] players1 = { "mumu", "soe", "poe", "kai", "mine" };
    String[] callings1 = { "kai", "kai", "mine", "mine" };
    String[] result1 = rr.solution(players1, callings1);
    System.out.println("Test 1: " + Arrays.toString(result1));
    // 예상: [mumu, kai, mine, soe, poe]

    // 테스트 2
    String[] players2 = { "a", "b", "c" };
    String[] callings2 = { "b" };
    String[] result2 = rr.solution(players2, callings2);
    System.out.println("Test 2: " + Arrays.toString(result2));
    // 예상: [b, a, c]
  }
}
