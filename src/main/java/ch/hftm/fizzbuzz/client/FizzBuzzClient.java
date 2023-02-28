package ch.hftm.fizzbuzz.client;

import ch.hftm.fizzbuzz.service.FizzBuzzService;

public class FizzBuzzClient {
	
	FizzBuzzService fizzBuzzService = new FizzBuzzService();

	public String getResultForScope(int beginn, int end) {
		StringBuilder result = new StringBuilder();
		
		for (int i = beginn; i <= end; i++) {
            result.append(fizzBuzzService.getResultOfNumber(i) + ", ");
        }
		if (!result.isEmpty()) {
			return result.substring(0, result.length()-2);
		}
		
		return result.toString();
	}

}
