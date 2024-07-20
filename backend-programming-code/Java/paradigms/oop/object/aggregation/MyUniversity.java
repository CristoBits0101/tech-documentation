package paradigms.oop.object.aggregation;

import java.util.ArrayList;
import java.util.List;

public class MyUniversity {

    private List<MyStudent> students;

    public MyUniversity() {
        students = new ArrayList<>();
    }

    public void addStudent(MyStudent student) {
        students.add(student);
    }

    public void listStudents() {
        for (MyStudent student : students) {
            System.out.println(student.getName());
        }
    }

}
