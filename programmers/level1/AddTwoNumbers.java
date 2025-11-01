/**
 * [프로그래머스] 두 개 뽑아서 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * Level 1 | 배열
 */

import java.util.HashSet;
import java.util.Arrays;

public class AddTwoNumbers {
    public int[] solution(int[] numbers) {
        // 1. HashSet 생성 (중복 자동 제거용)
        HashSet<Integer> set = new HashSet<>();
        
        // 2. 이중 for문으로 두 수를 뽑아서 더하기
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);  // 합을 set에 추가
            }
        }
        
        // 3. HashSet → 배열로 변환
        int[] answer = new int[set.size()];
        int index = 0;
        for (int num : set) {
            answer[index++] = num;
        }
        
        // 4. 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
    
    public static void main(String[] args) {
        AddTwoNumbers sol = new AddTwoNumbers();
        
        // 테스트 케이스 1
        int[] numbers1 = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(sol.solution(numbers1)));
        // 출력: [2, 3, 4, 5, 6, 7]
        
        // 테스트 케이스 2
        int[] numbers2 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(sol.solution(numbers2)));
        // 출력: [2, 5, 7, 9, 12]
    }
}