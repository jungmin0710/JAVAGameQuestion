//재귀호출

class Main {

  public static int power(int x, int y){
    if(y <= 0){
      return 1;
    }else {
      return x * power(x, y-1); 
    }
  }

//while문 메서드

  // public static int power(int x, int y){
  //   int result = 1;
  //   while (y > 0) {
  //     result *= x;
  //     y--;
  //   }
  //   return result;
  // }

  public static void main(String[] args) {
    System.out.println("power(2,1) : " + power(2,1));
    System.out.println("power(2,2) : " + power(2,2));
    System.out.println("power(2,3) : " + power(2,3));
    System.out.println("power(2,4) : " + power(2,4));
    System.out.println("power(2,5) : " + power(2,5));

  }
}
