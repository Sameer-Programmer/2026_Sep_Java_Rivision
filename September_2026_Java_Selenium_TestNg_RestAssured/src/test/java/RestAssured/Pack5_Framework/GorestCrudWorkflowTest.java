package RestAssured.Pack5_Framework;

import RestAssured.framework.ApiConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

/**
 * Real CRUD chaining practice for GoRest.
 * Set GOREST_TOKEN locally; the token is intentionally never stored in source control.
 */
public class GorestCrudWorkflowTest {

    private static final String BASE_URL = "https://gorest.co.in/public/v2";

    @Test
    public void shouldCreateReadUpdateAndDeleteAUser() {
        String token = ApiConfig.gorestToken();
        if (token == null || token.isBlank()) {
            throw new SkipException("Set GOREST_TOKEN to run the authenticated GoRest CRUD workflow");
        }

        String email = "student-" + UUID.randomUUID() + "@example.com";
        String authorization = "Bearer " + token;
        Map<String, Object> createPayload = Map.of(
                "name", "Rest Assured Student",
                "gender", "male",
                "email", email,
                "status", "inactive"
        );

        Response created = given()
                .baseUri(BASE_URL)
                .header("Authorization", authorization)
                .contentType("application/json")
                .body(createPayload)
                .when()
                .post("/users");
        created.then().statusCode(201);
        int id = created.jsonPath().getInt("id");

        given().baseUri(BASE_URL)
                .header("Authorization", authorization)
                .when().get("/users/{id}", id)
                .then().statusCode(200);

        given().baseUri(BASE_URL)
                .header("Authorization", authorization)
                .contentType("application/json")
                .body(Map.of("name", "Updated Rest Assured Student", "status", "active"))
                .when().put("/users/{id}", id)
                .then().statusCode(200);

        Response deleted = given().baseUri(BASE_URL)
                .header("Authorization", authorization)
                .when().delete("/users/{id}", id);
        Assert.assertTrue(deleted.statusCode() == 204 || deleted.statusCode() == 200);
    }
}
