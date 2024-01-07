package MiniProjects.SchoolManagementSystem;


class Teacher {
    private String teacherId;
    private String name;
    private String department;

    public Teacher(String teacherId, String name, String department) {
        this.teacherId = teacherId;
        this.name = name;
        this.department = department;
    }

    // Getters and setters for Teacher attributes

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
