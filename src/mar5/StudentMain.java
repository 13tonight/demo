package mar5;

public class StudentMain implements Comparable<StudentMain> {
    int id;
    private String studentName;

    public StudentMain(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "StudentMain{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentMain student) {
        return this.studentName.compareTo(student.studentName);
    }
}
