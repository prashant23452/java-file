// Abstract class Student
abstract class Student {
    private String name;
    private int id;

    // Constructor for Student
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract void giveExam();

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

// Subclass CseStudent
class CseStudent extends Student {
    public CseStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public void giveExam() {
        System.out.println("CSE Student is giving a Computer Science exam.");
    }
}

// Subclass ItStudent
class ItStudent extends Student {
    public ItStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public void giveExam() {
        System.out.println("IT Student is giving an Information Technology exam.");
    }
}

// Main class to test the implementation
public class Main2 {
    public static void main(String[] args) {
        // Part a) Creating objects of CseStudent and ItStudent
        CseStudent cseStudent = new CseStudent("Alice", 101);
        ItStudent itStudent = new ItStudent("Bob", 102);

        System.out.println("Calling giveExam() method for each object:");
        cseStudent.displayDetails();
        cseStudent.giveExam();

        itStudent.displayDetails();
        itStudent.giveExam();

        // Part b) Using a single reference of the Student class
        System.out.println("\nUsing a single Student reference:");
        Student studentRef;

        // Referring to a CseStudent object
        studentRef = cseStudent;
        studentRef.displayDetails();
        studentRef.giveExam();

        // Referring to an ItStudent object
        studentRef = itStudent;
        studentRef.displayDetails();
        studentRef.giveExam();
    }
}
