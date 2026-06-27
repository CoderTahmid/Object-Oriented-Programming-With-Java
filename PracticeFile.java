class A{
    private String name;
    private int age;

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
}

public class PracticeFile {
    public static void main (String args[]) {
        A a1 = new A();

        // a1.setName("Tahmid");
        // String name = a1.getName();
        System.out.println(a1.getName());
    }
}