package interfaces.task2;

class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle implements Shape {

    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return (width + length) * 2;
    }
}

class Triangle implements Shape {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}

class Starter {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.6);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Triangle(2, 3, 4);

        for (Shape shape : shapes) {
            String className = shape.getClass().getName();
            System.out.println(className.substring(className.lastIndexOf(".")+1) + " имеет площадь " + shape.calculateArea());
        }
    }
}
