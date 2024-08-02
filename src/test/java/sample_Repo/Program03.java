package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program03 {

	@Test
	public void strictLevelComparison() {
		String expectedValue="raja";
		String actualValue="raja";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Assertion passed...!!");
	}
	
	@Test
	public void containsLevel() {
		String expectedValue="raja";
		String actualValue="MahaRaja";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains passed...!!!");
	}
}
