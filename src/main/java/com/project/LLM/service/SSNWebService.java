package com.project.LLM.service;

import org.springframework.stereotype.Service;

@Service
public class SSNWebService {

	public String getState(String number) {

		number = number.replaceAll("[^0-9]", "");

		if (number.length() != 9) {
			return "Invalid input";
		}

		String stateCode = number.substring(0, 3);
		int code = Integer.parseInt(stateCode);

		if ((code >= 1) && (code <= 3))
			return "New Hampshire";
		else if ((code >= 4) && (code <= 7))
			return "New Hampshire";
		else if ((code >= 10) && (code <= 34))
			return "Massachusetts";
		else if ((code >= 50) && (code <= 134))
			return "New York";
		else if ((code > 318) && (code < 364))
			return "Illinois";
		else {
			return "Invalid input";
		}
	}
}
