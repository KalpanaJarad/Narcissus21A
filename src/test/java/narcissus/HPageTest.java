package narcissus;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.narcissus.base.BaseTest;
import com.narcissus.pages.HomePage;
import com.narcissus.pages.JoinMeetingPage;

public class HPageTest extends BaseTest{
	@Test
	public void	verifyOnClickOnJoinMeetingUserRedirectsToJoinMeetingPage()
		{   String expecptedText="Quick Join a Meeting";
			//HomePage home=new HomePage();
			HomePage home=new HomePage();
			home.clickOnJoinMeetingLink();
			JoinMeetingPage joinmeeting=new JoinMeetingPage();
			String actual=joinmeeting.getQuickJoinMeetingText();
			Assert.assertEquals(actual,expecptedText);
		}
}
