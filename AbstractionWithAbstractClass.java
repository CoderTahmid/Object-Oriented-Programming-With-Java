abstract class Animal {
    public void walk() {

    }

    /*
     * ekhane ei class ke abstract korar reason ta hocche je:
     * amra jodi niche dekhi, tahole dekhbo je
     * amra prai shob class ei "Animal" class ke inherit kore rakhsi.
     * to user'r kache ei "Animal" class ta irrelavent.
     * I mean user ke jana lgbe na ei Animal class'r bepare
     * karon already baki other class e ei Animal class ke inherit kora hoise
     * er jonne ei class ke abstract kora hoise
     * 
     * "abstract" ei keyword tar mane thik etar meaning er motoi.
     * I mean abstract bolte amra emon kichu ke bujhai jeta kina dhora jay, it's just a thinking or
     * jetar kono hardcore body nai.
     * thik temon e 
     * ei Animal class ta ekta abstract, je etar kono object hbe na
     * eta just exist e korbe as a thought
     */

    public void eat(){
        System.out.println("Animal eats");
    }

    // Constructor
    Animal() {
        System.out.println("You are creating a new Animal");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    // Constructor
    Horse() {
        System.out.println("You are creating a new Horse");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class AbstractionWithAbstractClass {
    public static void main(String args[]) {
        /*
         * Abstraction Java te 2 bhabe implement kora jay
         * 1) Abstraction class banaya
         * 2) By making interface
         */

        Horse horse = new Horse();
        horse.walk(); // Output: Walks on 4 legs
        horse.eat(); // Output: Animal eats

        /*
         * After adding the constructor:
         * constructor add korar por the output is:
         * 
         * "
         * You are creating a new Animal
         * You are creating a new Horse
         * Walks on 4 legs
         * Animal eats
         * "
         * 
         * ekhn bishoy ta hocche, amra dekhte pai
         * ekhane age Animal'r constructor ke call kora hoise
         * then Horse'r ta
         * er mane 
         * age base class' constructor (Animal) call kora hoy
         * then children class or derived class'r (Horse) constructor call kora hoy
         * etake constructor chaining bole
         */
    }
}
