package com.Framework;

import org.testng.annotations.Test;

public class PriorityAttributeTest {
	@Test(priority=2,groups= {"regression"})
public void red() {
	System.out.println("I like red");
}
	@Test(priority=1)
public void blue() {
	System.out.println("My favourite color");
}
	@Test(priority=0)
public void pink() {
	System.out.println("My second favourite color");
}
}
