package modules;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        tags = {"@TEST_POE2-13"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/surefire-reports/cucumber.xml"},
        glue = {"step_definition"},
        features={"src/test/resources/features"}
)


public class TestRunner  {

/*

    @AfterClass
    public static void teardown() throws NoSuchAlgorithmException, KeyStoreException, IOException, InterruptedException, KeyManagementException {
        UploadToXray xray = new UploadToXray()
        xray.sendResultToXray();
        System.out.println("import all test to xray");
    }

*/

}
