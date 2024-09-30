package JavaOOPSconcepts;
import org.junit.Test;
public class AT16_Interface02 implements AT15_Interface01 {
    /*
   A Java interface contains static constants and
  abstract methods.
  */
    @Test
    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }
    @Test
    public void SubOfNum(){
        int k=40;
        int l=20;
        System.out.println("This is SubOfNum Second Method value : " + (k-l));
    }
    @Test
    public void divOfNum(){
        int m =100;
        int n =20;
        System.out.println("Div of 2 numbers is : "+(m/n)); //5
        //calling static
        System.out.println("Static value is : "+ (x+30));

    }

}

