package task3;

import org.testng.annotations.Test;

public class Another
{

	@Test(dataProvider="sampledata",dataProviderClass=Day4.class)
	private void fb(String s1,String s2) 
	{
		System.out.println(s1);
		System.out.println(s2);
	
	}
}
