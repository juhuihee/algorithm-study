package level2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * [프로그래머스] 오픈채팅방
 * https://school.programmers.co.kr/learn/courses/30/lessons/42888
 * Level 2 | 연습문제
 */

public class OpenChatRoom {
  public String[] solution(String[] record) {
    HashMap<String, String> map = new HashMap<>();
    ArrayList<String> result = new ArrayList<>();

    for (int i = 0; i < record.length; i++) {
      String[] parts = record[i].split(" ");
      String command = parts[0];
      String uid = parts[1];

      if (command.equals("Enter") || command.equals("Change")) {
        String nickname = parts[2];
        map.put(uid, nickname);
      }
    }

    for (int i = 0; i < record.length; i++) {
      String[] parts = record[i].split(" ");
      String command = parts[0];
      String uid = parts[1];

      if (command.equals("Enter")) {
        result.add(map.get(uid) + "님이 들어왔습니다.");
      } else if (command.equals("Leave")) {
        result.add(map.get(uid) + "님이 나갔습니다.");
      }
    }

    return result.toArray(new String[0]);
  }

  public static void main(String[] args) {
    OpenChatRoom sol = new OpenChatRoom();

    String[] record1 = {
        "Enter uid1234 Muzi",
        "Enter uid4567 Prodo",
        "Leave uid1234",
        "Enter uid1234 Prodo",
        "Change uid4567 Ryan"
    };

    String[] record2 = {
        "Enter uid1 Muzi",
        "Change uid1 Ryan",
        "Leave uid1"
    };

    String[] record3 = {
        "Enter uid1 A",
        "Enter uid2 B",
        "Leave uid1",
        "Enter uid1 C"
    };

    System.out.println("=== 테스트 1 ===");
    String[] result1 = sol.solution(record1);
    for (String s : result1) {
      System.out.println(s);
    }

    System.out.println("\n=== 테스트 2 ===");
    String[] result2 = sol.solution(record2);
    for (String s : result2) {
      System.out.println(s);
    }

    System.out.println("\n=== 테스트 3 ===");
    String[] result3 = sol.solution(record3);
    for (String s : result3) {
      System.out.println(s);
    }
  }
}
