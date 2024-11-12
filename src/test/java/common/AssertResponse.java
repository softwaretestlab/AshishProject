package common;

import static org.junit.Assert.assertTrue;
import  org.junit.Assert;

public class AssertResponse {
    public static void VerifyMsgCon(String ExpectedResponse, String ActualResponse) {
        assertTrue(ExpectedResponse.contains(ActualResponse));
    }
    public static void VerifyMsgMatch(String ExpectedResponse, String ActualResponse) {
        Assert.assertEquals(ExpectedResponse,ActualResponse);
    }
    public static void VerifyMsgDbl(double ExpectedResponse, double ActualResponse) {
        Assert.assertEquals(ExpectedResponse, ActualResponse, 0);

    }
}
