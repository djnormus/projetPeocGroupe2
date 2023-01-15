package step_definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static FileReader fr;

    @Before
    public void BeforeTest() throws IOException {


       if (driver == null) {
            FileReader fr = new FileReader("src/test/resources/environement/config.properties");
            prop.load(fr);
        }


        // LOOP TO READ BROWSER TYPE & URL FROM "CONFIG.PROPERTIES"
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        // IMPLICITE WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // MAXIMIZE WINDOW
        driver.manage().window().maximize();



    }


    @After
    public void AfterTest() {
       // driver.quit();
    }


}
