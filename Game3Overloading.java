class Main {

  public static int max(int x, int y) {
    if (x>y) {
      return x;
      }else {
        return y;
      }
  }

  public static double max(double x, double y){
    if(x>y){
      return x;
    }else{
      return y;
    }
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println(max(a,b));

    double c = 10.5;
    double d = 20.5;
    System.out.println(max(c,d));
  }
}

//다형성

//C에서는 모든 함수의 이름이 달라야 하지만 자바에서는 인수의 개수나 종류가 다르면 같은 이름의 매서드를 얼마든지 정의할 수 있다.(method overloading)
//같은 이름의 매서드를 정의하는 것은 문제가 없지만 인수까지 동일한 메서드를 정의해서는 안된다.
