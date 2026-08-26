import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecurityTests {

	@Test
public void testloginEmptyUserID() {
		String userId = "", password = "Freddy99";
		Security security = new Security();
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginEmptyPassword() {
		String userId = "user123", password = "";
		Security security = new Security();
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginPasswordUnderEightCharacters() {
		String userId = "user123", password = "Fredd99";
		Security security = new Security();
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginPasswordExactlyEightCharactersValid() {
		String userId = "user123", password = "Abcdefg1";
		Security security = new Security();
		boolean actual = security.login(userId, password);
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
