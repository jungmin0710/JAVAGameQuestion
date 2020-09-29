import java.io.*;

class Hangman{  
  String hiddenString;
  StringBuffer outputString;
  StringBuffer inputString;
  int reminder;
  int failed;

  public Hangman() throws IOException {

    hiddenString = "hello";//찾을 글자열(문제의 답):임의로 삽입하거나 수정할 수 없어야 하기 때문에 String형 사용

  }

  public int playGame() throws IOException{

    outputString = new StringBuffer();

    for(int i = 0; i < hiddenString.length(); i++){
      outputString.append('-');//문자의 수 만큼 '-' 출력
    }

    inputString = new StringBuffer();

    reminder = hiddenString.length();
    failed = 0;

//문제 출제 파트
    System.out.println("\n단어(" + hiddenString.length() + "글자): " + outputString );

    drawMan(); //교수대 그림

//한 문자를 입력받아서 정답인지 확인하는 파트
    do{
      checkChar(readChar()); //입력받는 메서드=>확인절차
      System.out.println("\n단어(" + hiddenString.length() + "글자): " + outputString );
      drawMan(); //입력한 문자에 따라서 교수대 출력
    } while((reminder >0) && (failed < 6)); 
    //reminder가 0 초과 실패횟수 failed 5미만까지 허용

    return failed;
  }

//이미 입력한 문자인지 검사하는 파트
  public void checkChar(char guess){
    boolean already = false;
    for (int i = 0; i < inputString.length(); i++){
      if (inputString.charAt(i)==guess){//답에 해당 문자가 있는지 조사
        System.out.println("\n이미 입력한 문자입니다! 다시 입력해주세요.");
        already = true;
      }
    }

//처음 입력하는 경우 입력한 문자열들의 모음에 추가
    if (!already) {inputString.append(guess);

//입력하는 문자가 답에 있는지 확인하는 파트
      boolean success = false;
      for (int i = 0; i < hiddenString.length(); i++){
        if (hiddenString.charAt(i)== guess){//답에 해당하는 문자가 있는지 조사
          outputString.setCharAt(i, guess);//답에 문자가 있으면 '-'를 해당문자로 변경
          reminder--; //맞힐 문자수 1 감소
          success=true; // 입력한 문자가 문제에 있었음을 나타낸다
        }
      }
      if (!success) failed++; // 입력한 문자가 문제에 없으면 실패횟수 1 증가
    }
  }


//교수대 그림그리기

  public void drawMan(){
    System.out.println("  ┌──┐");
    System.out.println("  │    │");

    switch(failed){
      case 0:
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 1:
        System.out.println("  ◑    │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 2:
        System.out.println("  ◑    │");
        System.out.println("┌┼    │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 3:
        System.out.println("  ◑    │");
        System.out.println("┌┼    │");
        System.out.println("  │    │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 4:
        System.out.println("  ◑    │");
        System.out.println("┌┼┐  │");
        System.out.println("  │    │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 5:
        System.out.println("  ◑    │");
        System.out.println("┌┼┐  │");
        System.out.println("  │    │");
        System.out.println("┌┴    │");
        System.out.println("│      │");
        System.out.println("        │");
        break;
      case 6:
        System.out.println("  ◑    │");
        System.out.println("┌┼┐  │");
        System.out.println("  │    │");
        System.out.println("┌┴┐  │");
        System.out.println("│  │  │");
        System.out.println("        │");
        break;
    }
  
  }

//글자 입력
  public char readChar() throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String user;
    System.out.print("문자를 입력하세요 : ");
    user = in.readLine(); 
    return user.charAt(0);
  }


}
