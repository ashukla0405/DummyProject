package com.javatechi;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DummyProjectApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(DummyProjectApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Case Executed");
		assertEquals(true,true);
	}

}
