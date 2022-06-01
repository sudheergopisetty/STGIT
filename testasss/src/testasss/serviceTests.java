package testasss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class serviceTests {

	@Test
	void testSaHello() {
		service service = new service();
		assertEquals("welcome launch", service.saHello("launch"));
	}

}
