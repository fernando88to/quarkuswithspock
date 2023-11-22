//file:noinspection ClassJavadoc
//file:noinspection Indentation
//file:noinspection JUnitTestMethodWithoutAssert
package com.fernando

import static io.restassured.RestAssured.given
import static org.hamcrest.CoreMatchers.is
import groovy.transform.CompileStatic
import io.quarkus.test.junit.QuarkusTest
import spock.lang.Specification



@QuarkusTest
@CompileStatic
class GreetingResourceGroovySpockTest extends Specification {

    void testHelloEndpoint() {
        when:
            given()
                    .when().get('/hello')
                    .then()
                    .statusCode(200)
                    .body(is('Hello from RESTEasy Reactive'))
        then:
            true
    }

}
