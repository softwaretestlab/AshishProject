package SeleniumLearning;
import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;
public class AT15_BaseClassNPropertiesFileUsage {
    @Test
    public void Nav() throws IOException {
      //  OpenBrowser.NavToWeb("http://www.echoecho.com/htmlforms10.htm");
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("ecoeco"));

    }
}
