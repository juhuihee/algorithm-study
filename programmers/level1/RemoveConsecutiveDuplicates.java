import java.util.*;

/**
 * [프로그래머스] 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * Level 1 | 스택/큐
 */
public class RemoveConsecutiveDuplicates {
    
    public int[] solution(int[] arr) {
      // 1. 결과를 담을 리스트 생성
      ArrayList<Integer> list = new ArrayList<>();
      
      // 2. 리스트가 비어있거나 마지막 값과 현재 값이 다르면 추가
      for(int num : arr) {
        if(list.isEmpty() || list.get(list.size() - 1) != num) {
          list.add(num);
        }
      }

      // 3. ArrayList → int[] 변환
      int[] answer = new int[list.size()];
      for(int i = 0; i < list.size(); i++) {
        answer[i] = list.get(i);
      }

      return answer;
    }
    
    public static void main(String[] args) {
        RemoveConsecutiveDuplicates s = new RemoveConsecutiveDuplicates();
        
        // 테스트 케이스 1
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(s.solution(arr1))); 
        // 예상: [1, 3, 0, 1]
        
        // 테스트 케이스 2
        int[] arr2 = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(s.solution(arr2)));
        // 예상: [4, 3]
        
        // 추가 테스트
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(s.solution(arr3)));
        // 예상: [1, 2, 3, 4, 5] (연속 없음)
        
        int[] arr4 = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(s.solution(arr4)));
        // 예상: [1] (모두 연속)
    }
}