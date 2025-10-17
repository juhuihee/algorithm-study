/**
 * [프로그래머스] 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * Level 1 | 연습문제
 */

import java.util.*;

public class DescendingInteger {
    public long solution(long n) {
        String str = String.valueOf(n); // 숫자를 문자열로
        char[] arr = str.toCharArray(); // 문자열을 문자배열로
        Arrays.sort(arr); // 배열 정렬(오름차순)

        String answer = ""; // 문자열로 만들기
        for(int i = arr.length - 1; i >= 0; i--){ //  역순으로 출력
          answer += arr[i];
        }

        return Long.parseLong(answer); // 숫자로 변경
    }
    
    // 참고: StringBuilder로 뒤집기
    public long solution2(long n) {
      String str = String.valueOf(n);
      char[] arr = str.toCharArray();
      Arrays.sort(arr);                       // 오름차순 정렬
    
      String sorted = new String(arr);        // char[] → String
      String reversed = new StringBuilder(sorted).reverse().toString();  // 뒤집기!
    
      return Long.parseLong(reversed);
    }

    public static void main(String[] args) {
        DescendingInteger sol = new DescendingInteger();
        
        // 테스트 케이스
        System.out.println(sol.solution(118372));  // 873211
    }
}