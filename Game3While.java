class Main {
  public static void main(String[] args) {
    int i, j;

    i = 10;//줄
    while (i>0){
      j = 0;//개수
      while (j<i){
        System.out.print("*");
        j++;
      }
      System.out.println();
    System.out.println();
    i--;
    }
  }
}

//자바에서는 반복문으로 3가지가 존재한다. while, dowhile, for
//c와의 차이점은 자바에서의 반복문에서는 조건에 반드시 boolean형을 사용한다는 것이다.
//while에서 주의할 점은 무한루프에 빠질 수 있다는 점이다.
