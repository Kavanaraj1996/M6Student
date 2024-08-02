package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program04 {

	@Test
	public void strictLevelComparison() {
		String expectedValue="raja";
		String actualValue="raja";
		SoftAssert sf= new SoftAssert();
		sf.assertEquals(actualValue, expectedValue);
		System.out.println("Assertion passed...!!");
		sf.assertAll();
	}
	
	@Test
	public void containsLevel() {
		String expectedValue="raja";
		String actualValue="MahaRaja";
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains passed...!!!");
		sf.assertAll();
	}
}
