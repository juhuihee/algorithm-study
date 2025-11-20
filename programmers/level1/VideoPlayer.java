/**
 * [프로그래머스] [PCCP 기출문제] 1번 / 동영상 재생기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 * Level 1 | 구현, 시뮬레이션
 */
public class VideoPlayer {

  public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
    // 1. 모든 시간을 초(sec) 단위로 변환
    int videoLenSec = timeToSeconds(video_len);
    int posSec = timeToSeconds(pos);
    int opStartSec = timeToSeconds(op_start);
    int opEndSec = timeToSeconds(op_end);

    // 2. 시작 전 오프닝 체크
    if (posSec >= opStartSec && posSec <= opEndSec) {
      posSec = opEndSec; // 오프닝 구간이면 끝으로
    }

    // 3. 각 명령 실행
    for (String command : commands) {
      if (command.equals("prev")) {
        posSec -= 10;
      } else if (command.equals("next")) {
        posSec += 10;
      }

      // 범위 체크
      if (posSec < 0) {
        posSec = 0;
      }

      if (posSec > videoLenSec) {
        posSec = videoLenSec;
      }

      // 오프닝 체크
      if (posSec >= opStartSec && posSec <= opEndSec) {
        posSec = opEndSec; // 오프닝 구간이면 끝으로
      }
    }

    // 4. 최종 위치를 mm:ss 형식으로 변환
    return secondsToTime(posSec);
  }

  // mm:ss를 초로 변환하는 헬퍼 메서드
  private int timeToSeconds(String time) {
    String[] parts = time.split(":");
    int minutes = Integer.parseInt(parts[0]);
    int seconds = Integer.parseInt(parts[1]);

    return minutes * 60 + seconds;
  }

  // 초를 mm:ss로 변환하는 헬퍼 메서드
  private String secondsToTime(int seconds) {
    int min = seconds / 60;
    int sec = seconds % 60;

    return String.format("%02d:%02d", min, sec);
  }

  public static void main(String[] args) {
    VideoPlayer vp = new VideoPlayer();

    // 테스트 케이스 1
    System.out.println(vp.solution("34:33", "13:00", "00:55", "02:55",
        new String[] { "next", "prev" }));
    // 예상 출력: "13:00"

    // 테스트 케이스 2
    System.out.println(vp.solution("10:55", "00:05", "00:15", "06:55",
        new String[] { "prev", "next", "next" }));
    // 예상 출력: "06:55"

    // 테스트 케이스 3
    System.out.println(vp.solution("07:22", "04:05", "00:15", "04:07",
        new String[] { "next" }));
    // 예상 출력: "04:17"
  }
}