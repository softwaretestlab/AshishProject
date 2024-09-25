package JavaOOPSconcepts;

import org.junit.Test;

import java.security.PublicKey;

public abstract class AT13_AbstractClass01 {
    @Test
    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }
    //we  know the logic for this below method
    @Test
    public void SubOfNum(){
        int i=40;
        int j=20;
        System.out.println("This is SubOfNum Second Method value : " + (i-j));
    }
    //we don't know the logic for this below method
    public abstract void divOfNum();
}
