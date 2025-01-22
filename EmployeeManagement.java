// Superclass
class Employee {
    String empCode;
    String empName;
    String address;
    double pay;

    public Employee(String empCode, String empName, String address, double pay) {
        this.empCode = empCode;
        this.empName = empName;
        this.address = address;
        this.pay = pay;
    }

    public void display() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Pay: " + pay);
    }
}

// Subclass: Teaching
class Teaching extends Employee {
    String subjectSpecialization;
    String designation;

    public Teaching(String empCode, String empName, String address, double pay, String subjectSpecialization, String designation) {
        super(empCode, empName, address, pay);
        this.subjectSpecialization = subjectSpecialization;
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject Specialization: " + subjectSpecialization);
        System.out.println("Designation: " + designation);
    }
}

// Subclass: Office
class Office extends Employee {
    String position;

    public Office(String empCode, String empName, String address, double pay, String position) {
        super(empCode, empName, address, pay);
        this.position = position;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Position: " + position);
    }
}

// Subclass: Technical (extends Teaching)
class Technical extends Teaching {
    String researchArea;

    public Technical(String empCode, String empName, String address, double pay, String subjectSpecialization, String designation, String researchArea) {
        super(empCode, empName, address, pay, subjectSpecialization, designation);
        this.researchArea = researchArea;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Area: " + researchArea);
    }
}

// Subclass: Administrative and Accounts (extends Office)
class Administrative extends Office {
    public Administrative(String empCode, String empName, String address, double pay, String position) {
        super(empCode, empName, address, pay, position);
    }
}

class Accounts extends Office {
    public Accounts(String empCode, String empName, String address, double pay, String position) {
        super(empCode, empName, address, pay, position);
    }
}

// Main Class
public class EmployeeManagement {
    public static void main(String[] args) {
        Teaching teachingEmployee = new Teaching("T001", "Alice", "123 Street", 50000, "Mathematics", "Professor");
        Technical technicalEmployee = new Technical("T002", "Bob", "456 Avenue", 60000, "Computer Science", "Lecturer", "AI Research");
        Administrative adminEmployee = new Administrative("A001", "Charlie", "789 Road", 40000, "Manager");
        Accounts accountsEmployee = new Accounts("AC001", "Dave", "101 Boulevard", 35000, "Accountant");

        System.out.println("Teaching Employee Details:");
        teachingEmployee.display();
        System.out.println();

        System.out.println("Technical Employee Details:");
        technicalEmployee.display();
        System.out.println();

        System.out.println("Administrative Employee Details:");
        adminEmployee.display();
        System.out.println();

        System.out.println("Accounts Employee Details:");
        accountsEmployee.display();
    }
}
