package ch.hftm.fizzbuzz.integrationtests;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.hftm.fizzbuzz.client.FizzBuzzClient;

class FizzBuzzIT {

	@Test
	void pruefeZeichenfolgeSechsBisElf() {
		// Arrange
		String result;
		FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();

		// Act
		result = fizzBuzzClient.getResultForScope(6, 11);

		// Assert
		Assertions.assertEquals("Fizz, 7, 8, Fizz, Buzz, 11", result, "Nicht erwartete Zeichenfolge");
	}

}
