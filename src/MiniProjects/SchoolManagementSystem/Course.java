package MiniProjects.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private Map<Student, Integer> grades;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.grades = new HashMap<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
        grades.remove(student);
    }

    public void recordGrade(Student student, int grade) {
        if (enrolledStudents.contains(student)) {
            grades.put(student, grade);
            System.out.println("Grade recorded for " + student.getName() + ": " + grade);
        } else {
            System.out.println(student.getName() + " is not enrolled in this course.");
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}
