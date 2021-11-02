package com.ias.testsonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class TestsonarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestsonarApplication.class, args);
	}

    private void test() {
        log.info("test");
        log.debug("debug");
    }

}
