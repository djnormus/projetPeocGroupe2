package utils;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {


    public void prop () throws IOException {


        Properties properties = new Properties();
        FileReader fr = new FileReader("src/test/resources/environement/config.properties");
        properties.load(fr);

        // READ
        //System.out.println(properties.getProperty("browserType"));
        //System.out.println(properties.getProperty("url"));

    }

}
