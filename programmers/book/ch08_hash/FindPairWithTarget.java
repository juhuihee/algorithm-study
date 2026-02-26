package book.ch08_hash;
/**
 * 문제 18번 - 두 개의 수로 특정값 만들기
 * 저자 출제
 */
import java.util.HashSet;

public class FindPairWithTarget {
  private static boolean solution(int[] arr, int target) {
    HashSet<Integer> hashSet = new HashSet<>();

    for (int i : arr) {
      if (hashSet.contains(target - i)) {
        return true;
      }

      hashSet.add(i);
    }
    return false;
  }

  public static void main(String[] args) {
    // 테스트 1: true 예상
    int[] arr1 = { 1, 2, 3, 4, 8 };
    int target1 = 6;
    System.out.println(solution(arr1, target1)); // true

    // 테스트 2: false 예상
    int[] arr2 = { 2, 3, 5, 9 };
    int target2 = 10;
    System.out.println(solution(arr2, target2)); // false
  }
}
