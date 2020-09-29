class MyClass{
  static int object_num = 0;

  public MyClass(){
    object_num++;;
  }

  public static int getObjectNum(){
    return object_num;
  }
}
