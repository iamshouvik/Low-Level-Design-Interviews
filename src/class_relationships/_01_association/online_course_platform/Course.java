package class_relationships._01_association.online_course_platform;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();

    public Course(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        student.setEnrolledCourse(this);
    }
}
