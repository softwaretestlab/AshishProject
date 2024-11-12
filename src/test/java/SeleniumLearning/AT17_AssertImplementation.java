package SeleniumLearning;
import common.AssertResponse;
import org.junit.Test;

public class AT17_AssertImplementation {

    @Test
    public void AssertStringRes(){
        String expected = "SoftwareTestLab";
        String actual="SoftwareTestLab";
        AssertResponse.VerifyMsgCon(expected,actual);
    }
    @Test
    public void AssertDoubleRes(){
        double expected = 10.22;
        double actual=10.22;
        AssertResponse.VerifyMsgDbl(expected,actual);
    }
    @Test
    public void AssertContainsRes() {
        String expected = "MyName is Software TestLab";
        String actual = "TestLab";
        AssertResponse.VerifyMsgCon(expected,actual);
    }

}
