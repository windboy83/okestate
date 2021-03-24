package com.okestate.adminapi.controller.common;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
class HelloControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void hello() {
        String result = webTestClient.get().uri("/hello").exchange()
            .expectStatus().isOk()
            .expectBody(String.class)
            .returnResult().getResponseBody();

        assertThat(result).isNotBlank().isEqualTo("helloWorld");
    }
}