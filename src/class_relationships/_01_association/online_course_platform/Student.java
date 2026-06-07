package class_relationships._01_association.online_course_platform;

public class Student {
    private String name;
    private Course enrolledCourse;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(Course course) {
        this.enrolledCourse = course;
    }

    public String getInstructorName() {
        if(enrolledCourse != null && enrolledCourse.getInstructor() != null){
            return enrolledCourse.getInstructor().getName();
        }
        return "No instructor assigned!";
    }
}
