/**
 * [프로그래머스] 부족한 금액 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 * Level 1 | 위클리 챌린지
 */
public class InsufficientAmount {
    
    public long solution(int price, int money, int count) {
      long total = 0;
      for(int i = 1; i <= count; i++) {
        total += price * i;
      }

      long lack = total - money;
      if(lack > 0) {
        return lack;
      } else {
        return 0;
      }
    }
    
    public static void main(String[] args) {
        InsufficientAmount ia = new InsufficientAmount();
        
        // 테스트 케이스
        System.out.println(ia.solution(3, 20, 4));  // 10
        System.out.println(ia.solution(5, 100, 10));  // 175 (5+10+15+20+25+30+35+40+45+50 = 275)
        System.out.println(ia.solution(10, 1000, 5));  // 0 (10+20+30+40+50 = 150, 부족하지 않음)
    }
}