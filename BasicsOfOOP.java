class Pen {
    String color;
    String type;

    public void write() { // This is a method of thi Pen class
        System.out.println("Writting something");
    }

    public void printColor() {
        System.out.println(this.color);
        /*
         * "this" diye basically bujhay je jei object e take call korbe
         * tar color she print korbe emon arki
         */
    }
}

class Student{ 
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }


}

public class BasicsOfOOP {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        /*
         * So this is an object
         * at first "Pen" likhe amra er data type ta define kore dilam which is Pen
         * and etar name hocche pen1
         */

        pen1.color = "Blue"; // This is how we define a value
        pen1.type = "Gel";
        pen1.write(); // Output: writting something, and this is how we call a method

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball point";

        pen1.printColor();

        Student s1 = new Student();

        s1.name = "Tahmid";
        s1.age = 22;

        s1.printInfo();

    }
}
