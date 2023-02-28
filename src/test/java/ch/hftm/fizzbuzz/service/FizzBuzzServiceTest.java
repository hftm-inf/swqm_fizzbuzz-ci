package ch.hftm.fizzbuzz.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzServiceTest {

	@ParameterizedTest
	@CsvSource({
			"2, 2, Normale Zahl als Resultat erwartet",
			"6, Fizz, Fizz bei durch drei teilbare Zahl als Resultat erwartet",
			"10, Buzz, Buzz bei durch drei teilbare Zahl als Resultat erwartet",
			"30, FizzBuzz, FizzBuzz bei durch drei und fünf teilbare Zahl als Resultat erwartet",
	})
	void pruefeKombinationen(int input, String expected, String message) {
		String result;
		FizzBuzzService fizzBuzzService = new FizzBuzzService();
		result = fizzBuzzService.getResultOfNumber(input);
		Assertions.assertEquals(expected, result, message);
	}
}
