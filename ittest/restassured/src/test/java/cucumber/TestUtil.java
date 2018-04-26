package cucumber;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import dto.request.ChameleonRequest;

import java.util.Optional;

import static com.jayway.restassured.RestAssured.given;

public class TestUtil {

    public static void setUpEnv(){
        RestAssured.port = Optional.ofNullable(System.getProperty("server.port"))
                               .map(Integer::valueOf)
                               .orElse(8081);
        RestAssured.baseURI = Optional.ofNullable(System.getProperty("server.host"))
                                  .orElse("http://mw-tapi-test.nc.pb.ua");
        RestAssured.basePath = Optional.ofNullable(System.getProperty("server.base"))
                                   .orElse("/bus/");
    }

    public static RequestSpecification initSpec() {
        return new RequestSpecBuilder()
                   .setContentType(ContentType.JSON)
                   .setAccept(ContentType.JSON)
                   .addFilter(new ResponseLoggingFilter())
                   .addFilter(new RequestLoggingFilter())
                   .build();
    }

    public static String getChameleonSession(RequestSpecification requestSpec) {
        return given()
                   .specification(requestSpec)
                   .body(ChameleonRequest.builder()
                             .subsystemId("4")
                             .build())
                   .when()
                   .post("http://mw-tapi-test.nc.pb.ua:80/furby/chameleon/session/open")
                   .then()
                   .statusCode(200)
                   .extract()
                   .path("session");
    }

}
