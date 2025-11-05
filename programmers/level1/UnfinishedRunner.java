import java.util.HashMap;

/**
 * [프로그래머스] 완주하지 못한 선수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * Level 1 | 해시
 */
class UnfinishedRunner {
    public String solution(String[] participant, String[] completion) {
      // 1. HashMap 생성 (이름 -> 인원수)
      HashMap<String, Integer> map = new HashMap<>();

      // 2. 참가자 카운팅
      for (String name : participant) {
        // 현재 인원 가져오기 (없으면 0) + 1 해서 다시 저장
        map.put(name, map.getOrDefault(name, 0) + 1);
      }

      // 3. 완주자 카운트 감소
      for(String name : completion) {
        map.put(name, map.get(name) - 1);
      }

      // 4. map을 돌면서 값이 1인 사람 찾기
      for (String key : map.keySet()) {
        if (map.get(key) == 1) {
          return key; // 완주 못한 선수
        }
      }

      return "";
    }
    
    public static void main(String[] args) {
        UnfinishedRunner ur = new UnfinishedRunner();
        
        // 테스트 케이스 1
        String[] p1 = {"leo", "kiki", "eden"};
        String[] c1 = {"eden", "kiki"};
        System.out.println(ur.solution(p1, c1)); // "leo"
        
        // 테스트 케이스 2
        String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(ur.solution(p2, c2)); // "vinko"
        
        // 테스트 케이스 3 (동명이인!)
        String[] p3 = {"mislav", "stanko", "mislav", "ana"};
        String[] c3 = {"stanko", "ana", "mislav"};
        System.out.println(ur.solution(p3, c3)); // "mislav"
    }
}