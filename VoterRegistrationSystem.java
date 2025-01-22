import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a common person
class Person {
    private int id;
    private String name;
    private String gender;
    private LocalDate dateOfBirth;

    // Constructor
    public Person(int id, String name, String gender, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Calculate age of the person
    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person [ID=" + id + ", Name=" + name + ", Gender=" + gender + ", DateOfBirth=" + dateOfBirth + "]";
    }
}

// Class to represent a valid voter
class Voter {
    private Person person;

    public Voter(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Voter [ID=" + person.getId() + ", Name=" + person.getName() + "]";
    }
}

// Custom Exception for Invalid Voter
class InvalidVoterException extends Exception {
    public InvalidVoterException(String message) {
        super(message);
    }
}

// Main class to demonstrate functionality
public class VoterRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Voter> validVoters = new ArrayList<>();
        ArrayList<Person> invalidVoters = new ArrayList<>();

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Input details of each person
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            LocalDate dob = LocalDate.parse(scanner.nextLine());

            people.add(new Person(id, name, gender, dob));
        }

        // Attempt to register each person as a voter
        for (Person person : people) {
            try {
                registerAsVoter(person, validVoters);
            } catch (InvalidVoterException e) {
                invalidVoters.add(person);
                System.out.println("Error: " + e.getMessage());
            }
        }

        // List all registered voters
        System.out.println("\nRegistered Voters:");
        for (Voter voter : validVoters) {
            System.out.println(voter);
        }

        // List all invalid voters
        System.out.println("\nInvalid Voters:");
        for (Person invalid : invalidVoters) {
            System.out.println(invalid);
        }
    }

    // Method to register a person as a voter
    public static void registerAsVoter(Person person, ArrayList<Voter> validVoters) throws InvalidVoterException {
        if (person.getAge() < 18) {
            throw new InvalidVoterException(
                "Person " + person.getName() + " (ID: " + person.getId() + ") is below 18 years old and cannot be registered as a voter."
            );
        } else {
            validVoters.add(new Voter(person));
        }
    }
}
