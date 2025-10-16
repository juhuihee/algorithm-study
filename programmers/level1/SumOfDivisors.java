/**
 * [프로그래머스] 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * Level 1 | 연습문제
 */

public class SumOfDivisors {
    public int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
    return sum;
    }

    public int solution2(int n) {
        int sum = 0;
        for(int i = 1; i * i <= n; i++){  // √n까지만 검사
            if(n % i == 0){
                sum += i;           // 약수 추가
                if(i != n / i) {    // 짝꿍 약수도 추가 (중복 제외)
                    sum += n / i;
                }
            }
        }
    return sum;
    }
    
    public static void main(String[] args) {
        SumOfDivisors sol = new SumOfDivisors();
        
        // 테스트 케이스
        System.out.println(sol.solution(12)); // 28
        System.out.println(sol.solution(5));  // 6
    }
}
