package RestAssuredTest;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BDDPutWithExtractionTest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BASE_URL;
    }

   
    public void testBDDApproachWithExtraction() {

        System.out.println("\n\n========== BDD APPROACH WITH EXTRACTION ==========");

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "BDD with Extraction");
        requestBody.put("body", "Testing BDD with response extraction");
        requestBody.put("userId", 3);

        Response response = given()

                .header("Content-Type", "application/json")
                .body(requestBody.toString())

        .when()
                .post("/posts")

        .then()
                .statusCode(201)
                .extract()
                .response();

        System.out.println("\n------ BDD Extraction Response ------");
        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Status Line : " + response.getStatusLine());
        System.out.println("Content Type : " + response.getContentType());
        System.out.println("Response Time : " + response.getTime() + " ms");
        System.out.println("Response Body :");
        System.out.println(response.getBody().asString());
    }
}