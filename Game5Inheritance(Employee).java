public class Employee{
  String name;
  int salary;

  public Employee(String n, int s){
    name = n;
    salary = s;
  }

  public void getInformation(){
    System.out.println("이름 : " + name + ", 연봉 : " + salary);
  }
}
