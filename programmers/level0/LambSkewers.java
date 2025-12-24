public class LambSkewers {
  public int solution(int n, int k) {
    int service = n / 10;
    int result = n * 12000 + (k - service) * 2000;
    return result;
  }

  public static void main(String[] args) {
    LambSkewers sol = new LambSkewers();

    // 테스트 1
    System.out.println(sol.solution(10, 3)); // 124000

    // 테스트 2
    System.out.println(sol.solution(64, 6)); // 768000

    // 추가 테스트
    System.out.println(sol.solution(9, 5)); // 9*12000 + 5*2000 = 118000
  }
}
