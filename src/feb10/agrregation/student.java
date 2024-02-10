package feb10.agrregation;

public class student {
    public static void main(String[] args) {
        StudentDetails haswanth = new StudentDetails(278, "Haswanth",new Address("1034 Oregon Avenue","Beaumont","Texas","77705"));
        System.out.println(haswanth.studentId);
        System.out.println(haswanth.address.streetNumber);
    }
}
