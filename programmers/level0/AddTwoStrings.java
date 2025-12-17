import java.math.BigInteger;

/**
 * [프로그래머스] 두 수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 * Level 0 | 연습문제
 */

// 프로그래머스 제출용
public class AddTwoStrings {
  public String solution(String a, String b) {
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);
    BigInteger sum = numA.add(numB);
    return sum.toString();
  }

  public static void main(String[] args) {
    AddTwoStrings s = new AddTwoStrings();

    // 테스트 케이스 1
    System.out.println(s.solution("582", "734"));
    // 예상 출력: 1316

    // 테스트 케이스 2
    System.out.println(s.solution("18446744073709551615", "287346502836570928366"));
    // 예상 출력: 305793246910280479981

    // 테스트 케이스 3
    System.out.println(s.solution("0", "0"));
    // 예상 출력: 0
  }
}