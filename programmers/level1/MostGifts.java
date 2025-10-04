/**
 * [프로그래머스] 가장 많이 받은 선물
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712
 * Level 1 | 해시
 */

import java.util.*;

public class MostGifts {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        
        // 이름으로 인덱스를 찾기 위한 맵
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(friends[i], i);
        }
        
        // 선물 주고받은 횟수를 저장하는 2차원 배열
        // giftCount[i][j] = i가 j에게 준 선물의 개수
        int[][] giftCount = new int[n][n];
        
        // 선물 지수 저장 배열 (준 선물 - 받은 선물)
        int[] giftIndex = new int[n];
        
        // 선물 기록 처리
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            
            int giverIdx = nameToIndex.get(giver);
            int receiverIdx = nameToIndex.get(receiver);
            
            giftCount[giverIdx][receiverIdx]++;
            giftIndex[giverIdx]++;   // 준 선물 +1
            giftIndex[receiverIdx]--; // 받은 선물 -1
        }
        
        // 다음 달에 받을 선물 수
        int[] nextMonth = new int[n];
        
        // 다음 달 선물 계산 - 모든 친구 쌍에 대해 비교
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int iToJ = giftCount[i][j]; // i가 j에게 준 선물
                int jToI = giftCount[j][i]; // j가 i에게 준 선물
                
                if (iToJ > jToI) {
                    // i가 j에게 더 많이 줬으면 i가 다음달에 받음
                    nextMonth[i]++;
                } else if (jToI > iToJ) {
                    // j가 i에게 더 많이 줬으면 j가 다음달에 받음
                    nextMonth[j]++;
                } else {
                    // 주고받은 선물이 같거나 기록이 없으면 선물 지수로 판단
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonth[i]++;
                    } else if (giftIndex[j] > giftIndex[i]) {
                        nextMonth[j]++;
                    }
                    // 선물 지수도 같으면 아무도 받지 않음 (아무것도 안 함)
                }
            }
        }
        
        // 최댓값 찾기 (가장 많이 받을 사람의 선물 개수)
        int answer = 0;
        for (int count : nextMonth) {
            answer = Math.max(answer, count);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        MostGifts mg = new MostGifts();
        
        // 테스트 케이스 1
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", 
                          "ryan muzi", "ryan muzi", "frodo muzi", 
                          "frodo ryan", "neo muzi"};
        System.out.println(mg.solution(friends1, gifts1)); // 2
        
        // 테스트 케이스 2
        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", 
                          "alessandro conan", "david alessandro", 
                          "alessandro david"};
        System.out.println(mg.solution(friends2, gifts2)); // 4
        
        // 테스트 케이스 3
        String[] friends3 = {"a", "b", "c"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
        System.out.println(mg.solution(friends3, gifts3)); // 0
    }
}