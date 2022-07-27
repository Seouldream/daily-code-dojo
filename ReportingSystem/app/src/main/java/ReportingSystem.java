//짧은 결론
//아이디 리스트가 주어지고
//리포트 행위가 주어짐
// k 기준에따라 리포트 행위의 목적어가 k 번 이상 나오면 리포트행위를 한 주체자의 아이디리스트 위치에 1 이들어
//조건 1 단 중복 신고 즉 동일한 행위자가 목적자 신고는 1회로 취급
//조건 2
//리포트의 스플릿 2번의 값을 가져온다 (신고당한사람)
// 2번의 값이 몇번이나 중복되는지 검사한다-> 아이디리스트에서 같은 것을 찾아서 -> 해당아이디자리에 카운트를 한다.
public class ReportingSystem {
  public int[] solution(String[] id_list, String[] report, int k) {

    getNumbers(id_list, report);

    int[] answer = {};
    return answer;

  }

  public int[] getNumbers(String[] id_list, String[] report) {
    int[] count = new int[id_list.length];
    for(int i = 0; i < report.length; i += 1 ) {
      String[] reporteds = report[i].split(" ");
      String reported = reporteds[1];
      for(int z = 0; z < id_list.length; z += 1) {
        for(int j = 0; j < id_list.length; j += 1) {
          if(reported.equals(id_list[z]) && z == j) {
              count[j] += 1;
          }
        }
      }
    }
  return count;}
}
