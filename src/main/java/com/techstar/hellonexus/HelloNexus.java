package com.techstar.hellonexus;

import oracle.jdbc.driver.OracleDriver;

/**
* groupId + artifactId
**/
public class HelloNexus{
	public String sayHello(){
		oracle.jdbc.driver.OracleDriver oracle = new OracleDriver();
		System.out.println("Hello Nexus : "+oracle);
		return "Hello Nexus";
	}
	
	
}

