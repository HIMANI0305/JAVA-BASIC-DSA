package Inheritance;

import Inheritance.shape.triangle;

class shape{
  public void area(){
    System.out.println("Display");
  }
  class triangle extends shape{
    public void area(int l, int h){
      System.out.println(1/2 *l*h);
    }
  }
}
public class SinglLevel {
  public static void main(String[] args) {
    
    
  }
}
