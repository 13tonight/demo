package jan20;

public class calculatorMethods {

    public int add(int a, int b){
        return a + b ;
    }
    public int sub(int a, int b){
        return a - b ;
    }
    public double multi(double a, double b){
        return a * b ;
    }
    public double div(double a, double b){
        return a / b ;
    }

    public double circleArea(double radius){

        return 3.14*Math.pow(radius , 2);
    }

    public double sqaureArea(double area){
        return Math.pow(area , 2);
    }
    public double rectArea (double length, double width){
        return length * width;
    }
}
