package task5;

public class Failed 
{
	public class Failed implements IRetryAnalyzer 
	{

		int min=0,max=3;
		public boolean retry(ITestResult result) 
		{
			if(min<max)
			{
				min++;
			return true;
		}
			return false;
		}
}
}