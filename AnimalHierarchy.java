interface Pet{
    void play();
}

abstract class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) throws Exception {
        if (age <= 0) {
            throw new ArithmeticException("Age can not be zero  or less than zero");
        }
        
        this.name = name;
        this.age = age;
    }   

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    abstract void makeSound();
}

class Dog extends Animal implements Pet{
    public Dog(String name, int age) throws Exception {
        super(name, age);
    }

    void makeSound(){
        System.out.println("Woof woof");
    }

    public void play() {
        System.out.println(getName() + " is playing");
    }
}

class Eagle extends Animal {
    public Eagle(String name, int age) throws Exception {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Sheeech");
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }
}

class AnimalThread extends Thread {
    Animal animal;

    AnimalThread(Animal animal) {
        this.animal = animal;
    }

    public void run() {
        animal.eat();
        animal.makeSound();
    }
}

public class AnimalHierarchy {
    public static void main(String args[]) {
        try {
            Dog dog  = new Dog("Tahmid", 10);
            Eagle eagle = new Eagle("King", 20);

            dog.eat();
            dog.makeSound();
            dog.play();

            System.out.println();

            eagle.eat();
            eagle.makeSound();
            eagle.fly();

            System.out.println();

            AnimalThread t1 = new AnimalThread(dog);
            AnimalThread t2 = new AnimalThread(eagle);

            t1.start();
            t2.start();

            int x = 10;
            int y = 0;
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Prograam finished");
        }
    }
}