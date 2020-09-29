class Main {
  public static void main(String[] args) {
    Clock c = new Clock(10,55,16);
    c.printTime();
  }
}

class Clock{
  int hour;
  int min;
  int sec;

  public Clock(int h, int m, int s){
    hour = h;
    min = m;
    sec = s;
  }
//생성자
  public void printTime(){
    System.out.println(hour + ":" + min + ":" + sec);
  }
}

/*

클래스를 사용할 때 new명령어를 사용한다.
클래스 이름 변수 = new 클래스이름(인수들)
s를 통해서 클래스 내부로 접근
접근할때는 s.매써드 s.pop() 이런식으로 접근해야함.(호출방식)

생성자를 사용시 public 클래스이름(매개변수들..{//명령어들}) 식으로 사용할 것
1.public으로 선언(외부에서 봐야하므로) 
2.반환형은 없음(return을 쓰지 않음)

*/
