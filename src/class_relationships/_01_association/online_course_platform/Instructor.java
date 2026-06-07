package class_relationships._01_association.online_course_platform;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Instructor(String name) {
        this.name = name;
    }

    public void addCourse(Course course){
        courses.add(course);
        course.setInstructor(this);
    }

    public String getName(){
        return name;
    }

    public List<Course> getCourses(){
        return courses;
    }
}
