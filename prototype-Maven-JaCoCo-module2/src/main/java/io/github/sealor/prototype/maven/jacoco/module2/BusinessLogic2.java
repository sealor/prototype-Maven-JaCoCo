package io.github.sealor.prototype.maven.jacoco.module2;

public class BusinessLogic2 {

	public String returnHello() {
		return "Hello";
	}

	public String returnNumberInformation(int number) {
		StringBuilder sb = new StringBuilder();
		sb.append(number);

		if (number % 2 == 0) {
			sb.append(" - It's an even number.");
		} else {
			sb.append(" - It's an odd number.");
		}

		return sb.toString();
	}
}
