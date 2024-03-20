package mar16;

import java.util.function.*;

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

    public void supplierExample(Supplier<Double> supplier){
        out.println(supplier.get());
    }

    public void consumerExample(Consumer<String> consumer, String value){
        consumer.accept(value);
    }

    public void biConsumer(BiConsumer<String, Integer> biConsumer, String value1, int value2){
        biConsumer.accept(value1,value2);
    }
}
