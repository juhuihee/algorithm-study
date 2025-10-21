/**
 * [프로그래머스] 서울에서 김서방 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 * Level 1 | 연습문제
 */

public class FindKim {
  public String solution(String[] seoul) {
    for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
  }

  public static void main(String[] args) {
    FindKim fk = new FindKim();

    // 테스트 케이스
    String[] test1 = {"Jane", "Kim"};
    System.out.println(fk.solution(test1));
    // 예상 출력: 김서방은 1에 있다

    // 테스트 케이스 2
    String[] test2 = {"Kim", "Jane"};
    System.out.println(fk.solution(test2));
    // 예상 출력: 김서방은 0에 있다

    // 테스트 케이스 3 (추가)
    String[] test3 = {"Park", "Lee", "Kim", "Choi"};
    System.out.println(fk.solution(test3));
    // 예상 출력: 김서방은 2에 있다
  }
}

