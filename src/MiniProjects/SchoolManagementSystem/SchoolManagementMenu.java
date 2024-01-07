package MiniProjects.SchoolManagementSystem;
import java.util.*;


public class SchoolManagementMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        TeacherSchedule teacherSchedule = new TeacherSchedule();
        List<Course> courses = new ArrayList<>();
        

        Teacher teacher1 = new Teacher("T001", "Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("T002", "Ms. Johnson", "Science");

        Course course1 = new Course("C001", "Math101", teacher1);
        Course course2 = new Course("C002", "Physics101", teacher2);
        Course course3 = new Course("C003", "Biology101", teacher2);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        int choice;
        do {
            System.out.println("----- School Management Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Remove Student from Course");
            System.out.println("5. Record Grade");
            System.out.println("6. Display Enrolled Students in Course");
            System.out.println("7. Display Teacher Schedule");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent(studentList, scanner);
                    break;
                case 2:
                    removeStudent(studentList, scanner);
                    break;
                case 3:
                    enrollStudentInCourse(studentList, courses, scanner);
                    break;
                case 4:
                    removeStudentFromCourse(studentList, courses, scanner);
                    break;
                case 5:
                    recordGrade(courses, scanner);
                    break;
                case 6:
                    displayEnrolledStudentsInCourse(courses, scanner);
                    break;
                case 7:
                    displayTeacherSchedule(teacherSchedule);
                    break;
                case 8:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 8);

        scanner.close();
    }





    private static void addStudent(StudentList studentList, Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Student student = new Student(studentId, name, age);
        studentList.addStudent(student);
        System.out.println("Student added successfully!");
    }

    private static void removeStudent(StudentList studentList, Scanner scanner) {
        System.out.print("Enter Student ID to remove: ");
        String studentId = scanner.nextLine();

        Student studentToRemove = studentList.findStudentById(studentId);
        if (studentToRemove != null) {
            studentList.removeStudent(studentToRemove);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void enrollStudentInCourse(StudentList studentList, List<Course> courses, Scanner scanner) {
        System.out.println("Available Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
        }
        System.out.print("Enter the index of the course to enroll in: ");
        int courseIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Student ID to enroll: ");
        String studentId = scanner.nextLine();

        Student studentToEnroll = studentList.findStudentById(studentId);
        if (studentToEnroll != null) {
            if (courseIndex >= 0 && courseIndex < courses.size()) {
                courses.get(courseIndex - 1).enrollStudent(studentToEnroll);
                System.out.println(studentToEnroll.getName() + " enrolled in the course successfully!");
            } else {
                System.out.println("Invalid course index.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void removeStudentFromCourse(StudentList studentList, List<Course> courses, Scanner scanner) {
        System.out.println("Available Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
        }
        System.out.print("Enter the index of the course: ");
        int courseIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Student ID to remove from course: ");
        String studentId = scanner.nextLine();

        Student studentToRemove = studentList.findStudentById(studentId);
        if (studentToRemove != null) {
            if (courseIndex >= 0 && courseIndex < courses.size()) {
                courses.get(courseIndex - 1).removeStudent(studentToRemove);
                System.out.println(studentToRemove.getName() + " removed from the course successfully!");
            } else {
                System.out.println("Invalid course index.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void recordGrade(List<Course> courses, Scanner scanner) {
        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine();

        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                System.out.print("Enter Student ID: ");
                String studentId = scanner.nextLine();

                Student student = course.getEnrolledStudents().stream()
                        .filter(s -> s.getStudentId().equals(studentId))
                        .findFirst().orElse(null);

                if (student != null) {
                    System.out.print("Enter Grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    course.recordGrade(student, grade);
                } else {
                    System.out.println("Student not enrolled in this course.");
                }
                return;
            }
        }
        System.out.println("Course not found.");
    }

    private static void displayEnrolledStudentsInCourse(List<Course> courses, Scanner scanner) {
        System.out.println("Enter Course ID: ");
        System.out.println("C001 - Math101");
        System.out.println("C002 - Physics101");
        System.out.println("C003 - Biology101");

        String courseId = scanner.nextLine();

        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                course.displayEnrolledStudents();
                return;
            }
        }
        System.out.println("Course not found.");
    }

    private static void displayTeacherSchedule(TeacherSchedule teacherSchedule) {
        teacherSchedule.displaySchedule();
    }
}