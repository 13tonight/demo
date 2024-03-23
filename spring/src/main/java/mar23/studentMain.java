package mar23;

public class studentMain {
    public static void main(String[] args) throws Exception {
        studentOptional studentOpt = new studentOptional();

        System.out.println(studentOpt.studentDao().getFirstName());

    }
}
