import java.util.*;
import java.io.*;


class Main {
  public static void main(String[] args) {

    int x, y;  // x가 단수  y는 곱하는 수
    Random r= new Random();

      x= Math.abs(r.nextInt() % 9) + 1;
    
      y= Math.abs(r.nextInt() % 9) + 1;

    int num = x * y;



    System.out.println();
    System.out.println("* 구구단 "+ x + "단에 대한 문제입니다");
    System.out.println();

    System.out.print(x + " X " + y + " = ");
    //입력 받기
    Scanner stdIn = new Scanner(System.in);
    int result = stdIn.nextInt();


    //판단
    if (x*y == result) System.out.println("정답입니다!"); 
    else System.out.println("틀렸습니다. 정답은 "+ num + "입니다");

  }
}
