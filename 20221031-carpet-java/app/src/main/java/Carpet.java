// [] [] []
// [] yy []
// [] [] []
// ----------------------
// 1-1 옐로우 세로가 1일때
// 브라운 = (1 + 2) * 2 + 옐로우 갯수 * 2
// [] [] [] []
// [] yy yy []
// [] [] [] []
//
// 1- 2 옐로우 세로가 2일때
// [] [] [] [] [] [] 6개
// [] yy yy yy yy [] 2개
// [] yy yy yy yy [] 2개
// [] [] [] [] [] []  6개
// 브라운 = (옐로우 세로길이 + 2) * 2 + (옐로우 / 2) * 2
// = 8 + 8

// 옐로우 세로가 3일때
// [] [] [] [] [] []
// [] yy yy yy yy []
// [] yy yy yy yy []
// [] yy yy yy yy []
// [] [] [] [] [] []
// 브라운 = (옐로우 세로길이 + 2) * 2 + (옐로우갯수 / 3) * 2
// 10 + 8
//
// EdgeCase
// 아래와 같을때
// [] [] [] [] []
// [] yy yy yy []
// [] yy yy yy []
// [] yy yy yy []
// [] [] [] [] []
// if(width * length == brown + yellow) 조건이 없다면
// {6,4} 라는 결과값이 나옴
// [] [] [] [] [] []
// [] yy yy yy yy []
// [] yy yy yy yy []
// [] [] [] [] [] []
//1. 이해
// 직사각형의 카펫은 노란색칸이 존재하고 브라운 칸으로 둘러쌓인 형태의 사각형이다.
// 옐로우가 배치 방법에 따라 브라운의 수가 바뀐다.
// 카펫의 가로길이는 세로와 같거나 세로보다 길다
//2. 계획
// 옐로우의 배치방법을 기준으로 브라운 수를 구하는 기준을 세우자
// 1. 옐로우 세로길이가 기준 ( 옐로우의 세로는 가로보다 클수 없다 즉 가로보다 항상 같거나 작다)
// 노랑의 세로길이가 1 일때
// 노랑의 세로기리가 2 일떼
// 노랑의 세로길이가 3 일때
// ...
// 노랑의 세로 길이를 구한다.
// 옐로우 = 가로 * 세로
// 가로 = 옐로우 / 세로
// 카펫의 가로 =  2 + 옐로우 가로길이(옐로우 총 길이 / 구한 세로 값)
// 카펫의 세로 = 2 + 옐로우 세로길이(옐로우 총 길이 / 구한 가로값)
// 브라운 = (옐로우 세로길이 + 2) * 2 + (옐로우갯수 / 옐로우 세로길이) * 2
// yellow = width * height
// height = yellow / width
// width = yellow / height
//  height < yellow / height
// EdgeCase =>? 브라운 갯수 + 옐로우 갯수 의 합  = width * length 여야함 조건 추가
// -> 수정 옐로우의 길이를 옐로우 세로가 1일 때부터 적용하므로 그때마다 가정하는 옐로우의 세로와 가로의 곱은 항상 옐로우의 격자수와 같아야한느 조건 추가해줘야함
public class Carpet {
  public int[] solution(int brown, int yellow) {
    int width = 0;
    int length = 0;

    for (int yellowLength = 1; yellowLength <= yellow; yellowLength += 1) {
      int yellowWidth = yellow / yellowLength;
      if (yellowWidth < yellowLength) {
        break;
      }
      if (brown == (yellowLength + 2) * 2 + (yellowWidth * 2) && yellow == yellowLength * yellowWidth) {

        width = 2 + yellowWidth;
        length = 2 + yellowLength;
        int[] answer = {width, length};
        return answer;

      }
    }
    return new int[]{-1, -1};
  }
}

