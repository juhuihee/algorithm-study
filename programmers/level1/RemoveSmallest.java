/**
 * [프로그래머스] 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * Level 1 | 연습문제
 */
public class RemoveSmallest {
    public int[] solution(int[] arr) {
        // 엣지 케이스: 배열 길이가 1이면 [-1] 반환
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        // 최솟값 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 새 배열 생성 및 최솟값 제외하고 복사
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;  // ⭐ 이거 추가!
    }
    
    public static void main(String[] args) {
        RemoveSmallest s = new RemoveSmallest();
        
        // 테스트 케이스 1
        int[] test1 = {4, 3, 2, 1};
        int[] result1 = s.solution(test1);
        System.out.print("Test1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println("// expected: [4, 3, 2]");
        
        // 테스트 케이스 2
        int[] test2 = {10};
        int[] result2 = s.solution(test2);
        System.out.print("Test2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println("// expected: [-1]");
    }
}