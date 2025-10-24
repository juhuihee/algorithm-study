/**
 * [프로그래머스] 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 * Level 1 | 연습문제
 */
public class HarshadNumber {
    
    public boolean solution(int x) {
      int sum = 0;
      int temp = x;

      while(temp > 0){
        sum += temp % 10; // 자릿수 추출해서 더하기
        temp /= 10;       // 다음 자릿수로 이동
      }

      return x % sum == 0;// 나누어떨어지는지 확인
    }

    public boolean solution2(int x) {
      String str = String.valueOf(x);
      int sum = 0;

      for(int i = 0; i < str.length(); i++) {
        sum += str.charAt(i) - '0'; // 각 문자를 숫자로 바꿔서 sum에 더하기
      }

      return x % sum == 0;
    }

    // toCharArray() 더 좋음!
    public boolean solution3(int x) {
      String str = String.valueOf(x);
      int sum = 0;

      for(char c : str.toCharArray()) {
        sum += c - '0';
      }

      return x % sum == 0;
}

    public static void main(String[] args) {
      HarshadNumber hn = new HarshadNumber();
      
      // solution 테스트
      System.out.println("=== solution (while문) ===");
      System.out.println(hn.solution(10));  // true
      System.out.println(hn.solution(12));  // true
      System.out.println(hn.solution(11));  // false
      System.out.println(hn.solution(13));  // false
      System.out.println(hn.solution(18));  // true
      
      // solution2 테스트
      System.out.println("\n=== solution2 (String) ===");
      System.out.println(hn.solution2(10));  // true
      System.out.println(hn.solution2(12));  // true
      System.out.println(hn.solution2(11));  // false
      System.out.println(hn.solution2(13));  // false
      System.out.println(hn.solution2(18));  // true

      // solution3 테스트 (선택사항)
      System.out.println("\n=== solution3 (toCharArray) ===");
      System.out.println(hn.solution3(10));  // true
      System.out.println(hn.solution3(12));  // true
      System.out.println(hn.solution3(11));  // false
      System.out.println(hn.solution3(13));  // false
      System.out.println(hn.solution3(18));  // true
    }
}