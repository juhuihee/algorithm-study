/**
 * [프로그래머스] 평균 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 * Level 1 | 연습문제
 */

class CalculateAverage {
    public double solution(int[] arr) {
        double sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        return sum / arr.length;
    }
    
    public static void main(String[] args) {
        CalculateAverage sol = new CalculateAverage();
        
        // 테스트 케이스 1
        int[] arr1 = {1, 2, 3, 4};
        double result1 = sol.solution(arr1);
        System.out.println("테스트 1:");
        System.out.println("arr = [1, 2, 3, 4]");
        System.out.println("결과: " + result1);
        System.out.println("예상: 2.5");
        System.out.println("통과: " + (result1 == 2.5 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 2
        int[] arr2 = {5, 5};
        double result2 = sol.solution(arr2);
        System.out.println("테스트 2:");
        System.out.println("arr = [5, 5]");
        System.out.println("결과: " + result2);
        System.out.println("예상: 5.0");
        System.out.println("통과: " + (result2 == 5.0 ? "PASS" : "FAIL"));
    }
}