/**
 * [프로그래머스] 문자열 내 p와 y의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * Level 1 | 연습문제
 */

class CountPAndY {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                pCount++;
            }
            if (c == 'y') {
                yCount++;
            }
        }
        
        return pCount == yCount;
    }
    
    public static void main(String[] args) {
        CountPAndY sol = new CountPAndY();
        
        // 테스트 케이스 1
        String s1 = "pPoooyY";
        boolean result1 = sol.solution(s1);
        System.out.println("테스트 1:");
        System.out.println("s = \"" + s1 + "\"");
        System.out.println("결과: " + result1);
        System.out.println("예상: true");
        System.out.println("통과: " + (result1 == true ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 2
        String s2 = "Pyy";
        boolean result2 = sol.solution(s2);
        System.out.println("테스트 2:");
        System.out.println("s = \"" + s2 + "\"");
        System.out.println("결과: " + result2);
        System.out.println("예상: false");
        System.out.println("통과: " + (result2 == false ? "PASS" : "FAIL"));
        System.out.println();
        
        // 테스트 케이스 3 (p도 y도 없는 경우)
        String s3 = "abcdef";
        boolean result3 = sol.solution(s3);
        System.out.println("테스트 3:");
        System.out.println("s = \"" + s3 + "\"");
        System.out.println("결과: " + result3);
        System.out.println("예상: true (둘 다 0개)");
        System.out.println("통과: " + (result3 == true ? "PASS" : "FAIL"));
    }
}