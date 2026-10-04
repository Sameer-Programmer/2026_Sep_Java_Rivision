package RestAssured.framework;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

/** Shared request defaults used by the framework examples. */
public final class RequestSpecFactory {

    private RequestSpecFactory() {
    }

    public static RequestSpecification jsonApi() {
        RequestSpecification specification = new RequestSpecBuilder()
                .setBaseUri(ApiConfig.baseUrl())
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .build();
        return given().spec(specification);
    }
}
