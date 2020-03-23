package com.epam.ht8.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemovalOfAtest {
	/*
	 * ABCD-->BCD
	 * AACD-->CD
	 * BACD-->BCD
	 * BBAA-->BBAA
	 * AABAA-->BAA
	 */
	OmitA a = null ;
	@BeforeEach
	public  void setup() {
		 a= new OmitA();
	}
    
	@Test
	void testfirstA() {
		
		assertEquals("BCD",a.removeA("ABCD"));
		
	}
	@Test
	void testsecondA() {
		
		assertEquals("BCD",a.removeA("BACD"));
		
	}
	@Test
	void firstsecondA() {
		
		assertEquals("CD",a.removeA("AACD"));
		
	}
	@Test
	void noA() {
		
		assertEquals("BBAA",a.removeA("BBAA"));
		
	}
	@Test
	void firstseecondAnchars() {
			assertEquals("BAA",a.removeA("AABAA"));
		
	}

}
