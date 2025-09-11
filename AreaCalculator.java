abstract class Shape{
    double dim1, dim2;
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(double length, double width){
        this.dim1 = length;
        this.dim2 = width;
    }
    @Override
    void printArea(){
        System.out.println("Area of the Rectangle: "+dim1 * dim2);
    }
}
class Triangle extends Shape{
    Triangle(double base, double height){
        this.dim1 = base;
        this.dim2 = height;
    }
    @Override
    void printArea(){
        System.out.println("Area of the Triangle: "+0.5 * dim1 * dim2);
    }
}
class Circle extends Shape{
    Circle(double radius){
        this.dim1 = radius;
    }
    @Override
    void printArea(){
        System.out.println("Area of the Circle: "+Math.PI * dim1 * dim1);
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
