import java.util.Scanner;

public class RectangularStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    a = 5;
    b = 3;


    for(int z = 0 ; z < b ; z += 1 ) {
      String row = "";
      for (int i = 0; i < a; i += 1) {
        String star = "*";
        row += star;
      }
      System.out.println(row);
    }


    //System.out.println(a + b);
  }

}