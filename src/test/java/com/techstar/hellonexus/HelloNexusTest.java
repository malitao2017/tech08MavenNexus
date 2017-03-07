package com.techstar.hellonexus;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.techstar.hellonexus.HelloNexus;

public class HelloNexusTest{
	
	@Test
	public void testSayHello(){
		HelloNexus hm = new HelloNexus();
		String test = hm.sayHello();
		assertEquals("Hello Nexus",test);
	}
}

