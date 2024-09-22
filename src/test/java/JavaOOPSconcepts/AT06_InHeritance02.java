package JavaOOPSconcepts;

import org.junit.Test;

public class AT06_InHeritance02 extends AT05_InHeritance01{

    //using extends keyword we are inherting all the parent methods (AT05_InHeritance01 ) into this child method
    @Test
    public void inhMethod04(){
        System.out.println("This is inhMethod 04-child");
        System.out.println(i);
    }

    // if child and parent have same method name, then child will over right the parent method
    // this is also called as method overiding
    @Test
    public void inhMethod03(){

        System.out.println("i am a child over-riding parent method03");
    }

}
