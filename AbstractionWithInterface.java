interface Animal {
    void walk();
    /*
     * Some rules about the interface
     * 1) We can not create any constructor inside a interface
     * 2) Interface' bhitore kono non-asbstract function thakte parbe na
     * 3) Interface'r bhitore function'r implementetion o thakte parbe na
     *
     * ekhane ami walk method'r shamne kichu likhi nai. I mean public or abstract
     * eta by default public and abstract thakbe jokhon interface'r bhitore ashbe arki
     */

    int eyes = 2;
    /*
    Ekhane ei value ta static thakbe
    oikhane baki shob subclass'r jonno same e thakbe
    you can not change the value
     */
}

interface Herbivore{
    // Herbivore muloto tarai jara plant khay
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    /*
    Horse is both an animal and Herbivore
    ebhabe 2 ta class'r property Horse class ta nise
    eta ke amra boli multiple inheritance
    jeta Java te class diye kora jay na kintu interface diye korte hoy
     */
}

public class AbstractionWithInterface {
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();
    }
}
