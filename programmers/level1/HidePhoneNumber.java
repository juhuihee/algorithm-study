/**
 * [프로그래머스] 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 * Level 1 | 문자열
 */

class HidePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";

        // * 개수 계산 (전체 - 4)
        int starCount = phone_number.length() - 4;

        // * 만들기
        String stars = "*".repeat(starCount);

        // 뒤 4자리 가져오기
        String last4 = phone_number.substring(phone_number.length() -4);
        
        // 합치기
        answer = stars + last4;
        
        return answer;
    }

    public String solution2(String phone_number){
      // 한 줄로도 가능!
      return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }
    
    public static void main(String[] args) {
        HidePhoneNumber sol = new HidePhoneNumber();
        
        // 테스트 케이스
        System.out.println(sol.solution("01033334444")); // *******4444
        System.out.println(sol.solution("027778888"));   // *****8888
    }
}