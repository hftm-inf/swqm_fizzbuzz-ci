package ch.hftm.fizzbuzz.client;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.hftm.fizzbuzz.service.FizzBuzzService;

class FizzBuzzClientTest {

	@Test
	void pruefeFalscheZeichenfolge() {
		// Arrange
		String result;
		FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();
		FizzBuzzService fizzBuzzService = mock(FizzBuzzService.class);
		fizzBuzzClient.fizzBuzzService = fizzBuzzService;

		// Act
		result = fizzBuzzClient.getResultForScope(11, 10);

		// Assert
		Assertions.assertEquals("", result, "Nicht erwartete Zeichenfolge");
	}

	@Test
	void pruefeEinZeichen() {
		// Arrange
		String result;
		FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();
		FizzBuzzService fizzBuzzService = mock(FizzBuzzService.class);
		fizzBuzzClient.fizzBuzzService = fizzBuzzService;
		when(fizzBuzzService.getResultOfNumber(15)).thenReturn("FizzBuzz");

		// Act
		result = fizzBuzzClient.getResultForScope(15, 15);

		// Assert
		Assertions.assertEquals("FizzBuzz", result, "Nicht erwartete Zeichenfolge");
	}

	// @Test
	// void pruefeZeichenfolgeAchtBisNeun() {
	// 	// Arrange
	// 	String result;
	// 	FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();
	// 	FizzBuzzService fizzBuzzService = mock(FizzBuzzService.class);
	// 	fizzBuzzClient.fizzBuzzService = fizzBuzzService;
	// 	when(fizzBuzzService.getResultOfNumber(8)).thenReturn("8");
	// 	when(fizzBuzzService.getResultOfNumber(9)).thenReturn("Fizz");

	// 	// Act
	// 	result = fizzBuzzClient.getResultForScope(8, 9);

	// 	// Assert
	// 	Assertions.assertEquals("8, Fizz", result, "Nicht erwartete Zeichenfolge");
	// }

}
