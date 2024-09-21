package JavaBasicsLearning;
import org.junit.Test;
public class AT10_ArrayLoop {
    @Test
    public void test14() {
        // variable  age is an array
        int[] age = {10, 20, 30, 40, 50, 60};
        // this length will tell the total number of items present in an array
        //index count
        int ArraySize=age.length;
        System.out.println("ArraySize : "+ArraySize); //6
        //forloop
        for(int i=0;i<ArraySize;i++){
            System.out.println("Array index is : " +i+" and its value is :"+age[i]);
        }
    }
}
