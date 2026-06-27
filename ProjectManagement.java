interface Trackable{
    void trackProgress();
}

abstract class projectMember{
    private String name;
    private int id;

    projectMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    abstract void performRole();
}

class Developer extends projectMember{
    Developer(String name, int id) {
        super(name, id);
    }

    void performRole() {
        System.out.println(getName() + " is developing software");
    }

    void writeCode() {
        System.out.println("Writting code");
    }
}

class Manager extends projectMember{
    Manager(String name, int id) {
        super(name, id);
    }

    void performRole() {
        System.out.println(getName() + " Is managing the project ");
    }

    void manageProject() {
        System.out.println("Managing team and deadlines...");
    }
}

class Task implements Trackable{
    private String taskName;
    private String deadliine;

    Task(String taskName, String deadliine) {
        this.taskName = taskName;
        this.deadliine = deadliine;
    }

    public void trackProgress() {
        System.out.println("Task: " + taskName + " | Task deadline: " + deadliine);
    }
}

public class ProjectManagement {
    public static void main(String args[]) {
        projectMember dev = new Developer("Tahmid", 1);
        projectMember manager = new Manager("Jihad", 2);

        dev.performRole();
        manager.performRole();

        Task task1 = new Task("Make the Navbar ok", "10 July");
        Task task2 = new Task("Change the color of the login button", "5 July");
    }
}
