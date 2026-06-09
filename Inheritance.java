class Shape {
    String color;

    public void area() {
        System.out.println("Displays area");
    }
}

// Single level inheritance
class Triangle extends Shape {
    /*
     * Ei triangle class'r bhitore automatically ei
     * color property ta ashbe jodio amra ekhane oita define kori nai
     * 
     * jei class theke property/method niye asha hoy oita ke amra "Base class" or
     * "Parent class" bole
     * and jei class property/method niye ashe tar moddhe take amra "Sub class" or
     * "Child class" bole
     * ekhane Shape class ta hocche parent class
     * and Triangle class ta hocche child class, karon
     */  

    public void area (int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

// Multi level inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

// Hierarchical inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) *  r * r );
    }

    /*
     * Ekta base class ke jokhon onek gula
     * child class e inherit kora hoy tokhon take Hierarchical inheritance bole
     */
}

// Hybrid inheritance


public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "Red";

    }
}
