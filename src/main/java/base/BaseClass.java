package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {

    Properties properties;

    public String getProperty(String value) {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/Properties/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(value);

    }
}
