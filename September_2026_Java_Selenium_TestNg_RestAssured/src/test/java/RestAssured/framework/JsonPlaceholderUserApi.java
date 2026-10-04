package RestAssured.framework;

import io.restassured.response.Response;

import java.util.Map;

/** Small endpoint wrapper that keeps request details out of test methods. */
public class JsonPlaceholderUserApi {

    public Response getUser(int id) {
        return RequestSpecFactory.jsonApi()
                .pathParam("id", id)
                .when()
                .get("/users/{id}");
    }

    public Response createUser(Map<String, Object> payload) {
        return RequestSpecFactory.jsonApi()
                .body(payload)
                .when()
                .post("/users");
    }

    public Response updateUser(int id, Map<String, Object> payload) {
        return RequestSpecFactory.jsonApi()
                .pathParam("id", id)
                .body(payload)
                .when()
                .put("/users/{id}");
    }

    public Response deleteUser(int id) {
        return RequestSpecFactory.jsonApi()
                .pathParam("id", id)
                .when()
                .delete("/users/{id}");
    }
}
