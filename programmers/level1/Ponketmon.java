/**
 * [프로그래머스] 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * Level 1 | 해시
 */

import java.util.HashSet;

public class Ponketmon {
    
    public int solution(int[] nums) {
        // 1. HashSet으로 중복 제거 (종류 개수 구하기)
        HashSet<Integer> types = new HashSet<>();
        
        for (int num : nums) {
            types.add(num);  // 중복은 자동으로 무시됨!
        }
        
        // 2. 선택 가능한 개수
        int maxSelect = nums.length / 2;
        
        // 3. 종류 수
        int typeCount = types.size();
        
        // 4. 둘 중 작은 값 리턴
        // - 종류가 많아도 maxSelect개까지만 선택 가능
        // - 종류가 적으면 typeCount개만 선택 가능
        return Math.min(maxSelect, typeCount);
    }
    
    public static void main(String[] args) {
        Ponketmon p = new Ponketmon();
        
        // 테스트 케이스 1
        int[] nums1 = {3, 1, 2, 3};
        System.out.println(p.solution(nums1));  // 2
        
        // 테스트 케이스 2
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        System.out.println(p.solution(nums2));  // 3
        
        // 테스트 케이스 3
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(p.solution(nums3));  // 2
    }
}