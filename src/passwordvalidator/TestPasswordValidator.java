package passwordvalidator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPasswordValidator {

	PasswordValidator validator = new PasswordValidator();

	@Test
	public void shouldReturnMessageIfPasswordIsLessThanMinimumLength() {
		assertEquals("Le mot de passe doit contenir au moins 8 caractères\n", validator.lengthValidator(""));
		assertEquals("", validator.lengthValidator("12345678"));
	}

	@Test
	public void shouldReturnMessageIfPasswordHaveLessThanTwoNumbers() {
		assertEquals("Le mot de passe doit contenir au moins 2 chiffres\n", validator.numbersValidator(""));
		assertEquals("", validator.numbersValidator("12345678"));
		assertEquals("Le mot de passe doit contenir au moins 2 chiffres\n", validator.numbersValidator("1"));
	}

	@Test
	public void shouldReturnMultipleErrorMessage() {
		assertEquals(
				"Le mot de passe doit contenir au moins 8 caractères\nLe mot de passe doit contenir au moins 2 chiffres\n",
				validator.errorValidator(""));
		assertEquals(
				"Le mot de passe doit contenir au moins 8 caractères\n",
				validator.errorValidator("ABC12FG"));
		assertEquals(
				"Le mot de passe doit contenir au moins 2 chiffres\n",
				validator.errorValidator("ABCDEFGH"));
	}
	
	@Test
	public void shouldContainCapitalLetter() {
		assertEquals("Le mot de pass doit contenir au moins une lettre majuscule\n", validator.capitalLetterValidator(""));
		assertEquals("Le mot de pass doit contenir au moins une lettre majuscule\n", validator.capitalLetterValidator("azertyui"));
		assertEquals("", validator.capitalLetterValidator("Azerty"));
	}
	
	@Test
	public void shouldReturnMessageIfPasswornNotContainASpecialCharacter() {
		assertEquals("Le mot de passe doit contenir au moins un caratère spécial\n", validator.specialCharValidator("AZERQSDF"));
		assertEquals("", validator.specialCharValidator("A12%ERFESDS"));
		assertEquals("Le mot de passe doit contenir au moins un caratère spécial\n", validator.specialCharValidator(""));

	}
}
