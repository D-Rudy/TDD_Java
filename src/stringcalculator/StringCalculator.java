package stringcalculator;

public class StringCalculator {

	public int add(String numbers) {

		int sum = 0;
		if (numbers.isEmpty()) {
			return 0;
		}

		char delimiter = numbers.charAt(0);
		if (numbers.contains(",\n")) {
			throw new NumberFormatException();
		}
		if ((numbers.charAt(numbers.length() - 1) == ',') || (numbers.charAt(numbers.length() - 1) == '\n')) {
			throw new NumberFormatException();
		}

		numbers = numbers.replaceAll("[,\\s\\n]+", "");

		String[] ListNumbers = numbers.split("");
		for (String num : ListNumbers) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}

	public static void main(String[] args) {
		StringCalculator calc = new StringCalculator();
		System.out.println(calc.add("1,\n3"));
	}
}
