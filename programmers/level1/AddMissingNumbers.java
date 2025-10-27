/**
 * [프로그래머스] 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 * Level 1 | 월간 코드 챌린지 시즌3
 */

public class AddMissingNumbers {
    public int solution(int[] numbers) {
      int sum = 0;
      for(int num : numbers){
        sum += num;
      }
      return 45 - sum;
    }
    
    public static void main(String[] args) {
        AddMissingNumbers s = new AddMissingNumbers();
        
        // 테스트 케이스
        int[] test1 = {1, 2, 3, 4, 6, 7, 8, 0}; // 없는 숫자: 5, 9 → 합: 14
        System.out.println(s.solution(test1));  // 14

        int[] test2 = {5, 8, 4, 0, 6, 7, 9};  // 없는 숫자: 1, 2, 3 → 합: 6
        System.out.println(s.solution(test2));// 6
    }
}