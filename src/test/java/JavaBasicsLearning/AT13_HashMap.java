package JavaBasicsLearning;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AT13_HashMap {
    @Test
    public void test16() {
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value}
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Ricky",13);
        map.put("Bianca",8);
        map.put("Jasper",10);
        System.out.println("KeyValues in : "+map); //{Jasper=10, Bianca=8, Ricky=13}

        System.out.println("1st forloop");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("2nd forloop");
        for (String key : map.keySet()) {
           //  map.get(key) --> this will get value
            System.out.println("Key: " + key + " and Value: " + map.get(key));
        }

        System.out.println("3rd forloop");
       // Iterating over values() (Values only)
        for (Integer value : map.values()) {
          System.out.println("Value: " + value);
        }

        if(map.containsKey("Bianca")){
            int KeyVal=map.get("Bianca");
            System.out.println("KeyVal is : "+ KeyVal); //8
        }
    }
}
