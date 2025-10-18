/**
 * [프로그래머스] 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 * Level 1 | 연습문제
 */

 class IntegerSquareRoot {
    public long solution(long n) {
        // 제곱근을 long 타입으로 구하기
        long sqrt = (long) Math.sqrt(n);
        
        // 제곱해서 원래 값이 나오는지 확인
        if (sqrt * sqrt == n) {
            // 정수 제곱근이면 (sqrt+1)의 제곱 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 아니면 -1 반환
            return -1;
        }
    }
    
    public static void main(String[] args) {
        IntegerSquareRoot sol = new IntegerSquareRoot();
        System.out.println(sol.solution(121));  // 144
        System.out.println(sol.solution(3));    // -1
        System.out.println(sol.solution(144));  // 169
    }
}