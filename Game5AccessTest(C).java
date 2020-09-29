public class C{
  protected int c;
  
  protected void method_C(){
    c = 300;
  }
}

/*

protected는 상속을 위한 접근제어자이다.
protected로 선언된 변수, 메서드는 해당 클래스를 상속받은 서브클래스에게만 public으로 동작하고, 서브 클래스가 아닌 클래스들에게는 private로 동작한다. 즉, 서브클래스와 자기자신의 클래스에서만 사용 가능하다.

*/
