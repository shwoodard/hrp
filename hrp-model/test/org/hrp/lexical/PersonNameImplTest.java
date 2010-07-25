package org.hrp.lexical;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonNameImplTest {
	private PersonName _name;

	@Before
	public void setUp() throws Exception {
		_name = new PersonNameImpl();
		_name.setFirstName("George");
		_name.setLastName("Foreman");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		assertEquals("George Foreman", _name.getName());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("George", _name.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Foreman", _name.getLastName());
	}

}
