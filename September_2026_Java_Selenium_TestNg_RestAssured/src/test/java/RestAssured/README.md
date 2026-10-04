# Rest Assured learning path

This folder moves from small request examples toward maintainable API automation.

## Recommended sequence

1. **Basics** — status codes, response time, headers, cookies, and response bodies.
2. **Requests** — GET, POST, PUT, DELETE, JSON payloads, query parameters, and path parameters.
3. **Validation** — status, headers, body fields, JSON schema, XML, and response contracts.
4. **Negative and edge cases** — unknown IDs, empty values, invalid payloads, missing headers, and boundary data.
5. **Framework design** — shared request specifications, endpoint clients, payload builders, test data, and reporting.
6. **Workflows** — create → read → update → delete, chaining IDs between requests, and cleanup.

## New framework examples

- `framework/ApiConfig.java` centralizes environment configuration.
- `framework/RequestSpecFactory.java` provides shared JSON request defaults.
- `framework/JsonPlaceholderUserApi.java` keeps endpoint details out of test methods.
- `Pack5_Framework/JsonPlaceholderApiTest.java` demonstrates positive tests, data-driven edge cases, response contracts, and a mock CRUD workflow.
- `Pack5_Framework/GorestCrudWorkflowTest.java` demonstrates authenticated CRUD chaining without storing a token in the repository.

## Run the examples

From this module directory:

```bash
mvn -Dtest=RestAssured.Pack5_Framework.JsonPlaceholderApiTest test
```

The authenticated GoRest test is skipped unless a token is supplied:

```bash
export GOREST_TOKEN="your-token"
mvn -Dtest=RestAssured.Pack5_Framework.GorestCrudWorkflowTest test
```

Never commit API tokens. The JSONPlaceholder write endpoints are mock operations: they return create/update/delete status codes but do not permanently persist changes. Use the GoRest workflow when you need to practice a real chained lifecycle.
