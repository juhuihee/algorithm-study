public class PythagoreanTheorem {
  public int solution(int a, int c) {
    int b_square = c * c - a * a;
    return b_square;
  }

  public static void main(String[] args) {
    PythagoreanTheorem sol = new PythagoreanTheorem();

    // 기본 테스트 (3-4-5 삼각형)
    System.out.println(sol.solution(3, 5)); // 16 (b=4, 4²=16)

    // 6-8-10 삼각형
    System.out.println(sol.solution(6, 10)); // 64 (b=8, 8²=64)

    // 5-12-13 삼각형
    System.out.println(sol.solution(5, 13)); // 144 (b=12, 12²=144)

    // 8-15-17 삼각형
    System.out.println(sol.solution(8, 17)); // 225 (b=15, 15²=225)

    // 큰 숫자
    System.out.println(sol.solution(20, 29)); // 441 (b=21, 21²=441)

    // c = a일 때 (b=0)
    System.out.println(sol.solution(5, 5)); // 0

    // 작은 숫자
    System.out.println(sol.solution(1, 1)); // 0
  }
}
