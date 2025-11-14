/**
 * [프로그래머스] PCCE 기출문제 10번 - 창고 정리
 * https://school.programmers.co.kr/learn/courses/30/lessons/250126
 * PCCE 기출 | 디버깅
 */

public class WarehouseOrganization {
    
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];
        
        for(int i=0; i<storage.length; i++){
            int clean_idx = -1;
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            if(clean_idx == -1){
                clean_storage[num_item] = storage[i]; // 🔧 수정!
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }
        
        // 아래 코드에는 틀린 부분이 없습니다.
        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        WarehouseOrganization sol = new WarehouseOrganization();
        
        // 테스트 케이스
        System.out.println(sol.solution(
            new String[]{"pencil", "pencil", "pencil", "book"},
            new int[]{2, 4, 3, 1}
        )); // "pencil"
        
        System.out.println(sol.solution(
            new String[]{"doll", "doll", "doll", "doll"},
            new int[]{1, 1, 1, 1}
        )); // "doll"
        
        System.out.println(sol.solution(
            new String[]{"apple", "steel", "leaf", "apple", "leaf"},
            new int[]{5, 3, 5, 3, 7}
        )); // "leaf"
    }
}