package com.fernando

import io.quarkus.test.junit.QuarkusTest
import spock.lang.Specification

@QuarkusTest
class MySpec extends Specification {

    void 'meu primeiro teste spock'() {
        given: 'um valor'
            int valor = 5
        when: 'alguma ação é realizada'
            int resultado = valor + 5
        then: 'o resultado é como esperado'
            resultado == 10
    }

}
