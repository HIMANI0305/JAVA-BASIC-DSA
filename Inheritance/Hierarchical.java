package Inheritance;

class shape{
  public void area(){
    System.out.println("display");
  }
}
class triangle extends shape{
  public void area(int l, int h){
    System.out.println(1/2 *l*h);
  }
}
class circle extends shape{
  public void area(int r){
    System.out.println((3.14)*r*r);
  }
}
public class Hierarchical {
  public static void main(String[] args) {
    
  }
}
