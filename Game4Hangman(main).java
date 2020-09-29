import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {

    Hangman hangman = new Hangman();

    int result = hangman.playGame();//failed값

//실패 횟수에 따라서 메시지 출력
//1~2번 실수 "참 잘했어요!"
// 3 실수 "잘했어요!"
//4 실수 "보통이네요!"
//나머지 "분발하세요!"
//변수명은 result로 할것

    if (result <=2) System.out.println("참 잘했어요!");
    else if (result <= 3) System.out.println("잘했어요!");
    else if (result <= 4) System.out.println("보통이네요!");
    else System.out.println("분발하세요!");

  }
}
