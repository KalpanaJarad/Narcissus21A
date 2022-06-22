package narcissus;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.openqa.selenium.support.ui.WebDriverWait;



public class Waits {

	WebDriverWait wait=null;
	public Waits()
	{
		wait =new WebDriverWait(Keyword.driver, Duration.ofSeconds(30));
		wait.withMessage("TimeOut for while wating for the element");
		wait.pollingEvery(Duration.ofMillis(500));
		
	}
	public void forDuration(long seconds)
	{
		DateTimeFormatter form=DateTimeFormatter.ofPattern("ss");
		LocalDateTime now=LocalDateTime.now();
		String time=form.format(now);
		long startTime=Long.valueOf(time);
		long endTime=startTime+seconds;
		System.out.println("Start Time:"+startTime+" End Time"+endTime);
		while(startTime !=endTime)
		{

		 form=DateTimeFormatter.ofPattern("ss");
			 now=LocalDateTime.now();
			 time=form.format(now);
			startTime=Long.valueOf(time);
		}
	}
	
	public static void main(String[] args) {
		new Waits().forDuration(4);
	}
}
