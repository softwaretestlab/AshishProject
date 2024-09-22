package JavaOOPSconcepts;


import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03() {
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.encMethod01(50, 50);
        obj.encMethod01(150,150);

        // here we are using the value from return statement into code
        int p = obj.encMethod02(200,200);
        int q = p+50; // 400+50=450
        System.out.println("Value of q is : "+ q); //450


        //return string
        String MyName=obj.encMethod03("software","testlab");
        System.out.println("MyName is : "+ MyName);
    }
}