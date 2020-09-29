class Main {
  public static void main(String[] args) {
    Dog yourDog = new Dog("벤지", 4);

    yourDog.bark();
    yourDog.bite("우체부");

    Snoopy myDog = new Snoopy();

    myDog.bark();//메서드 오버라이딩
    myDog.bite("낸시", 9);//메서드 오버로딩
  }
}

//자바에서는 인수의 개수나 종류가 다르면 얼마든지 같은 이름의 메서드를 생성할 수 있다. 이를 메서드 오버로딩이라 한다. 이와 비슷하지만 다른 개념인 메서드 오버라이딩(method overriding)또한 클래스의 상속에서 일어나는 다형성의 한 종류다. 
