class Main {
  public static void main(String[] args) {
    MyClass[] mc = new MyClass[10];

    for(int i = 0; i <10 ; i++){
      mc[i] = new MyClass();
      System.out.println("MyClass Instance의 수 : " + mc[0].getObjectNum() + "개");
    }
  }
}

/*

main()앞에는 항상, 반드시 static 선언을 해야한다.

static 기본 사용법은
static 데이터형 변수명;  static 반환형 메서드이름(변수들...)

static으로 선언된 변수, 메서드 객체와는 상관없이 호출할 수 있다는 의미. 따라서 객체를 생성할 필요없이 클래스 이름만으로도 사용할 수 있다.

예를들면 Math 클래스는 대부분 메서드를 static으로 선언했기 때문에 간단한 계산을 할 때 매번 객체를 생성할 필요 없이 바로 사용 가능하다.
예를들어 abs(절댓값)=> static으로 선언이 되어있기 때문에 int x = Math.abs(x);로 사용
객체를 생성해서 사용해야 한다면
Math m = math(); //인스턴스 생성
int x = m.abs(x); //매서드 호출
형태로 써야함

총정리
1.static메서드는 오직 static변수만 사용할 수 있다.
2.static메서드는 오직 같은 클래스 내에서의 static 매서드만 호출 할 수 있다.
3.static 메서드는 this를 사용할 수 없다.
4.static 메서드와 일반 메서드는 오버라이딩 될 수 없다.

static은 특정한 인스턴스에 속하지 않는다.
같은 클래스로 생성한 객체들이 값을 공유하고 싶을 때 static을 사용하면 좋다.
타 언어에서 전역변수의 역할로 사용되기도 한다.

*/
