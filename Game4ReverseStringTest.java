import java.io.*;

class Main {
  public static void main(String[] args) {
    System.out.println("거꾸로 뒤집을 문자열을 입력해주세요.");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String str= in.readLine();
    //키보드로부터 한 줄 입력

    StringBuffer sb = new StringBuffer(str);
    System.out.println(sb.reverse());
    //거꾸로 뒤집은 문자열을 출력
  }
}
