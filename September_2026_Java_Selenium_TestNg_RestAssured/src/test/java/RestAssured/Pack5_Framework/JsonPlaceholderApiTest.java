package RestAssured.Pack5_Framework;

import RestAssured.framework.JsonPlaceholderUserApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Framework-style examples using JSONPlaceholder, a public mock API.
 * Its write endpoints return realistic status codes but do not persist data.
 */
public class JsonPlaceholderApiTest {

    private final JsonPlaceholderUserApi users = new JsonPlaceholderUserApi();

    @Test
    public void shouldGetAUserAndValidateTheResponseContract() {
        Response response = users.getUser(1);

        response.then()
                .statusCode(200)
                .contentType("application/json");
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertFalse(response.jsonPath().getString("email").isBlank());
    }

    @DataProvider(name = "userIds")
    public Object[][] userIds() {
        return new Object[][]{
                {1, 200},
                {10, 200},
                {0, 404},
                {-1, 404},
                {9999, 404}
        };
    }

    @Test(dataProvider = "userIds")
    public void shouldHandleValidAndInvalidUserIds(int id, int expectedStatus) {
        users.getUser(id).then().statusCode(expectedStatus);
    }

    @Test
    public void shouldRunCreateUpdateDeleteWorkflowAgainstMockEndpoints() {
        Map<String, Object> payload = Map.of(
                "name", "Rest Assured Student",
                "username", "rest_student",
                "email", "student@example.com"
        );

        Response created = users.createUser(payload);
        created.then().statusCode(201);
        int createdId = created.jsonPath().getInt("id");
        Assert.assertTrue(createdId > 0);

        // JSONPlaceholder does not persist the created record, so update/delete
        // use a known existing fixture while the response ID is still captured.
        int existingFixtureId = 1;
        Response updated = users.updateUser(existingFixtureId, Map.of(
                "name", "Updated Rest Assured Student",
                "email", "updated@example.com"
        ));
        updated.then().statusCode(200);
        Assert.assertEquals(updated.jsonPath().getString("name"), "Updated Rest Assured Student");

        users.deleteUser(existingFixtureId).then().statusCode(200);
    }
}
