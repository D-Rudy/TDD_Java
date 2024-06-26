package searchfunctionality;

import java.util.ArrayList;
import java.util.List;

public class SearchFunctionality {

	String cities[] = { "Paris", "Budapest", "Skopje", "Rotterdam", "Valencia", "Vancouver", "Amsterdam", "Vienna",
			"Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul" };

	public String lengthCheck(String input) {
		if (input.length() < 2) {
			return "";
		} else {
			return input;
		}
	}

	public String searchCities(String input) {
		List<String> resultList = new ArrayList<>();

		input = getAllCities(input);
		if (lengthCheck(input).equals("")) {
			return "";
		} else {
			for (String city : cities) {
				if (city.toLowerCase().contains(input.toLowerCase())) {
					resultList.add(city);
				}
			}

			return resultList.toString();
		}
	}

	public String getAllCities(String input) {
		if (input.equals("*")) {
			List<String> resultList = new ArrayList<>();
			for (String city : cities) {
				resultList.add(city);

			}
			return resultList.toString();
		}
		return input;
	}
}
