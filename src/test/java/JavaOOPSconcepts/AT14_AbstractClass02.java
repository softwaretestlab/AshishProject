package JavaOOPSconcepts;

import org.junit.Test;

public class AT14_AbstractClass02 extends AT13_AbstractClass01 {
    /*
Abstract class: is a restricted class that cannot be used to create
objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it
does not have a body. The body is provided by the subclass (inherited from).
*/
@Test
    public void divOfNum(){
    int x =100;
    int y =20;
    System.out.println("Div of 2 numbers is : "+(x/y)); //5
}

}
