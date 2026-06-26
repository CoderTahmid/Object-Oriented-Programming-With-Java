package LabTask;

interface FactoryOperations {
    void factoryOpen();
    void factoryClose();
    void factoryRepair();
    void changeMachines();
    void recruitEmployees();
    void paySalaryToEmployees();
}

abstract class FactoryBase implements FactoryOperations {
    String factoryName;
    String location;
    
    // Constructor
    public FactoryBase(String factoryName, String location) {
        this.factoryName = factoryName;
        this.location = location;
    }

    public void showFactoryInfo() {
        System.out.println("Factory Name: " + factoryName);
        System.out.println("Location: " + location);
    }

    public void factoryOpen() {
        System.out.println("Factory is opening...");
    }

    public void factoryClose() {
        System.out.println("Factory is closing...");
    }
}

class FactoryManager extends FactoryBase {

    public FactoryManager(String factoryName, String location) {
        super(factoryName, location);
    }

    public void factoryRepair() {
        System.out.println("Repairing factory machines...");
    }

    public void changeMachines() {
        System.out.println("Changing or upgrading machines...");
    }

    public void recruitEmployees() {
        System.out.println("Recruitting employees...");
    }

    public void paySalaryToEmployees() {
        System.out.println("Paying salaries to employees...");
    }
}

interface EmployeeOperations {
    void displayEmployee();
}

class Employee implements EmployeeOperations {

    String name;
    int id;
    int salary;

    // Constructor
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

interface MachineOperations {
    void runMachine();
}

class Machine implements MachineOperations {

    String machineName;
    int machineId;

    // Constructor
    public Machine(String machineName, int machineId) {
        this.machineName = machineName;
        this.machineId = machineId;
    }

    public void runMachine() {
        System.out.println(machineName + " is running...");
    }
}

public class FactoryPatternManagement {
    public static void main(String[] args) {

        FactoryManager factory = new FactoryManager("Alpha Factory", "Dhaka");

        factory.showFactoryInfo();
        factory.factoryOpen();
        factory.recruitEmployees();
        factory.changeMachines();
        factory.factoryRepair();
        factory.paySalaryToEmployees();
        factory.factoryClose();

        System.out.println("\n--- Employee ---");
        Employee emp = new Employee("Tahmid", 101, 50000);
        emp.displayEmployee();

        System.out.println("\n--- Machine ---");
        Machine machine = new Machine("Cutter Machine", 501);
        machine.runMachine();
    }
}