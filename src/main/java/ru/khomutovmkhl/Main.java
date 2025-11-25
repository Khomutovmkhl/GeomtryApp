package ru.khomutovmkhl;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 5, 5);
        Rectangle rectangle = new Rectangle(5, 5);

        Sphere sphere = new Sphere(5);
        Pyramid pyramid = new Pyramid(5, 5, 5);
        Parallelepiped parallelepiped = new Parallelepiped(5, 5, 5);


        System.out.println("|++++++++++++++++++++++++++++++++++++++++++|");

        System.out.println("Circle" +
                "\n   Area: " + circle.area() +
                "\n   Perimeter: " + circle.perimeter() +
                "\n   Perimeter in feet: " + GeometryUtils.metersToFeet(circle.perimeter()));
        System.out.println("Triangle" +
                "\n   Area: " + triangle.area() +
                "\n   Perimeter: " + triangle.perimeter() +
                "\n   Perimeter in feet: " + GeometryUtils.metersToFeet(triangle.perimeter()));
        System.out.println("Rectangle" +
                "\n   Area: " + rectangle.area() +
                "\n   Perimeter: " + rectangle.perimeter() +
                "\n   Perimeter in feet: " + GeometryUtils.metersToFeet(rectangle.perimeter()));

        System.out.println("|++++++++++++++++++++++++++++++++++++++++++|");

        System.out.println("Sphere" +
                "\n   Surface Area: " + sphere.calculateSurfaceArea() +
                "\n   Volume: " + sphere.calculateVolume() +
                "\n   Surface Area in feet: " + GeometryUtils.metersToFeet(sphere.calculateSurfaceArea()));
        System.out.println("Pyramid" +
                "\n   Surface Area: " + pyramid.calculateSurfaceArea() +
                "\n   Volume: " + pyramid.calculateVolume() +
                "\n   Surface Area in feet: " + GeometryUtils.metersToFeet(pyramid.calculateSurfaceArea()));
        System.out.println("Parallelepiped" +
                "\n   Surface Area: " + parallelepiped.calculateSurfaceArea() +
                "\n   Volume: " + parallelepiped.calculateVolume() +
                "\n   Surface Area in feet: " + GeometryUtils.metersToFeet(parallelepiped.calculateSurfaceArea()));

        System.out.println("|++++++++++++++++++++++++++++++++++++++++++|");
    }
}