package LoopsNConditionalStatments;

import org.junit.Test;

public class AT07_SwitchStatement {
    @Test
    public void SwitchStatmentLearnString() {
        String MyName="abc";
        switch (MyName){
            case "abc":
                System.out.println("1st one selected");
                break;
            default:
                System.out.println("none selected");

        }
    }

    @Test
    public void SwitchStatmentLearnInt() {

        switch (5){
            case 1:
                System.out.println("1st one selected");
                break;
            case 2:
                System.out.println("2nd one selected");
                break;
            case 3:
                System.out.println("3rd one selected");
                break;
            case 4:
                System.out.println("4th one selected");
                break;
            default:
                System.out.println("none selected");
        }
    }
}
