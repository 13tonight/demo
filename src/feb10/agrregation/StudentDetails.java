package feb10.agrregation;

public class StudentDetails {
    int studentId;
    String name;
    Address address;

    public StudentDetails(int studentId, String name, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }
    public void printStudentDetails(){
        System.out.println(this.studentId);
        System.out.println(this.name);
        System.out.println(this.address);
    }
}
