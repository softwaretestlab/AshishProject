package JavaBasicsLearning;

import org.junit.Test;

public class AT09_AccessArrayEle {

    @Test
    public void test13() {
        // variable age is an arr
        int[] age = {10, 20, 30, 40, 50, 60};
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        System.out.println(age[5]);

        // System.out.println(age[6]); //java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6

        String[] PersonName ={"John","Smith","Steve","Ben","Mike","Matt"};
        System.out.println(PersonName[0]);
    }
}