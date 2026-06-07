class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-parameterize constructor example
    Student() {
        System.out.println("Constructor called");
    }
}

class Teacher {
    String name;
    int age;
    String subject;

    // Parameter constructor example
    Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        /*
         * ekhane
         * "this.age" diye bujhacche Teacher class'r bhitore thaka property "age" jar
         * value hbe kina
         * parameter'r age.
         * ei parameter e jei data pass kora hbe sheta e hbe ei class'r property gular
         * value
         */
    }

    public void printInfo() {
        System.out.println("Teacher name is: "+this.name+ " Age: "+this.age+" Subject: "+this.subject);
    }
}

class Player{
    String name;
    int age;
    String gameType;

    Player(Player p2) {
        this.name = p2.name;
        this.age = p2.age;
        this.gameType = p2.gameType;
    }

    Player() {

    }
    
    public void printInfo() {
        System.out.println("Player details");
        System.out.println("Name: "+this.name+" Age: "+this.age+" Game: "+this.gameType);
    }
}

public class Constructors {
    public static void main(String args[]) {
        // Non-parameterize constructor example
        Student s1 = new Student(); // Output: Constructor called
        /*
         * Now let's talk about this "Student s1 = new Student();" line
         * firt of all ekhane "new" keyword ta memor'y bhire jayga allocate kore nicche
         * ei "new" diye amra kind of memory allocation kortesi
         * and ekhane "Student()"
         * eta hocche ekta function basically
         * this is a special type of function jar name hocche constructor
         * so by hearing the name we can say constructor means to construct something
         * right?
         * in Java constructors construct objects
         * 
         * There are total 3 types of constructors
         * 1) Non-parameter
         * 2) Parameterized constructor
         * 3) Copy constructor
         * 
         * Some basic things about constructors
         * --> constructor'r name hbe same as the class name
         * --> constructor kono kichu return kore na, no integer value, no character
         * value
         * --> constructors do not have any return type, like int, string void.
         * Litreally nothing
         * 
         * 
         * The Reason behind the output ----->
         * "Student s1 = new Student" ei line e basically constructor ke create kora
         * hoise
         * and ekhane ei constructor ke call kora hoise
         * er jonne oi line ta print hoise
         * 
         * 
         */

        // Parameter constructor example
        Teacher t1 = new Teacher("Tahmid", 22, "Programming");
        t1.printInfo();

        // Copy constructor example
        Player p1 = new Player();
        p1.name = "Messi";
        p1.age = 38;
        p1.gameType = "Football";

        Player p2 = new Player(p1);
        p2.printInfo();
    }
}
