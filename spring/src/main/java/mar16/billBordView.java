package mar16;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.System.out;

public class billBordView {

    public void functionRoom(IBillBoard iBillBoard, String text){
        out.println(iBillBoard.display(text));

    }

    public void predicateExample(Predicate<Integer> predict, int value){
        out.println(predict.test(value));
    }

    public void functionExample(Function<Integer, Double> function , int intValue){
        out.println(function.apply(intValue));
    }

    public void biFunctionExample(BiFunction<Float, Double, Integer> biFunction , float floatValue, double doubleValue){
        out.println(biFunction.apply(floatValue, doubleValue));
    }


}
