public class Shape<T extends  BaseShape>{
   private T s;
   public Shape(){

   }
   public Shape(T s){
       this.s =s;
   }

public void add(T s){
       this.s =s;
}

   public T get(){
       return this.s;
   }

   public double getArea(){
       return s.getArea();
   }

}

abstract class BaseShape{
    public abstract double getArea();
}

class Square extends BaseShape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public double getArea(){
        return a*a;
    }
}

class Rectangle extends BaseShape{
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public double getArea(){
        return this.breath * this.length;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
}

class Circle extends BaseShape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
}
