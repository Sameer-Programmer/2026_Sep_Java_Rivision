package RestAssured.framework;

/**
 * Central configuration for the Rest Assured learning examples.
 * Override API_BASE_URL when pointing the examples at another JSON API.
 */
public final class ApiConfig {

    private static final String DEFAULT_BASE_URL = "https://jsonplaceholder.typicode.com";

    private ApiConfig() {
    }

    public static String baseUrl() {
        return System.getenv().getOrDefault("API_BASE_URL", DEFAULT_BASE_URL);
    }

    public static String gorestToken() {
        return System.getenv("GOREST_TOKEN");
    }
}
