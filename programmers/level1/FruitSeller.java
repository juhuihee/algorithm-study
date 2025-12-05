import java.util.*;

/**
 * 프로그래머스 Level 1 - 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 * 
 * 핵심: 정렬 후 뒤에서부터 m개씩 묶어서 최대 이익
 * - 한 상자 가격 = (최저점) × m
 * - 총 이익 = 모든 상자 가격의 합
 * 
 * 시간: 15분
 */
public class FruitSeller {

  public int solution(int k, int m, int[] score) {
    // 1. 정렬 (오름차순)
    Arrays.sort(score);

    // 2. 뒤에서부터 m개씩 묶어서 가격 계산
    int answer = 0;
    for (int i = score.length - m; i >= 0; i -= m) {
      answer += score[i] * m; // 최저점 × m
    }

    return answer;
  }

  public static void main(String[] args) {
    FruitSeller sol = new FruitSeller();

    // 테스트 케이스 1
    int k1 = 3;
    int m1 = 4;
    int[] score1 = { 1, 2, 3, 1, 2, 3, 1 };
    System.out.println("테스트 1: " + sol.solution(k1, m1, score1)); // 8

    // 테스트 케이스 2
    int k2 = 4;
    int m2 = 3;
    int[] score2 = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
    System.out.println("테스트 2: " + sol.solution(k2, m2, score2)); // 33

    // 추가 테스트 케이스 3 (나머지 버림 확인)
    int k3 = 4;
    int m3 = 3;
    int[] score3 = { 4, 4, 4, 4, 4 }; // 5개 → 1상자(3개), 나머지 2개 버림
    System.out.println("테스트 3: " + sol.solution(k3, m3, score3)); // 12

    // 추가 테스트 케이스 4 (최소 케이스)
    int k4 = 5;
    int m4 = 3;
    int[] score4 = { 1, 1, 1 }; // 정확히 3개
    System.out.println("테스트 4: " + sol.solution(k4, m4, score4)); // 3
  }
}