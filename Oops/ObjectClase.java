package Oops;

class Pen{
  String color;
  String type;

  public void write(){
    System.out.println("Writing something.");
  }
  public void printColor(){
    System.out.println(this.color);
  }
}

public class ObjectClase {
  public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "red";
    pen1.type = "gel";

    Pen pen2 = new Pen();
    pen2.color = "blue";
    pen2.type = "ballpoint";

    pen1.printColor();
    pen2.printColor();
  }
}
