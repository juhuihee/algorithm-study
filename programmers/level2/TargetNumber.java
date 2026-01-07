package level2;

/**
 * [프로그래머스] 타겟넘버
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 * Level 2 | 연습문제
 */
public class TargetNumber {
  int answer = 0;

  public int solution(int[] numbers, int target) {
    dfs(numbers, target, 0, 0);
    return answer;
  }

  // DFS로 모든 경우의 수 탐색
  // numbers: 주어진 숫자 배열
  // target: 목표 숫자
  // index: 현재 처리 중인 인덱스
  // currentSum: 지금까지의 합
  void dfs(int[] numbers, int target, int index, int currentSum) {
    // 종료 조건: 모든 숫자를 다 사용함
    if (index == numbers.length) {
      // 목표 숫자와 같으면 경우의 수 증가
      if (currentSum == target) {
        answer++;
      }
      return;
    }

    // 선택 1: 현재 숫자를 더하기
    dfs(numbers, target, index + 1, currentSum + numbers[index]);

    // 선택 2: 현재 숫자를 빼기
    dfs(numbers, target, index + 1, currentSum - numbers[index]);
  }

  // 테스트용 메인
  public static void main(String[] args) {
    TargetNumber sol = new TargetNumber();

    // 테스트 케이스 1
    int[] numbers1 = { 1, 1, 1, 1, 1 };
    int target1 = 3;
    int result1 = sol.solution(numbers1, target1);
    System.out.println("=== 테스트 1 ===");
    System.out.println("입력: numbers = [1, 1, 1, 1, 1], target = 3");
    System.out.println("결과: " + result1);
    System.out.println("정답: 5");
    System.out.println("통과: " + (result1 == 5 ? "pass" : "fail"));
    System.out.println();

    // 테스트 케이스 2
    sol.answer = 0; // answer 초기화!
    int[] numbers2 = { 4, 1, 2, 1 };
    int target2 = 4;
    int result2 = sol.solution(numbers2, target2);
    System.out.println("=== 테스트 2 ===");
    System.out.println("입력: numbers = [4, 1, 2, 1], target = 4");
    System.out.println("결과: " + result2);
    System.out.println("정답: 2");
    System.out.println("통과: " + (result2 == 2 ? "pass" : "fail"));
    System.out.println();

    // 테스트 케이스 3 (작은 예제)
    sol.answer = 0;
    int[] numbers3 = { 1, 2 };
    int target3 = 3;
    int result3 = sol.solution(numbers3, target3);
    System.out.println("=== 테스트 3 (작은 예제) ===");
    System.out.println("입력: numbers = [1, 2], target = 3");
    System.out.println("결과: " + result3);
    System.out.println("정답: 1");
    System.out.println("통과: " + (result3 == 1 ? "pass" : "fail"));
    System.out.println();

    // 실행 과정 출력 (디버깅용)
    System.out.println("=== 실행 과정 보기 ===");
    System.out.println("numbers = [1, 2], target = 3");
    System.out.println();
    System.out.println("dfs(0, 0) 시작");
    System.out.println("├─ +1 선택 → dfs(1, 1)");
    System.out.println("│  ├─ +2 선택 → dfs(2, 3)");
    System.out.println("│  │  └─ index==2, sum==3 → target==3? YES! answer++");
    System.out.println("│  └─ -2 선택 → dfs(2, -1)");
    System.out.println("│     └─ index==2, sum==-1 → target==3? NO");
    System.out.println("└─ -1 선택 → dfs(1, -1)");
    System.out.println("   ├─ +2 선택 → dfs(2, 1)");
    System.out.println("   │  └─ index==2, sum==1 → target==3? NO");
    System.out.println("   └─ -2 선택 → dfs(2, -3)");
    System.out.println("      └─ index==2, sum==-3 → target==3? NO");
    System.out.println();
    System.out.println("최종 answer = 1");
  }
}
