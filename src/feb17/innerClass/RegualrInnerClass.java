package feb17.innerClass;

public class RegualrInnerClass {

    public void outerMethod(){
        System.out.println("outer method class");
    }
     class InnerClass{

        public void innerMethod(){
            System.out.println("inner method class");
        }

     }

    public static void main(String[] args) {

        RegualrInnerClass outer = new RegualrInnerClass();
        outer.outerMethod();

        RegualrInnerClass.InnerClass innerClass = outer.new InnerClass();

        innerClass.innerMethod();
    }
}
