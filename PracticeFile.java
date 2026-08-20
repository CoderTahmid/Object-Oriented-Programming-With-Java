// class Animal{
//     private String name;

//     Animal(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

class Animal{
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(getName() + " says: woof woof!");
    }
}

class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    public void sound () {
        System.out.println(getName() + " Says: meow meow");
    }
}

public class PracticeFile {
    public static void main(String args[]) {
        Dog dog = new Dog("King");
        Cat cat = new Cat("Moem");

        dog.sound();
        cat.sound();

        System.out.println("Dog name: " + dog.getName());
        dog.setName("Maruf");
        System.out.println("Updated dog name: " + dog.getName());
    }
}