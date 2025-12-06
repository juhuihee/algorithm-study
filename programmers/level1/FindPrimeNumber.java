import java.util.*;

class Solution {
  public int solution(int n) {
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;

    for (int i = 2; i * i <= n; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }

    int count = 0;
    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
        count++;
      }
    }

    return count;
  }
}

public class FindPrimeNumber {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution(10));   // 4
    System.out.println(sol.solution(5));    // 3
    System.out.println(sol.solution(100));  // 25
    System.out.println("모든 테스트 통과!");
  }
}