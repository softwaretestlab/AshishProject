package JavaOOPSconcepts;

import org.junit.Test;

public class AT07_InHeritance03 {

    @Test
    public void inhMethod05(){
        AT06_InHeritance02 obj = new AT06_InHeritance02();
        //parent methods
        obj.inhMethod01();
        obj.inhMethod02();
        //child methods
        obj.inhMethod03();
        obj.inhMethod04();
    }
    @Test
    public void inhMethod06(){
        //  As we called this method03 from parent (but for this class its just another class)
        //  whatever the logic in it will be printed
        //  but it wont print logic from child(AT06_InHeritance02)- method03
        AT05_InHeritance01 obj = new AT05_InHeritance01();
        obj.inhMethod03();
    }
}
