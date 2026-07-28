package RestAssuredTest;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BBDPutTest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BASE_URL;
    }
 public void testBDDApproach() {

        System.out.println("\n\n========== BDD APPROACH ==========");

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "BDD Post");
        requestBody.put("body", "Testing BDD approach");
        requestBody.put("userId", 2);

        given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())

        .when()
                .post("/posts")

        .then()
                .statusCode(201)
                .statusLine(containsString("201"))
                .contentType("application/json")
                .body("title", equalTo("BDD Post"))
                .body("userId", equalTo(2))
                .time(lessThan(5000L))
                .log().all();
    }
}