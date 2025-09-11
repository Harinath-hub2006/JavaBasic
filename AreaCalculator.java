abstract class Shape{
    abstract void printArea();
}
class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void printArea(){
        System.out.println("Area of the Rectangle: "+length * width);
    }
}
class Triangle extends Shape{
    double base, height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    void printArea(){
        System.out.println("Area of the Triangle: "+0.5 * base * height);
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    void printArea(){
        System.out.println("Area of the Circle: "+Math.PI * radius * radius);
    }
}
public class AreaCalculator {
    public static void main(String[] args){
        Shape rect = new Rectangle(5, 10);
        Shape tri = new Triangle(5, 10);
        Shape circ = new Circle(5);
        rect.printArea();
        tri.printArea();
        circ.printArea();
    }    
}
