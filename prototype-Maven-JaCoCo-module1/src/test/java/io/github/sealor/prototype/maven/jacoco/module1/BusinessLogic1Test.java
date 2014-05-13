package io.github.sealor.prototype.maven.jacoco.module1;

import static org.junit.Assert.assertEquals;
import io.github.sealor.prototype.maven.jacoco.module1.BusinessLogic1;

import org.junit.Test;

public class BusinessLogic1Test {

	@Test
	public void testReturnHello() {
		BusinessLogic1 businessLogic1 = new BusinessLogic1();

		assertEquals("Hello", businessLogic1.returnHello());
	}

	@Test
	public void testReturnOddNumberInformation() {
		BusinessLogic1 businessLogic1 = new BusinessLogic1();

		assertEquals("3 - It's an odd number.", businessLogic1.returnNumberInformation(3));
	}
}
