package mar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {



    public static void main(String[] args) {
        List<StudentMain> student = new ArrayList<>();
        student.add(new StudentMain(101, "mahesh"));
        student.add(new StudentMain(101, "haswanth"));
        student.add(new StudentMain(103, "vishnu"));

        Collections.sort(student);
        System.out.println(student);

    }

}
