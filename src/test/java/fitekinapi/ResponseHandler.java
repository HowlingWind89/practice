package fitekinapi;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class ResponseHandler {

    private static Response validateResponse(Response response, String responseBodyContent, int statusCode) {
        return response
                .then()
                .body(containsString(responseBodyContent))
                .statusCode(statusCode)
                .extract()
                .response();
    }

    private static RequestSpecification prepareRequest(String acceptHeader, String authorizationToken) {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", acceptHeader)
                .header("Authorization-Token", authorizationToken);
    }

    public static Response getPostApiResponse (String acceptHeader, String payloadBody, String url, String responseBodyContent,
                                               int statusCode, String authorizationToken) {

        Response response = prepareRequest(acceptHeader, authorizationToken)
                .body(payloadBody)
                .when()
                .post(url);

        return validateResponse(response, responseBodyContent, statusCode);
    }

    public static Response getGetApiResponse (String acceptHeader, String url, String responseBodyContent,
                                               int statusCode, String authorizationToken) {

        Response response = prepareRequest(acceptHeader, authorizationToken)
                .get(url);

        return validateResponse(response, responseBodyContent, statusCode);
    }
}
