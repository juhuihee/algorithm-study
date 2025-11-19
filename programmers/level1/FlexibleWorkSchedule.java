/**
 * [프로그래머스] 유연근무제
 * https://school.programmers.co.kr/learn/courses/30/lessons/388351
 * Level 1 | 구현
 */

class FlexibleWorkSchedule {

  public int solution(int[] schedules, int[][] timelogs, int startday) {
    int answer = 0;

    // 각 직원마다 체크
    for (int i = 0; i < schedules.length; i++) {
      // 출근 인정 시각 계산 (희망 시각 + 10분)
      int deadline = addMinutes(schedules[i], 10);
      boolean isValid = true;

      // 7일 동안 평일만 체크
      for (int day = 0; day < 7; day++) {
        int currentDay = getDayOfWeek(startday, day);

        // 평일인지 확인
        if (isWeekday(currentDay)) {
          // 지각 여부 체크
          if (timelogs[i][day] > deadline) {
            isValid = false;
            break;
          }
        }
      }

      if (isValid)
        answer++;
    }

    return answer;
  }

  // 시각에 분을 더하는 메서드 (958 + 10 = 1008)
  private int addMinutes(int time, int minutes) {
    // 시와 분 분리
    int hour = time / 100;
    int min = time % 100;
    // 분 더하기
    min += minutes;
    // 60분 넘으면 시간 증가
    if (min >= 60) {
      hour++;
      min -= 60;
    }
    return hour * 100 + min;
  }

  // 현재 요일 계산 (startday부터 day일 후)
  private int getDayOfWeek(int startday, int dayOffset) {
    // (startday + dayOffset) 계산하되 1~7 범위로
    return (startday + dayOffset - 1) % 7 + 1;
  }

  // 평일인지 확인 (1~5: 평일, 6~7: 주말)
  private boolean isWeekday(int day) {
    return day <= 5;
  }

  public static void main(String[] args) {
    FlexibleWorkSchedule sol = new FlexibleWorkSchedule();

    // 테스트 케이스 1
    int[] schedules1 = { 700, 800, 1100 };
    int[][] timelogs1 = {
        { 710, 2359, 1050, 700, 650, 631, 659 },
        { 800, 801, 805, 800, 759, 810, 809 },
        { 1105, 1001, 1002, 600, 1059, 1001, 1100 }
    };
    System.out.println(sol.solution(schedules1, timelogs1, 5)); // 3

    // 테스트 케이스 2
    int[] schedules2 = { 730, 855, 700, 720 };
    int[][] timelogs2 = {
        { 710, 700, 650, 735, 700, 931, 912 },
        { 908, 901, 805, 815, 800, 831, 835 },
        { 705, 701, 702, 705, 710, 710, 711 },
        { 707, 731, 859, 913, 934, 931, 905 }
    };
    System.out.println(sol.solution(schedules2, timelogs2, 1)); // 2
  }
}