import java.util.Scanner;

/**
 * [프로그래머스] 직사각형 별찍기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12969
 * Level 1 | 연습문제
 */

public class PrintRectangleStar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 가로 길이 (별의 개수)
    int m = sc.nextInt(); // 세로 길이 (줄 수)

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}