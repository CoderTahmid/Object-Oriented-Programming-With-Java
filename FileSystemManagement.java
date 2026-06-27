interface Manageable{
    void create();
    void delete();
}

abstract class FileSystemItem{
    private String name;
    private double size;

    FileSystemItem(String name, double size) {
        this.name = name;
        this.size = size;
    }

    String getName() {
        return this.name;
    }

    double getSize() {
        return this.size;
    }

    abstract void displayInfo();
}

class File extends FileSystemItem implements Manageable{
    private String fileType;

    File(String name, double size, String fileType) {
        super(name, size);
        this.fileType = fileType;
    }

    void displayInfo() {
        System.out.println("File: " + getName() + " | Fize size: " + getSize() + " | File type: " + fileType);
    }

    public void create() {
        System.out.println("Creating a file");
    }

    public void delete() {
        System.out.println("Deleting a file");
    }
}

class Folder extends FileSystemItem implements Manageable{
    private int itemCount;

    Folder(String name, double size, int itemCount) {
        super(name, size);
        this.itemCount = itemCount;
    }

    void displayInfo() {
        System.out.println("Folder: " + getName() + " | Size: " + getSize() + " | Items: " + itemCount);
    }

    public void create() {
        System.out.println("Creating a folder");
    }

    public void delete() {
        System.out.println("Deleting a folder");
    }
}

public class FileSystemManagement {
    public static void main(String args[]) {
        FileSystemItem file  = new File("Notes", 3.2, "PDF");
        FileSystemItem folder = new Folder("KIng", 3.2, 22);

        file.displayInfo();
        folder.displayInfo();

        File myLife = new File("Assignment", 2.3, "DOCX");
        myLife.create();
        myLife.delete();
    }
}
