package mar2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductDEmoo {
    public static void main(String[] args) {
        Map<Product, Integer> productMap = new HashMap<>();
        Product product1 = new Product(7712, "5 star");
        Product product2 = new Product(6451, "kettle chips");
        Product product3 = new Product(4317, "coke");
        productMap.put(product1, 5);
        productMap.put(product2, 10);
        productMap.put(product3, 2);

        Set<Product> productKey = productMap.keySet();
        System.out.println(productKey);

        Collection<Integer> productValue = productMap.values();
        System.out.println(productValue);

        Set<Map.Entry<Product, Integer>> productEntry = productMap.entrySet();
        for(Map.Entry<Product, Integer> prod : productEntry){
            System.out.println(prod.getKey());
            System.out.println(prod.getValue());
        }
    }
}
