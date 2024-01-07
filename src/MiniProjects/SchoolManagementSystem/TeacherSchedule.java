package MiniProjects.SchoolManagementSystem;
import java.util.*;

class TeacherSchedule {
    private Map<String, List<Course>> schedule;

    public TeacherSchedule() {
        this.schedule = new HashMap<>();
    }

    public void addCourseToSchedule(String dayOfWeek, Course course) {
        if (!schedule.containsKey(dayOfWeek)) {
            schedule.put(dayOfWeek, new ArrayList<>());
        }
        schedule.get(dayOfWeek).add(course);
    }

    public void removeCourseFromSchedule(String dayOfWeek, Course course) {
        if (schedule.containsKey(dayOfWeek)) {
            schedule.get(dayOfWeek).remove(course);
        }
    }

    public void displaySchedule() {
        for (Map.Entry<String, List<Course>> entry : schedule.entrySet()) {
            System.out.println("Day: " + entry.getKey());
            for (Course course : entry.getValue()) {
                System.out.println("- " + course.getCourseName());
            }
            System.out.println("-----------------------------");
        }
    }
}