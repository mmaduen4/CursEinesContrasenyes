package cat.madueno;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PasswordValidatorTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	static Stream<Arguments> createContrasenyesValides() {
		return Stream.of(Arguments.of("aBCDEF11s4"),Arguments.of("aBCD2F11s4"),Arguments.of("aBCDEFa1s4"));
	}
	
	static Stream<Arguments> createContrasenyesNoValides() {
		return Stream.of(Arguments.of("abcdef1"), Arguments.of("ABCDEF1"),Arguments.of("abcdefgh"), Arguments.of("ABCDEFGH"),
				Arguments.of("abcdefg1"), Arguments.of("ABCDEFG1"),Arguments.of("abcdef11"), Arguments.of("ABCDEF11"));
	}

	@ParameterizedTest
	@MethodSource("createContrasenyesValides")	
	public void testContrasenyaValida(String contrasenya)
	{
		PasswordValidator validador=new PasswordValidator(contrasenya);		
		assertTrue(validador.validate());
	}
	
	@ParameterizedTest
	@MethodSource("createContrasenyesNoValides")	
	public void testContrasenyaNoValida(String contrasenya)
	{
		PasswordValidator validador=new PasswordValidator(contrasenya);		
		assertFalse(validador.validate());
	}
	
	
}
