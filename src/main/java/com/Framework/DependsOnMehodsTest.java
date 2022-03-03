package com.Framework;

import org.testng.annotations.Test;

public class DependsOnMehodsTest {
	@Test(dependsOnMethods="pink",groups= {"regression"})
	public void red() {
		System.out.println("I like red");
	}
	@Test
	public void blue() {
		System.out.println("My favourite color");
	}
	@Test(dependsOnMethods="blue")
	public void pink() {
		System.out.println("My second favourite color");
	}
}
