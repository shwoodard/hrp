package org.hrp.lexical;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonNameImplTest {
	private PersonName _name;

	@Before
	public void setUp() throws Exception {
		_name = new PersonNameImpl("George", "Foreman");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		assertEquals("George Foreman", _name.getName());
	}

	@Test
	public void testGetName_1() {
		_name.setFirstName("Harry");
		assertEquals("Harry Foreman", _name.getName());
	}

	@Test
	public void testGetName_2() {
		_name.setLastName("Jones");
		assertEquals("George Jones", _name.getName());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("George", _name.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Foreman", _name.getLastName());
	}

	@Test
	public void testSetFirstName() {
		testGetLastName();
		_name.setFirstName("Peter");
		assertEquals("Peter", _name.getFirstName());
	}

	@Test
	public void testSetLastName() {
		testGetLastName();
		_name.setLastName("Jones");
		assertEquals("Jones", _name.getLastName());
	}
}
