/**
 * [프로그래머스] 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 * Level 1 | 2021 카카오 채용연계형 인턴십
 */
class NumberStringAndWord {
    public int solution(String s) {
        // 영단어 → 숫자로 변환
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) {
        NumberStringAndWord n = new NumberStringAndWord();
        System.out.println(n.solution("one4seveneight")); // 1478
        System.out.println(n.solution("23four5six7"));     // 234567
        System.out.println(n.solution("123"));             // 123
    }
}