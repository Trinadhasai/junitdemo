package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitdemoApplicationTests {

	private Cal c= new Cal();

	@Test
	void testsum() {
		int exRes=13;
		int acRes=c.doSum(6,4,3);
		assertThat(acRes).isEqualTo(exRes);
	}
	@Test
	void testProduct() {
		int exRes=12;
		int acRes=c.doproduct(4, 3);
		assertThat(acRes).isEqualTo(exRes);
	}
	@Test
	void testcmp() {
		Boolean acRes=c.campTonum(3,3);
		assertThat(acRes).isTrue();
	}



}
