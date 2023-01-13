package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Screenshot {

    WebDriver driver;

    public Screenshot(WebDriver driver) {

        this.driver = driver;

    }

 public void takeScreenshot() throws IOException {

// TAKE SCREENSHOT
     File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

     // ******* TO SAVE SCREENSHOT *******
     // Add dependency from "mvn repository" : commons io

     // Tips :  create date to use in file name of the picture
     Date currentDate = new Date();
     String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");

     // SAVE METHOD & PATH
     FileUtils.copyFile(screenshotFile, new File(".//screenshotFiles/" + screenshotFileName + ".png"));



 }




}
