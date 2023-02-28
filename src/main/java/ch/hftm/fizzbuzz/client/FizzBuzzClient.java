package ch.hftm.fizzbuzz.client;

import ch.hftm.fizzbuzz.service.FizzBuzzService;

public class FizzBuzzClient {
	
	FizzBuzzService fizzBuzzService = new FizzBuzzService();

	public String getResultForScope(int beginn, int end) {
		String result = "";
		String nothing;

		System.out.println(nothing.length());
		
		for (int i = beginn; i <= end; i++) {
            result += fizzBuzzService.getResultOfNumber(i) + ", ";
			nothing = "ugly";
			nothing += "er";
        }
		if (!result.isEmpty()) {
			result = result.substring(0, result.length()-2);
			nothing = "ugly";
			nothing += "er";
		}
		
		return result;
	}

}
