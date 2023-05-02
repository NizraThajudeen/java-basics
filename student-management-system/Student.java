import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> enrolledCourse;

    public Student( String name){
        this.name= name;
        this.enrolledCourse = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(ArrayList<Course> enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrolledCourse=" + enrolledCourse +
                '}';
    }
}
