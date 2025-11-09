/**
 * [프로그래머스] 실패율
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * Level 1 | 2019 카카오 신입 공채 | 정렬
 */

import java.util.Arrays;

class FailureRate {
    public int[] solution(int N, int[] stages) {
        
        // 1. 각 스테이지에 머물러 있는 사람 수 카운트
        int[] challenger = new int[N + 2];  // 0번 안씀, N+1까지 필요
        // TODO: stages 배열을 순회하며 각 스테이지에 몇 명이 머물고 있는지 세기
        for (int stage : stages) {
          challenger[stage]++;
        }
        
        
        // 2. 실패율 계산을 위한 배열 (스테이지 번호, 실패율 쌍으로 저장)
        double[][] failRates = new double[N][2];
        
        double total = stages.length;  // 전체 플레이어 수 (처음엔 모두가 1스테이지 도달)
        
        for (int i = 1; i <= N; i++) {
          failRates[i-1][0] = i;  // 스테이지 번호 저장 (0번 인덱스에 1번 스테이지)
          
          // 0으로 나누기 체크 먼저!
          if (total == 0) {
            failRates[i-1][1] = 0;  // [1]번째 칸에 실패율 저장
          } else {
            failRates[i-1][1] = (double) challenger[i] / total;
          //         ↑ i-1번 인덱스   ↑ [1]번째 칸 = 실패율
        }
    
        total -= challenger[i];  // 다음 스테이지는 현재 머문 사람들 제외
        }
        
        // 3. 실패율 기준으로 정렬 (내림차순)
        Arrays.sort(failRates, (a, b) -> {
            // 실패율이 다르면: 실패율 높은 순 (내림차순)
            if (a[1] != b[1]) {
                return Double.compare(b[1], a[1]);
            }
            // 실패율이 같으면: 스테이지 번호 작은 순 (오름차순)
            return Double.compare(a[0], b[0]);
        });
        
        // 4. 정렬된 스테이지 번호만 추출
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failRates[i][0];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        FailureRate sol = new FailureRate();
        
        // 테스트 케이스 1
        int N1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result1 = sol.solution(N1, stages1);
        System.out.println("테스트 1: " + Arrays.toString(result1));
        System.out.println("예상 결과: [3, 4, 2, 1, 5]");
        System.out.println();
        
        // 테스트 케이스 2
        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        int[] result2 = sol.solution(N2, stages2);
        System.out.println("테스트 2: " + Arrays.toString(result2));
        System.out.println("예상 결과: [4, 1, 2, 3]");
        System.out.println();
        
        // 테스트 케이스 3 (엣지 케이스: 모두 클리어)
        int N3 = 3;
        int[] stages3 = {4, 4, 4};
        int[] result3 = sol.solution(N3, stages3);
        System.out.println("테스트 3: " + Arrays.toString(result3));
        System.out.println("예상 결과: [1, 2, 3] (모두 실패율 0)");
        System.out.println();
        
        // 테스트 케이스 4 (엣지 케이스: 1명만)
        int N4 = 2;
        int[] stages4 = {1};
        int[] result4 = sol.solution(N4, stages4);
        System.out.println("테스트 4: " + Arrays.toString(result4));
        System.out.println("예상 결과: [1, 2]");
    }
}