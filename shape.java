public  abstract class shape { // Abstraction (abstract class)
    private String color; // Encapsulation (private field)

    public shape(String color) { // Constructor
        this.color = color;//parameterized constructor
    }

    public String getcolor() { // Encapsulation (getter method)
        return color;
    }

    public abstract double calculateArea(); // Abstraction + Polymorphism (abstract method)
}

public class Circle extends shape { // Inheritance
    private double radius ; // Encapsulation

    public Circle(String color,double radius){ // Constructor chaining
        super(color); // Calls parent constructor
        this.radius=radius;
    }

    @Override // Method Overriding (Polymorphism)
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

public class Rectangle extends shape { // Inheritance
    private double width;  // Encapsulation
    private double height; // Encapsulation

    public Rectangle(String color,double width,double height){ // Constructor chaining
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override // Method Overriding (Polymorphism)
    public double calucalateArea(){
        return width*height;
    }
}

public class Practice{ // main class
    public static void main(String[] args){

    }
}
