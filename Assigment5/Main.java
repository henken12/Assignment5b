package Assigment5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0]=new Circle("green",2);
        shapes[1] = new Square("brown",3);
        shapes[2] = new Rectangle("brown ", 4,2);
        shapes[3] = new Circle("black",1.3);
        shapes[4] = new Square("blue",3.2);
        printTotal(shapes);

    }
    public static void printTotal(Shape[] shapes){
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for(Shape shape:shapes){
            totalArea+=shape.calculateArea();
            totalPerimeter+=shape.calculatePerimeter();
        }
        System.out.println("Total area of all shapes is: "+totalArea);
        System.out.println("Total perimeter of all shapes is: "+ totalPerimeter);

    }

}
