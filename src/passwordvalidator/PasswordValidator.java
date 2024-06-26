package passwordvalidator;

public class PasswordValidator {

	public String lengthValidator(String psw) {
		if (psw.length() < 8) {
			return "Le mot de passe doit contenir au moins 8 caractères\n";
		}
		return "";
	}

	public String numbersValidator(String psw) {
		if (psw.matches(".*[\\d].*\\d.*")) {
			return "";
		}
		return "Le mot de passe doit contenir au moins 2 chiffres\n";

	}

	public String errorValidator(String psw) {
		String msg = lengthValidator(psw);
		msg += numbersValidator(psw);
		return msg;
	}

	public String capitalLetterValidator(String psw) {
		if (psw.matches(".*[A-Z].*")) {
			return "";
		}
		return "Le mot de pass doit contenir au moins une lettre majuscule\n";
	}

	public String specialCharValidator(String psw) {
		if (psw.matches(".*[!@#%^&*()_+-=`[`]{}|;\':\",./<>?~].*")) {
			return "";
		} else {
			return "Le mot de passe doit contenir au moins un caratère spécial\n";
		}
	}

	public static void main(String[] args) {
		PasswordValidator validator = new PasswordValidator();
		System.out.println(validator.lengthValidator("1234567"));
	}
}
