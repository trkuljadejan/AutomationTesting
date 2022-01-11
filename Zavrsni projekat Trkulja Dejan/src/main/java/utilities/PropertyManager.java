package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String username;
    private static String fakeUsername;
    private static String password;
    private static String fakePassword;

    public static PropertyManager getInstance(){
        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            prop.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        url = prop.getProperty("url");
        username = prop.getProperty("username");
        fakeUsername = prop.getProperty("fakeUsername");
        password = prop.getProperty("password");
        fakePassword = prop.getProperty("fakePassword");

        return instance;
    }
    public String getUrl(){
        return url;
    }
    public String getUsername(){
        return username;
    }
    public String getFakeUsername(){
        return fakeUsername;
    }
    public String getPassword(){
        return password;
    }
    public String getFakePassword(){
        return fakePassword;
    }
}
