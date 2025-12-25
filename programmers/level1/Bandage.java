/**
 * [프로그래머스] 붕대감기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 * Level 1 | 연습문제
 */
public class Bandage {
  public int solution(int[] bandage, int health, int[][] attacks) {
    int maxHealth = health; // 최대 체력 저장
    int castTime = bandage[0]; // 시전 시간
    int healPerSec = bandage[1]; // 초당 회복량
    int bonusHeal = bandage[2]; // 추가 회복량

    int successCount = 0; // 연속 성공 카운트
    int attackIdx = 0; // 현재 확인할 공격 인덱스
    int endTime = attacks[attacks.length - 1][0]; // 마지막 공격 시간

    for (int time = 1; time <= endTime; time++) {
      // 1) 이번 초에 공격이 있는지 체크
      if (attackIdx < attacks.length && attacks[attackIdx][0] == time) {
        health -= attacks[attackIdx][1]; // 피해 입음
        attackIdx++; // 다음 공격으로 이동

        if (health <= 0) {
          return -1; // 사망
        }

        successCount = 0; // 연속 성공 리셋
        continue; // 이번 초는 회복 없음
      }

      // 2) 공격 없으면 회복
      health += healPerSec;
      successCount++;

      // 3) 연속 성공 체크
      if (successCount == castTime) {
        health += bonusHeal;
        successCount = 0; // 리셋
      }

      // 4) 최대 체력 초과 방지
      if (health > maxHealth) {
        health = maxHealth;
      }
    }

    return health;
  }

  public static void main(String[] args) {
    Bandage sol = new Bandage();

    // 테스트 1
    int[] bandage1 = { 5, 1, 5 };
    int health1 = 30;
    int[][] attacks1 = { { 2, 10 }, { 9, 15 }, { 12, 5 }, { 15, 5 } };
    System.out.println("Test 1: " + sol.solution(bandage1, health1, attacks1)); // 예상: 9

    // 테스트 2
    int[] bandage2 = { 3, 2, 7 };
    int health2 = 20;
    int[][] attacks2 = { { 1, 15 }, { 5, 16 }, { 8, 6 } };
    System.out.println("Test 2: " + sol.solution(bandage2, health2, attacks2)); // 예상: -1

    // 테스트 3
    int[] bandage3 = { 4, 2, 7 };
    int health3 = 20;
    int[][] attacks3 = { { 1, 15 }, { 5, 16 }, { 8, 6 } };
    System.out.println("Test 3: " + sol.solution(bandage3, health3, attacks3)); // 예상: -1

    // 테스트 4
    int[] bandage4 = { 1, 1, 1 };
    int health4 = 5;
    int[][] attacks4 = { { 1, 2 }, { 3, 2 } };
    System.out.println("Test 4: " + sol.solution(bandage4, health4, attacks4)); // 예상: 3
  }
}
