package guru.qa.homeworkwithallcollectionscycles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Warehouse {
    Map<String,Integer> products = new HashMap<>();

    public void addProducts(String name, int quantity){
        products.put(name,quantity);
    }

    public boolean hasProduct(String name){
        Iterator<String> it = products.keySet().iterator();
        if (!it.hasNext()) return false;
        do {
            String key = it.next();
            if (key.equals(name)){return true;}
        }
        while (it.hasNext());
        return false;
    }
    public void deleteProduct(String name){
        products.remove(name);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "products=" + products +
                '}';
    }
}
