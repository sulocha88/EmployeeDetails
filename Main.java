

class Student {
    String name;
    String dob; 

    Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        int birthYear;

        if (dob.contains("-")) {
            String[] parts = dob.split("-");
            if (parts[0].length() == 4) {
                birthYear = Integer.parseInt(parts[0]); // "YYYY-MM-DD"
            } else {
                birthYear = Integer.parseInt(parts[2]); // "DD-MM-YYYY"
            }
            int age = 2025 - birthYear;
            System.out.println("Age: " + age);
        } else {
            System.out.println("Invalid DOB format.");
        }
    }
}

class CourseInfo {
    String semester;
    String[] courses;
    int[] marks;

    CourseInfo(String semester, String[] courses, int[] marks) {
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    void displayCourseInfo() {
        System.out.println("Semester: " + semester);
        System.out.println("Courses and Marks:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + " - " + marks[i] + " marks");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sulocha Yatageri", "17-05-2004");
        student.displayStudentDetails();

        String[] courses = {"Mathematics", "Computer Science", "English"};
        int[] marks = {85, 90, 88};

        CourseInfo courseInfo = new CourseInfo("Semester 1", courses, marks);
        courseInfo.displayCourseInfo();
    }
}
