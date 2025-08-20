package Oops.Constructor;

class studeny{
  String name;
  int age;

  public void printInfo(String name){
    System.out.println(name);
  }
  public void printInfo(int age){
    System.out.println(age);
  }
  public void printInfo(String name, int age){
    System.out.println(name);
    System.out.println(age);
  }
}
public class PolymorPhism {
  public static void main(String[] args) {
    studen s1 = new studen();
    s1.name = "vivek";
    s1.age = 23;

    s1.printInfo();

  }
}
