/**
 * [프로그래머스] - 각도기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 * Lv.0 | 연습문제
 */
public class AngleClassifier {
  public int solution(int angle) {
    int answer = 0;

    if (angle == 180) {
      answer = 4; // 평각
    } else if (angle > 90) {
      answer = 3; // 둔각 (90 < angle < 180)
    } else if (angle == 90) {
      answer = 2; // 직각
    } else {
      answer = 1; // 예각 (0 < angle < 90)
    }

    return answer;
  }
}
