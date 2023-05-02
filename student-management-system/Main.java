import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student std = new Student("Anne");
        Student std1 = new Student("Mike");
        Student std2 = new Student("Claire");

        Course cr1 = new Course(1, "Maths");
        Course cr2 = new Course(2, "Science");
        Course cr3 = new Course(3, "IT");

        HashMap<Integer, Student> students = new HashMap<Integer, Student>();

        // add students
        students.put(1, std);
        students.put(2, std1);
        students.put(3, std2);

        System.out.println("add students");
        displayDetails(students);

        // remove students
        students.remove(2);

        System.out.println("remove students");
        displayDetails(students);

        // enroll student 1 to Maths & IT
        students.get(1).getEnrolledCourse().add(cr1);
        students.get(1).getEnrolledCourse().add(cr3);

        System.out.println("enroll student to courses");
        displayDetails(students);

        //remove student 1 from Maths
        students.get(1).getEnrolledCourse().remove(cr1);

        System.out.println("remove student from enrolled course");
        displayDetails(students);



    }

    public static void displayDetails(HashMap<Integer, Student> students){
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }
    }


}