class Main {
  public static void main(String[] args) {
    int x, y, z;

    x = y = z = 1;
    z += x + y;
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);

    x += y -= z= 5;//뒤에서부터 하나씩 생각하면 쉬울 듯
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
  }
}
