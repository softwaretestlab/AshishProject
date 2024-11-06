package SeleniumLearning;

import BaseClass.OpenBrowser;
import org.junit.Test;

public class AT14_BaseClassUsage {

    @Test
    public void NavToGGWebsite(){

        OpenBrowser.NavToWeb("http://www.echoecho.com/htmlforms10.htm");
    }
}
