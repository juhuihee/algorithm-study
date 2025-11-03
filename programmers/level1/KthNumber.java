/**
 * [프로그래머스] K번째수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * Level 1 | 정렬
 */

import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int idx = 0; idx < commands.length; idx++) {
          int i = commands[idx][0]; // 시작(1부터 시작)
          int j = commands[idx][1]; // 끝(1부터 시작)
          int k = commands[idx][2]; // k번째

          // 1. 배열 자르기 (인덱스 변환 : 1시작 -> 0시작)
          int[] temp = Arrays.copyOfRange(array, i-1, j);

          // 2. 정렬
          Arrays.sort(temp);

          // 3. k번째 수 찾기 (인덱스 변환 : 1시작 -> 0시작)
          answer[idx] = temp[k-1];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        KthNumber sol = new KthNumber();
        
        // 테스트 케이스
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };
        
        System.out.println(Arrays.toString(sol.solution(array, commands)));
        // 기대 출력: [5, 6, 3]
    }
}