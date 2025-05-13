// Custom Date class
class MyDate {
    int day, month, year;

    MyDate(String date) {
        if (date.contains("-")) {
            String[] parts = date.split("-");
            if (parts[0].length() == 4) {
                // Format: YYYY-MM-DD
                year = Integer.parseInt(parts[0]);
                month = Integer.parseInt(parts[1]);
                day = Integer.parseInt(parts[2]);
            } else {
                // Format: DD-MM-YYYY
                day = Integer.parseInt(parts[0]);
                month = Integer.parseInt(parts[1]);
                year = Integer.parseInt(parts[2]);
            }
        }
    }

    int calculateAge(MyDate currentDate) {
        int age = currentDate.year - this.year;

        // If birthday hasn't occurred yet this year
        if (currentDate.month < this.month || 
           (currentDate.month == this.month && currentDate.day < this.day)) {
            age--;
        }
        return age;
    }
}

// Person class
class Person {
    String name;
    MyDate dob;

    Person(String name, String dobString) {
        this.name = name;
        this.dob = new MyDate(dobString);
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    void displayAge(MyDate currentDate) {
        int age = dob.calculateAge(currentDate);
        System.out.println("Age: " + age);
    }
}

// Employee class inherits Person
class Employee extends Person {
    int emp_id;
    double salary;

    Employee(String name, String dobString, int emp_id, double salary) {
        super(name, dobString);
        this.emp_id = emp_id;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        displayName();
        MyDate currentDate = new MyDate("2025-05-13"); // Hardcoded today's date
        displayAge(currentDate);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Salary: ₹" + salary);
    }
}

// Main class
public class Employee_Details{
    public static void main(String[] args) {
        Employee emp = new Employee("Sulocha Yatageri", "2003-08-15", 101, 55000.0);
        emp.displayEmployeeDetails();

      
    }
}
