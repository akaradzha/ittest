package cucumber.stepdefs;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import cucumber.api.PendingException;

import cucumber.api.java8.En;
import dto.request.PingRequest;

import static com.jayway.restassured.RestAssured.given;
import static cucumber.TestUtil.getChameleonSession;
import static cucumber.TestUtil.initSpec;
import static cucumber.TestUtil.setUpEnv;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PingServiceStepDefinitions implements En {
    private static String chameleonSession;
    private static RequestSpecification commonRequest;

    private RequestSpecification request;
    private ValidatableResponse response;



    public PingServiceStepDefinitions() {
        Before(() -> {
            setUpEnv();
            commonRequest = initSpec();
            chameleonSession = getChameleonSession(commonRequest);
        });

        Given("^chameleon session$", () -> {
            request = given().specification(commonRequest)
                          .body(PingRequest.builder()
                                    .uid("4cad7c391a301223")
                                    .chameleonSession(chameleonSession)
                                    .build());
        });

        When("^user calls ping service$", () -> {
            response = request.post("/ping")
                           .then();
        });

        Then("^the status code is (\\d+)$", (Integer arg1) -> {
            response.statusCode(200);
        });

        Then("^client session is returned$", () -> {
            response.body("session", notNullValue());
        });
    }
}
