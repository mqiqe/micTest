package com.wfg;

import org.junit.Test;

public class DemoTest {
	@Test
	public void contextLoads() {
		new Thread(() -> System.out.print("htllo World!")).start();
	}
}
