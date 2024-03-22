package mar16;

import java.util.function.Function;
import java.util.function.Predicate;

public class billBoardMain {
    public static void main(String[] args) {
        billBordView bordView = new billBordView();
        bordView.functionRoom( view -> "-------------"+ view + "----------------","Functional");

        bordView.predicateExample( value -> value % 2 ==0 , 3 );

        bordView.functionExample( intValue -> intValue / 3.0 , 16);

        bordView.biFunctionExample((value,value1) -> (int) (value * value1), 2.0f, 4.5);

        bordView.supplierExample(Math :: random);

        bordView.consumerExample(System.out::println, "sunny");

        bordView.biConsumer((value1, value2) -> {
            System.out.println(value1 + value2);
        },"sunny", 678901);



    }
}
