package io.github.sealor.prototype.maven.jacoco.module2;

import static org.junit.Assert.assertEquals;
import io.github.sealor.prototype.maven.jacoco.module2.BusinessLogic2;

import org.junit.Test;

public class BusinessLogic2Test {

	@Test
	public void testReturnHello() {
		BusinessLogic2 businessLogic2 = new BusinessLogic2();

		assertEquals("Hello", businessLogic2.returnHello());
	}

	@Test
	public void testReturnOddNumberInformation() {
		BusinessLogic2 businessLogic2 = new BusinessLogic2();

		assertEquals("3 - It's an odd number.", businessLogic2.returnNumberInformation(3));
	}
}
