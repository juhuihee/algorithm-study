/**
 * [프로그래머스] 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 * Level 1 | 연습문제
 */

import java.time.LocalDate;

public class Year2016 {
    
    public String solution(int a, int b) {
        // 요일 배열 (1월 1일이 금요일이므로 FRI부터 시작)
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 각 월의 일수 (2016년은 윤년)
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 1월 1일부터 며칠 지났는지 계산
        int totalDays = 0;
        
        // a월 전까지의 모든 일수 더하기
        for (int i = 0; i < a - 1; i++) {
            totalDays += monthDays[i];
        }
        
        // b일 더하기 (1월 1일은 0일이므로 b-1)
        totalDays += (b - 1);
        
        // 요일 계산
        return days[totalDays % 7];
    }

    public String solution2(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);

        // 요일 가져오기
        String dayOfWeek = date.getDayOfWeek().toString();

        // "TUESDAY" -> "TUE" 변환
        return dayOfWeek.substring(0,3);
    }
    
    public static void main(String[] args) {
        Year2016 y = new Year2016();
        
        // 테스트 케이스
        System.out.println(y.solution(5, 24));  // "TUE"
        System.out.println(y.solution(1, 1));   // "FRI"
        System.out.println(y.solution(12, 31)); // "SAT"
        System.out.println("========");
        System.out.println(y.solution2(5, 20)); // "FRI"
        System.out.println(y.solution2(3, 19)); // "SAT"
    }
}