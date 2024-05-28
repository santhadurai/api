import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {
    String Host = null;
    Number port = null;
    @BeforeClass
    public void setUp() throws IOException {
        InputStream inStream = getClass().getClassLoader().getResourceAsStream("dev.config.properties");
        Properties prop = new Properties();
        prop.load(inStream);
        Host = prop.getProperty("Host");
        port = Integer.parseInt(prop.getProperty("port"));
    }
}
