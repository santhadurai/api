import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static io.restassured.RestAssured.*;

public class GcpAddress extends ReadProp{
    @Test
    void test() {
        String response = given().log().all()
                .header("X-MagAPI-Version", "v4")
                .when()
                .get(Host+"/gcp-salesforce-address-api/contact/0033l00002VgpoAAAR")
                .then()
                .assertThat()
                .statusCode(200).assertThat().extract().response().asString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String type = js.getString("Policy");
        System.out.println(type);

    }
}