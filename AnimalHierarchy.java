interface Pet {
    void play();
}

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "is eating");
    }

    abstract void makeSound();
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void walk() {
        System.out.println(getName() + " is walking ");
    }

    void makeSound() {
        System.out.println("Mammal is making sound");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(getName() + " is Flying ");
    }

    void makeSound() {
        System.out.println("Bird sound");
    }
}

class Dog extends Mammal implements Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Woof Woof");
    }

    public void play() {
        System.out.println(getName() + "Is Playing");
    }
}

class Eagle extends Bird {
    Eagle(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Screech");
    }
}

public class AnimalHierarchy {
    public static void main(String args[]) {
        Dog dog = new Dog("Buddy", 3);
        Eagle eagle = new Eagle("King", 20);

        dog.eat();
        dog.walk();
        dog.makeSound();
        dog.play();

        System.out.println();

        eagle.eat();
        eagle.fly();
        eagle.makeSound();

        System.out.println();

        Animal a1 = new Dog("Tahmid", 20);
        Animal a2 = new Eagle("Tking", 3342);
    }
}