package stringcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {


//	"2,\n3" n'est pas valide, mais il n'est pas nécessaire de le clarifier avec le programme
//	4. Ajouter une validation pour ne pas autoriser un séparateur à la fin.

//	Par exemple, "1,2," devrait renvoyer une erreur (ou lancer une exception).
//	5. Permettre à la méthode add de gérer différents délimiteurs

//	Pour changer le délimiteur, le début de l'entrée contiendra une ligne séparée qui ressemblera à ceci :
	// [délimiteur]\n[nombres]
//	"//;\n1;3" devrait retourner "4"
//	"//|\n1|2|3" renvoie "6"
//	"//sep\n2sep5" renvoie à "7"
//	"//|\n1|2,3" n'est pas valide et devrait renvoyer une erreur (ou lancer une exception) avec le message "'|' attendu mais ',' trouvé à la position 3".
//	ARRÊTEZ-VOUS ICI si vous êtes débutant. Continuez si vous pouvez terminer les étapes (1-5.) en 30 minutes.

	StringCalculator calc;

	@Before
	public void init() {
		calc = new StringCalculator();
	}
	
	@Test
	public void shouldReturnExceptionIfInputContainCommaAndLineSeparatorWithoutNumbersBetween() {
		Exception exception = assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("1,\n6");
		});

		String expectedMessage = "For input string";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void shouldReturnResultIfInputContainCommaAndLineSeparator() {
		assertEquals(6, calc.add("1,2\n3"));
	}
	@Test
	public void shouldReturnResultIfInputContainLineSeparator() {
		assertEquals(6, calc.add("6\n0"));
	}

	@Test
	public void shouldReturn0IfInputIsEmpty() {
		assertEquals(0, calc.add(""));
	}

	@Test
	public void shouldReturnInputIfNoSeparator() {
		assertEquals(3, calc.add("3"));
	}

	@Test
	public void shouldReturnAritmeticExceptionIfInputHaveCommaWhithoutSecondNumber() {
		Exception exception = assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("1,");
		});

		String expectedMessage = "For input string";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	public void shouldReturnAritmeticExceptionIfInputHaveLineSeparatorWhithoutSecondNumber() {
		Exception exception = assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("1\n");
		});

		String expectedMessage = "For input string";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void shouldAddTwoNumbersSeparateWithAComma() {
		assertEquals(6, calc.add("2,4"));
	}

}
