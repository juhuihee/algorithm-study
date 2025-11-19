/**
 * [프로그래머스] 택배 상자 꺼내기
 * https://school.programmers.co.kr/learn/courses/30/lessons/389478
 * Level 1 | 구현, 2차원 배열
 */

class DeliveryBoxExtraction {

  public int solution(int n, int w, int num) {
    // num의 위치(층, 열) 찾기
    int layer = (num - 1) / w; // 층 번호
    int posInLayer = (num - 1) % w; // 그 층에서 인덱스
    int col = getColumn(layer, posInLayer, w); // 실제 열

    // 같은 열에서 num부터 위로 상자 세기
    int count = 0;
    int totalLayers = (n + w - 1) / w; // 전체 층 수

    for (int r = layer; r < totalLayers; r++) {
      // 이 층에 상자가 몇 개 있는지
      int boxesInThisLayer = getBoxCount(n, w, r);

      // r층에서 col 위치에 상자가 있는지 확인
      boolean hasBox = false;

      if ( r % 2 == 0) {
        hasBox = (col < boxesInThisLayer);
      } else {
        int posInThisLayer = w - 1 - col;
        hasBox = (posInThisLayer < boxesInThisLayer);
      }

      if (hasBox) {
        count++;
      }
    }

    return count;
  }

  // 실제 열 번호 구하기 (지그재그 고려)
  private int getColumn(int layer, int posInLayer, int w) {
    if (layer % 2 == 0) { // 짝수 층: 왼→오 (그대로)
      return posInLayer;
    } else {  // 홀수 층: 오→왼(반대로)
      return w - 1 - posInLayer;
    }
  }

  // 특정 층에 상자가 몇 개 있는지
  private int getBoxCount(int n, int w, int layer) {
    // 마지막 층은 n - layer * w개, 나머지 층은 w개
    int remaining = n - layer * w;
    return Math.min(remaining, w);
  }

  public static void main(String[] args) {
    DeliveryBoxExtraction sol = new DeliveryBoxExtraction();

    System.out.println(sol.solution(22, 6, 8)); // 3
    System.out.println(sol.solution(25, 5, 17)); // 2
    System.out.println(sol.solution(10, 3, 7)); // 1
  }
}