package integration_test;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.specification.RequestSpecification;
import dto.request.ChameleonRequest;
import dto.request.PingRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;
import com.jayway.restassured.http.ContentType;

import java.util.Optional;

import static com.jayway.restassured.RestAssured.given;
import static cucumber.TestUtil.getChameleonSession;
import static cucumber.TestUtil.initSpec;
import static cucumber.TestUtil.setUpEnv;
import static org.hamcrest.CoreMatchers.notNullValue;

@Slf4j
public class RestAssuredAcceptenceTest {

    private static String chameleonSession;
    private static RequestSpecification requestSpec;

    @BeforeClass
    public static void setup() {
        setUpEnv();
        requestSpec = initSpec();
        chameleonSession = getChameleonSession(requestSpec);
    }


    @Test
    public void basicPingTest() {
        given()
            .specification(requestSpec)
            .body(PingRequest.builder()
                      .uid("4cad7c391a301223")
                      .chameleonSession(chameleonSession)
                      .build())
            .when()
            .post("/ping")
            .then()
            .statusCode(200)
            .body("session", notNullValue());
    }

}
