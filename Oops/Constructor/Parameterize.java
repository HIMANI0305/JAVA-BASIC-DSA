package Oops.Constructor;


class student{
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  student(String name, int age){
    this.name = name;
    this.age=age;
  }
}
public class Parameterize {
  public static void main(String[] args) {
    studen s1 = new studen();
    s1.name = "himu";
    s1.age = 21;

    s1.printInfo();
  }
}
