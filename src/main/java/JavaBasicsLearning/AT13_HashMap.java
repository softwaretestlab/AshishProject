package JavaBasicsLearning;

import org.junit.Test;

import java.util.HashMap;

public class AT13_HashMap {
    @Test
    public void test16() {
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value}
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Ricky",13);
        map.put("Bianca",8);
        map.put("Jasper",10);
        System.out.println("KeyValues in : "+map); //{Jasper=10, Bianca=8, Ricky=13}
        // here we are getting size of hashMap
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize); //3
        if(map.containsKey("Bianca")){
            int KeyVal=map.get("Bianca");
            System.out.println("KeyVal is : "+ KeyVal); //8
        }
    }
}
