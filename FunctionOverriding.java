class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Ghew Ghew");
    }
}
x
public class FunctionOverriding {
    public static void main(String args[]) {
        Dog d = new Dog();

        d.sound(); // Output: Ghew Ghew

        /*
         * ekhane parent class (Animal) e sound() method define kora ache
         * and sekhane ekta random printing line dewa.
         * but amra jokhon dog class e eita ke inherit korlam
         * tokhon ei method'r kaj change kore dilam
         * eta kei function overriding bole
         */
    }
}
