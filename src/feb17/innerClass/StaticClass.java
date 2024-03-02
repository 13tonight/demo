package feb17.innerClass;

public class StaticClass {

    static class InnerClass{
        public void test(){
            System.out.println("static test");
        }
    }

    public static void main(String[] args) {
        StaticClass.InnerClass anonymus = new StaticClass.InnerClass();
        anonymus.test();
    }
}
