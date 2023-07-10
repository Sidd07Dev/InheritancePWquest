abstract class Shape {
    abstract void calculateArea();

}

class Rectangle extends Shape {
    int a, b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void calculateArea() {

        System.out.println("Area is " + a * b);
    }
}

class Circle extends Shape {
    final double pie = 3.14;
    int r;

    Circle(int r) {
        this.r = r;
    }

    void calculateArea() {

        System.out.println("Area of circle is" + pie * r * r);
    }

}

class Triangle extends Shape {
    int a, b, c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calculateArea() {
        System.out.println("area of triangle is" + a * b * c);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Triangle ob=new Triangle(10, 5, 7);
        Circle ob1=new Circle(6);
        Rectangle ob2=new Rectangle(7, 8);
        ob.calculateArea();
        ob1.calculateArea();
        ob2.calculateArea();
    }
}
