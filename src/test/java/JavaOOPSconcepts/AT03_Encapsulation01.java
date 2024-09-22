package JavaOOPSconcepts;

import org.junit.Test;

public class AT03_Encapsulation01 {

    public void encMethod01(int i, int j){
       int m =i+j;
       System.out.println("added total is : "+ m);
    }

     public int encMethod02(int l, int m) {
        int k = l + m;
        return k;
    }


      public String encMethod03( String l,String m){
        String v = l+m;
        return v;
    }
}
