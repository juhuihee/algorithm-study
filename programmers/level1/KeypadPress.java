/**
 * [프로그래머스] 키패드 누르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/67256
 * Level 1 | 2020 카카오 인턴십
 */

public class KeypadPress {
  public String solution(int[] numbers, String hand) {
    StringBuilder answer = new StringBuilder();

    // 1. 왼손/오른손 즉시 처리 배열
    int[] leftNums = { 1, 4, 7 };
    int[] rightNums = { 3, 6, 9 };

    // 2. 현재 손 위치 (시작: 왼손= *, 오른손= #)
    int[] leftPos = { 3, 0 };
    int[] rightPos = { 3, 2 };

    for (int num : numbers) {
      // 3. 왼손 영역인지 체크
      if (contains(leftNums, num)) {
        answer.append("L");
        leftPos = getPosition(num);
      }
      // 4. 오른손 영역인지 체크
      else if (contains(rightNums, num)) {
        answer.append("R");
        rightPos = getPosition(num);
      }
      // 5. 가운데(2,5,8,0) - 거리 계산
      else {
        int[] targetPos = getPosition(num);
        int leftDist = getDistance(leftPos, targetPos);
        int rightDist = getDistance(rightPos, targetPos);

        // 거리 비교해서 가까운 손 선택
        if (leftDist < rightDist) {
          answer.append("L");
          leftPos = targetPos;
        } else if (rightDist < leftDist) {
          answer.append("R");
          rightPos = targetPos;
        } else {  // 거리 같을 때
          if (hand.equals("left")) {
            answer.append("L");
            leftPos = targetPos;
          } else {
            answer.append("R");
            rightPos = targetPos;
          }
        }
      }
    }
    return answer.toString();
  }

  private int[] getPosition(int num) {
    if (num == 0)
      return new int[] { 3, 1 };
    int row = (num - 1) / 3;
    int col = (num - 1) % 3;
    return new int[] { row, col };
  }

  private int getDistance(int[] pos1, int[] pos2) {
    return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
  }

  // 배열에 값이 있는지 체크
  private boolean contains(int[] arr, int value) {
    for (int n : arr) {
      if (n == value)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    KeypadPress kp = new KeypadPress();

    // 테스트 케이스 1
    int[] numbers1 = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
    String hand1 = "right";
    System.out.println(kp.solution(numbers1, hand1)); // "LRLLLRLLRRL"

    // 테스트 케이스 2
    int[] numbers2 = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
    String hand2 = "left";
    System.out.println(kp.solution(numbers2, hand2)); // "LRLLRRLLLRR"

    // 테스트 케이스 3
    int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    String hand3 = "right";
    System.out.println(kp.solution(numbers3, hand3)); // "LLRLLRLLRL"
  }
}
