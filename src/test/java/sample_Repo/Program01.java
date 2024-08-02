package sample_Repo;

import org.testng.annotations.Test;

/**
 * 1.@Test is mandatory for all the test cases, without @Test test cases will not 
 * participate in execution.
 * 2.We can provide @Test in class level but it is not recommend choice because 
 * in a class some generic functions also will be present and in this those functions
 * also will be executed like test cases.
 * 3.we should always provide @Test in  method level.
 * --->priority attribute<---
 * A. If we want to execute test cases in customize order we have to use "priority"
 * attribute(ex:-@Test(priority=1)
 * B. If we don't provide priority test cases will execute alphabetically or AASCII valur.
 * C. Default priority is '0'.
 * D. First priority will goes to lowest number.
 * E. We can provide negative priority also.(ex:-@Test(priority=-2))
 * F. If multiple test cases having same priority then for those test cases it will
 * execute based on alphabets.
 */
//@Test
public class Program01 {

	@Test(priority=1)
	public void createUser() {
		System.out.println("cu");
	}
	
	@Test(priority=2)
	public void modifyUser() {
		System.out.println("mu");
	}
	
	@Test(priority=3)
	public void deleteUser() {
		System.out.println("du");
	}
	
}
