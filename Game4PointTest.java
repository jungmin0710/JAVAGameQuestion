
class Main {
  public static void main(String[] args) {
    Point p = new Point();
    p.x = 10;
    p.y = 20;
    p.printXY();
  }
}

class Point {//클래스
  int x;
  int y;

  public void printXY(){//메서드
    System.out.println("x = " + x + ", y = " + y);
  }
}


/*

-객체지향 프로그래밍(OOP Object Oriented Programming)
OOR 3R : 가독성(Readablity), 재사용성(Reuseablity), 신뢰성(Reliablity) => 쉽게 알아볼 수 있고, 다시 쓸 수 있고, 협업시 다른 프로그래머가 만든 내용에 대해 신뢰성을 가짐.
예전에는 작은 프로그램이 좋은 프로그램이라 여겨졌다. 하지만 지금은 꼭 그렇지만은 않다.

-Class 클래스(책) = 변수(예를들어 페이지 수 , 제목, 가격) + 메서드(읽기, 사기, 쓰기 등)
클래스로 객체(인스턴스)를 생성. 각각의 객체는 각각의 고유한 특성을 가진다

*/
