package mar19;

import java.util.ArrayList;
import java.util.List;

public class stramExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("vishnu");
        names.add("haswanth");
        names.add("vish");
        names.add("niathi");

        for (String name : names) {
            if(name.length() > 4){
                System.out.println(name);
            }
        }
        //names.stream().ma

    }
}
