//file:noinspection ClassJavadoc
//file:noinspection Indentation
//file:noinspection JUnitTestMethodWithoutAssert
package com.fernando

import groovy.transform.CompileStatic

import static io.restassured.RestAssured.given
import static org.hamcrest.CoreMatchers.is
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test


@CompileStatic
@QuarkusTest
class GreetingResourceGroovyTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get('/hello')
                .then()
                .statusCode(200)
                .body(is('Hello from RESTEasy Reactive'))
    }

}
