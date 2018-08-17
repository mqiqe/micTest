package com.wfg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WfgConfigServiceApplicationTests {

	@Test
	public void contextLoads() {
		new Thread(() -> System.out.print("htllo World!")).start();
	}
}
