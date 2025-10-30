/**
 * [프로그래머스] 최대공약수와 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 * Level 1 | 연습문제
 */
public class GcdAndLcm {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
    
        int gcd = getGcd(n,m);
        int lcm = (n * m) / gcd;

        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }

    // 유클리드 호제법으로 최대공약수 구하는 메서드
    public int getGcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        GcdAndLcm sol = new GcdAndLcm();
        
        // 테스트 케이스
        int[] result1 = sol.solution(3, 12);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [3, 12]
        
        int[] result2 = sol.solution(2, 5);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [1, 10]
    }
}