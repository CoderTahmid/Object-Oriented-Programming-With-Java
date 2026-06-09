class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        /*
         * Polymorphisom is 2 types:
         * 1) Function overloading (Compile time polymorphism)
         * 2) Function overwritting (Run time polymorphism)
         */

        Student s1 = new Student();
        s1.name = "Tahmid";
        s1.age = 10;

        s1.printInfo(s1.age); // Output: 24
        s1.printInfo(s1.name, s1.age); // Output: Name: Tahmid Age: 10
        s1.printInfo(s1.name); // Output: Tahmid

        /*
        Ekhane amra dekhte partasi je
        ei printInfo function tar name same e ase
        but kaj different different kortase
        ekbar name print kortase, ekbar age. 
        and ei concept kei polymorphism bole
        and ebhabe function name same rekhe different kaj korake function overloading bole
        and each function e must kono ekta differentiating factor thakte hbeh must. 
         */
    }
}