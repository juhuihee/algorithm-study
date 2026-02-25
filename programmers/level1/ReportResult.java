import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * [프로그래머스] 신고 결과 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 * Level 1 | 연습문제
 */
public class ReportResult {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];
    Set<String> set = new HashSet<>();
    Map<String, Integer> countMap = new HashMap<>();
    Map<String, Integer> mailMap = new HashMap<>();

    // 1. 중복 제거
    for (String r : report) {
      set.add(r);
    }

    // 2. 신고당한 사람 카운트
    for (String s : set) {
      String[] parts = s.split(" ");
      String to = parts[1];
      countMap.put(to, countMap.getOrDefault(to, 0) + 1);
    }

    // 3. 신고한 사람에게 메일 카운트 (신고당한 횟수 >= k 이면)
    for (String s : set) {
      String[] parts = s.split(" ");
      String from = parts[0];
      String to = parts[1];

      if (countMap.get(to) >= k) {
        mailMap.put(from, mailMap.getOrDefault(from, 0) + 1);
      }
    }

    // 4. 결과 배열 채우기
    for (int i = 0; i < id_list.length; i++) {
      answer[i] = mailMap.getOrDefault(id_list[i], 0);
    }

    return answer;
  }

  public static void main(String[] args) {
    ReportResult sol = new ReportResult();
    // 테스트 1 - 기본 예시
    String[] id_list1 = { "muzi", "frodo", "apeach", "neo" };
    String[] report1 = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
    int k1 = 2;
    System.out.println("테스트 1: " + Arrays.toString(sol.solution(id_list1, report1, k1)));
    // 기대값: [2, 1, 1, 0]

    // 테스트 2 - 중복 신고 처리
    String[] id_list2 = { "con", "ryan" };
    String[] report2 = { "ryan con", "ryan con", "ryan con" };
    int k2 = 3;
    System.out.println("테스트 2: " + Arrays.toString(sol.solution(id_list2, report2, k2)));
    // 기대값: [0, 0] (중복 제거 → ryan이 con을 1번만 신고, k=3 미달)

    // 테스트 3 - k=1, 모두 메일 받음
    String[] id_list3 = { "a", "b", "c" };
    String[] report3 = { "a b", "b c", "c a" };
    int k3 = 1;
    System.out.println("테스트 3: " + Arrays.toString(sol.solution(id_list3, report3, k3)));
    // 기대값: [1, 1, 1]

    // 테스트 4 - 신고 없음
    String[] id_list4 = { "a", "b", "c" };
    String[] report4 = {};
    int k4 = 1;
    System.out.println("테스트 4: " + Arrays.toString(sol.solution(id_list4, report4, k4)));
    // 기대값: [0, 0, 0]
  }
}
