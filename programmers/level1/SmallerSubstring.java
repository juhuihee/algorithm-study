/**
 * [프로그래머스] 크기가 작은 부분문자열
 * 부분문자열을 숫자로 비교하여 p 이하인 개수를 세는 문제
 * Level 1 | 문자열
 */

class SmallerSubString {

  public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        
        // t에서 p와 같은 길이의 부분문자열을 추출
        for (int i = 0; i <= t.length() - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            long substringValue = Long.parseLong(substring);
            
            // p보다 작거나 같으면 카운트
            if (substringValue <= pValue) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        SmallerSubString sol = new SmallerSubString();
        
        // 테스트 케이스 1
        String t1 = "3141592";
        String p1 = "271";
        int result1 = sol.solution(t1, p1);
        System.out.println("테스트 1:");
        System.out.println("t = \"" + t1 + "\", p = \"" + p1 + "\"");
        System.out.println("결과: " + result1);
        System.out.println("예상: 2");
        System.out.println("통과: " + (result1 == 2 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 2
        String t2 = "500220839878";
        String p2 = "7";
        int result2 = sol.solution(t2, p2);
        System.out.println("테스트 2:");
        System.out.println("t = \"" + t2 + "\", p = \"" + p2 + "\"");
        System.out.println("결과: " + result2);
        System.out.println("예상: 8");
        System.out.println("통과: " + (result1 == 2 ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 3
        String t3 = "10203";
        String p3 = "15";
        int result3 = sol.solution(t3, p3);
        System.out.println("테스트 3:");
        System.out.println("t = \"" + t3 + "\", p = \"" + p3 + "\"");
        System.out.println("결과: " + result3);
        System.out.println("예상: 3");
        System.out.println("통과: " + (result1 == 2 ? "PASS" : "FAIL"));
    }
}