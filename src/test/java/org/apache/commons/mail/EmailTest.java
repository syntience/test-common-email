package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private static final String[] TEST_EMAILS = { "ab@bc.com", "a.b@c.org", "abcdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd" };
	private static final String[] TEST_EMPTY = {  };
	private static final String TEST_EMAIL = "ab@bc.com";
	private static final String TEST_NAME = "test";
	private static final String TEST_VALUE = "test";	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmaiLtest() throws Exception{
		
	}

	//test addBcc() with both a list of emails and an empty list
	@Test
	public void testAddBcc() throws Exception{
		email.addBcc(TEST_EMAILS);
		assertEquals(3, email.getBccAddresses().size());
		email.addBcc(TEST_EMPTY);
		assertEquals(0, email.getBccAddresses().size());
	}

	//test addCc() with one email
	@Test
	public void testAddCc() throws Exception{
		email.addCc(TEST_EMAIL);
		assertEquals(1, email.getCcAddresses().size());
	}
}
