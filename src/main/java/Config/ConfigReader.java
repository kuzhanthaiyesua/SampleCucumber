package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader(){
        loadProperties();
    }

    public void loadProperties(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/Config/config.properties");
            prop.load(ip);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getProperies(String key){

        String value = prop.getProperty(key);
        return value;
    }

}
