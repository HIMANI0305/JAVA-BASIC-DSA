package Oops.Constructor;

class studen{
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  studen(){
    System.out.println("constructor called");
  }
}
public class NonParameterize {
  public static void main(String[] args) {
    studen s1 = new studen();
    s1.name = "vivek";
    s1.age = 23;

    s1.printInfo();
  }
}
