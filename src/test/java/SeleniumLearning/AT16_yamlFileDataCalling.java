package SeleniumLearning;
import BaseClass.OpenBrowser;
import PropertiesFile.ymlPropertiesFileExtractor;
import org.junit.Test;

import java.io.IOException;

public class AT16_yamlFileDataCalling {

    @Test
    public void loginPage() throws IOException {
    OpenBrowser.NavToWeb(ymlPropertiesFileExtractor.initializeTestData("Allurl.ecoeco"));
    }
}
