package feb17.anonymusInnerClass;

public class ComputerClass {
    public static void main(String[] args) {
        Computer computer = new Computer() {
            @Override
            public void calculate() {
                System.out.println("calculating");
            }
        };
        computer.calculate();
    }
}
