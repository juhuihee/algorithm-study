/**
 * [프로그래머스] 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * Level 1 | 연습문제
 */

import java.util.*;

public class DivisibleArray {
    public int[] solution(int[] arr, int divisor) {
      ArrayList<Integer> list = new ArrayList<>(); // 동적 배열 생성

      for(int i= 0; i < arr.length; i++){
        if(arr[i] % divisor == 0){
          list.add(arr[i]);
        }
      }

      // 비어있으면 [-1] 반환
      if(list.size() == 0){
        return new int[]{-1};
      }
    
      // ArrayList를 배열로 변환
      int[] answer = new int[list.size()];
      for(int i = 0; i < list.size(); i++){
        answer[i] = list.get(i); // get(인덱스)러 깂 가져오기
      }

      Arrays.sort(answer);
      return answer;
    }
    
    public static void main(String[] args) {
        DivisibleArray sol = new DivisibleArray();
        
        // 테스트 케이스
        System.out.println(Arrays.toString(sol.solution(new int[]{5, 9, 7, 10}, 5)));      // [5, 10]
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 36, 1, 3}, 1)));     // [1, 2, 3, 36]
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 2, 6}, 10)));        // [-1]
    }
}