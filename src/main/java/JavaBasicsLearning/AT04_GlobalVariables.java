package JavaBasicsLearning;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables
    int i = 10;
    int j = 20;
    String test01 = "SoftwareTestLab";

    @Test
    public void test04() {
        //local variable
        int m = 30;
        int x = m + i + j;
        System.out.println("X value is : " + x); //60
    }

    @Test
    public void test05() {
        //local variables
        int k = i + j; //30
        System.out.println("K value is : " + k);//30
        System.out.println("test01 value is : " + test01); //SoftwareTestLab
    }
}