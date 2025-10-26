package class19_abstract_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AssetionTest {
	public void test1()
	{
		System.out.println("Start");
		
		/*
		 * String name1="Dinesh"; String name2="Dinesh";
		 */		
		//Assert.assertEquals("Dinesh", "Dinesh","failed");
		
		List<String> l1=new ArrayList<String>();
		l1.add("Java");
		l1.add("JavaScriptS");
		List<String> lj=Arrays.asList("Java","JavaScript");
		List<String> l2=Arrays.asList("Test","Failed");
		Assert.assertNotEquals(l1, lj,"failed");
		
		String megs="Welcome to Board";
		Assert.assertFalse(megs.contains("board"),"Passed");
System.out.println(l1);
		

		System.out.println("Exit");
	}

}
