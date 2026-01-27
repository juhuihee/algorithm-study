public class Taxi {
  public static void main(String[] args) {
    Taxi sol = new Taxi();

    System.out.println(sol.solution(13, 4)); // 4대 (4+4+4+1)
    System.out.println(sol.solution(12, 4)); // 3대 (4+4+4)
    System.out.println(sol.solution(1, 4)); // 1대
    System.out.println(sol.solution(17, 5)); // 4대 (5+5+5+2)
  }

  public int solution(int people, int capacity) {
    // TODO: 올림 공식 사용 (정수 나눗셈!)
    int answer = (people + capacity -1) / capacity;

    return answer;
  }
}
