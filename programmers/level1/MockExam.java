/**
 * [프로그래머스] 모의고사
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * Level 1 | 완전탐색
 */

import java.util.*;

public class MockExam {
    
    public int[] solution(int[] answers) {
        // 수포자의 패턴 (문제에서 주어진 정보)
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각 수포자가 맞춘 개수를 저장
        int[] scores = new int[3];
        
        // answers를 순회하면서 각 수포자의 패턴과 비교해서 정답 개수 세기
        for(int i = 0; i < answers.length; i++) {
          if(answers[i] == student1[i % student1.length]) {
            scores[0]++;
          }
          if(answers[i] == student2[i % student2.length]) {
            scores[1]++;
          } 
          if(answers[i] == student3[i % student3.length]) {
            scores[2]++;
          }
        }
        
        // 최고 점수 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 최고 점수를 받은 사람들을 찾기
        ArrayList<Integer> answer = new ArrayList<>();

        if (scores[0] == maxScore) answer.add(1); // 1번 수포자
        if (scores[1] == maxScore) answer.add(2); // 2번 수포자
        if (scores[2] == maxScore) answer.add(3); // 3번 수포자

        // ArrayList를 int[]배열로 변환
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
          result[i] = answer.get(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        MockExam exam = new MockExam();
        
        // 테스트 케이스 1
        int[] answers1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(exam.solution(answers1)));
        // 예상 출력: [1]
        
        // 테스트 케이스 2
        int[] answers2 = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(exam.solution(answers2)));
        // 예상 출력: [1, 2, 3]
    }
}