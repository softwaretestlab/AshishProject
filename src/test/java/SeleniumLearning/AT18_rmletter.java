package SeleniumLearning;

import org.junit.Test;

public class AT18_rmletter {


    @Test
    public void rmLt() {
        String TtlAmt = "$11.22";
        //remove first letter
        String amts=TtlAmt.substring(1,TtlAmt.length());
        System.out.println(amts);
        //we converted a string to double (decimal number)
        double MyNumb=Double.parseDouble(amts);
        System.out.println(MyNumb);
        //add 2 double numbers
        double NewNum=10.50+MyNumb;
        System.out.println(NewNum);

    }
}