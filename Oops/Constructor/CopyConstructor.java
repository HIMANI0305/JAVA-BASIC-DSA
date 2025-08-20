package Oops.Constructor;

class student{
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  student(studen s2){
    this.name = s2.name;
    this.age = s2.age;
  }
  student(){

  }
}
public class CopyConstructor {
  public static void main(String[] args) {
    student s1 = new student();
    s1.name = "vivek";
    s1.age =23;

    studen s2 = new studen();
    s2.printInfo();
  }
}
