package modules;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;


@RunWith(Cucumber.class)
@CucumberOptions(

        tags = {"@REQ_POE2-11"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/surefire-reports/cucumber.xml"},
        glue = {"step_definition"},
        features={"src/test/resources/features"}
)


public class TestRunner  {



    @AfterClass
   public static void teardown() throws NoSuchAlgorithmException, KeyStoreException, IOException, InterruptedException, KeyManagementException {


        UploadToXray xray = new UploadToXray();
        xray.RemonteResultats();
        System.out.println("Export to Xray OK");

    }


}
