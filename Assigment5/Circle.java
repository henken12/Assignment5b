package Assigment5;

public class Circle extends Shape {
    private Double radius;
    Circle(String color, double radius){
     super(color);
     this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
