package JavaBasicsLearning;

import org.junit.Test;

import java.util.ArrayList;

public class AT11_ArrayList {
    @Test
    public void ArrayListString() {
        //syntax of arraylist
        ArrayList<String> ListOfCars = new ArrayList<>();
        //add items to arraylist
        ListOfCars.add("BMW");
        ListOfCars.add("Toyota");
        ListOfCars.add("Benz");
        ListOfCars.add("RangeRover");
        System.out.println("cars inside arraylist are : "+ListOfCars); //[BMW, Toyota, Benz, RangeRover]
        //index count
        int CarsCount=ListOfCars.size();
        System.out.println("CarsCount : "+CarsCount); //4

        for(int i=0;i<CarsCount;i++){
            String  CarNameIs=ListOfCars.get(i);
            System.out.println("ArrayList index is : " +i+" and CarNameIs : "+CarNameIs);
        }
    }
    @Test
    public void ArrayListInt() {
        //syntax of arraylist
        ArrayList<Integer> ListOfNumber =  new ArrayList<>();
        //add items to arraylist
        ListOfNumber.add(100);
        ListOfNumber.add(200);
        ListOfNumber.add(300);
        ListOfNumber.add(400);
        System.out.println("Numbers inside arraylist are : "+ListOfNumber);

    }
}
