import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static io.restassured.RestAssured.*;


public class SfPolicy extends ReadProp{
          @Test
            void test() {
            Response response = get(Host+"/v6/policies/PSL/1205679");
            System.out.println("Response:" + response.asString());
            System.out.println("Status Code:" + response.getStatusCode());
            System.out.println("Body:" + response.getBody().asString());
            System.out.println("Header:" + response.getHeader("content-type"));
            int statuscode = response.getStatusCode();
            Assert.assertEquals(statuscode, 200);
        }

}
