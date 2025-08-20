package Inheritance;

class shape{
  public void area(){
    System.out.println("display");
  }
}
class triangle extends shape{
  public void area(int l, int h){
    System.out.println(1/2*l*h);
  }
}
class equilateral extends triangle{
   public void area(int l, int h){
    System.out.println(1/2*l*h);
   }
}
public class MultiLevel {
  
}
