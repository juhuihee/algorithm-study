/**
 * [프로그래머스] 로또의 최고 순위와 최저 순위
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 * Level 1 | 배열, 카운팅
 */

public class LottoRanking {

  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];

    int matchCount = 0; // 확실히 맞춘 개수
    int zeroCount = 0; // 0의 개수

    // Step 1: lottos 배열 순회
    for (int i = 0; i < lottos.length; i++) {
      if (lottos[i] == 0) {
        zeroCount++; // 0 발견!
      } else {
        // Step 2: win_nums와 비교
        for (int j = 0; j < win_nums.length; j++) {
          if (lottos[i] == win_nums[j]) {
            matchCount++; // 맞는 번호 발견!
            break; // 중복 카운트 방지
          }
        }
      }
    }

    // Step 3: 순위 계산
    answer[0] = getRank(matchCount + zeroCount); // 최고 순위
    answer[1] = getRank(matchCount); // 최저 순위

    return answer;
  }

  // 일치 개수를 순위로 변환하는 헬퍼 메서드
  private int getRank(int count) {
    switch (count) {
      case 6:
        return 1; // 6개 맞으면 1등
      case 5:
        return 2; // 5개 맞으면 2등
      case 4:
        return 3; // 4개 맞으면 3등
      case 3:
        return 4; // 3개 맞으면 4등
      case 2:
        return 5; // 2개 맞으면 5등
      default:
        return 6; // 그 외(0, 1개)는 6등
    }
  }

  public static void main(String[] args) {
    LottoRanking sol = new LottoRanking();

    // 테스트 케이스 1
    int[] lottos1 = { 44, 1, 0, 0, 31, 25 };
    int[] win_nums1 = { 31, 10, 45, 1, 6, 19 };
    int[] result1 = sol.solution(lottos1, win_nums1);
    System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [3, 5]

    // 테스트 케이스 2
    int[] lottos2 = { 0, 0, 0, 0, 0, 0 };
    int[] win_nums2 = { 38, 19, 20, 40, 15, 25 };
    int[] result2 = sol.solution(lottos2, win_nums2);
    System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [1, 6]

    // 테스트 케이스 3
    int[] lottos3 = { 45, 4, 35, 20, 3, 9 };
    int[] win_nums3 = { 20, 9, 3, 45, 4, 35 };
    int[] result3 = sol.solution(lottos3, win_nums3);
    System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // [1, 1]
  }
}