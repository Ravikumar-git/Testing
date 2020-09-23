package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileutil.MobileKeywords;
import sunnxtMobileLocators.SunNxt_locators.AboutUs;
import sunnxtMobileLocators.SunNxt_locators.Actors;
import sunnxtMobileLocators.SunNxt_locators.Addwatchlist;
import sunnxtMobileLocators.SunNxt_locators.Allow;
import sunnxtMobileLocators.SunNxt_locators.CCDCPAYTM;
import sunnxtMobileLocators.SunNxt_locators.Carouselviewall;
import sunnxtMobileLocators.SunNxt_locators.ChangeAppLanguage;
import sunnxtMobileLocators.SunNxt_locators.ChangeContentLanguage;
import sunnxtMobileLocators.SunNxt_locators.ComedyCarousel;
import sunnxtMobileLocators.SunNxt_locators.ContinueWatching;
import sunnxtMobileLocators.SunNxt_locators.Couponcode;
import sunnxtMobileLocators.SunNxt_locators.Devices;
import sunnxtMobileLocators.SunNxt_locators.Discover;
import sunnxtMobileLocators.SunNxt_locators.DownloadContent;
import sunnxtMobileLocators.SunNxt_locators.EditProfile;
import sunnxtMobileLocators.SunNxt_locators.FAQs;
import sunnxtMobileLocators.SunNxt_locators.FeedBack;
import sunnxtMobileLocators.SunNxt_locators.Filters;
import sunnxtMobileLocators.SunNxt_locators.ForgotPasswordEmail;
import sunnxtMobileLocators.SunNxt_locators.Genres;
import sunnxtMobileLocators.SunNxt_locators.Headercontaint;
import sunnxtMobileLocators.SunNxt_locators.HomeCarousel;
import sunnxtMobileLocators.SunNxt_locators.Login;
import sunnxtMobileLocators.SunNxt_locators.Logout;
import sunnxtMobileLocators.SunNxt_locators.MovieCarousel;
import sunnxtMobileLocators.SunNxt_locators.MusicVideosCarousel;
import sunnxtMobileLocators.SunNxt_locators.NonSubscribedUser;
import sunnxtMobileLocators.SunNxt_locators.ProfilePicChange;
import sunnxtMobileLocators.SunNxt_locators.Recommended;
import sunnxtMobileLocators.SunNxt_locators.Roamingactivate;
import sunnxtMobileLocators.SunNxt_locators.Searching;
import sunnxtMobileLocators.SunNxt_locators.Share;
import sunnxtMobileLocators.SunNxt_locators.SigUp;
import sunnxtMobileLocators.SunNxt_locators.Subscriptions;
import sunnxtMobileLocators.SunNxt_locators.SwitchProfile;
import sunnxtMobileLocators.SunNxt_locators.TVShowsGenres;
import sunnxtMobileLocators.SunNxt_locators.TVShowsTVChannels;
import sunnxtMobileLocators.SunNxt_locators.TvShowsCarousel;
import sunnxtMobileLocators.SunNxt_locators.VideoQuality;
import sunnxtMobileLocators.SunNxt_locators.Wifi;
import utilities.DriverUtil;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class SunNxtFunctions extends MobileKeywords {
	@Given("^open the SunNxt App$")
	public void launch_SunNxt_App() {
		try {

			DriverUtil.getMobileApp();
		} catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Given("^user click free content video$")
	public void user_click_free_content_video() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(Allow.Allow_Btn).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");

		}

		if (GlobalUtil.getMDriver().findElement(Allow.Allow_Btn).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}

		click(Allow.selectFirstLanguege, "User select's the language");

		click(Allow.next, "User tap on next button");

		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		// click(Allow.click_coachmark, "user click Accept button");
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		// click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		// clickUsingCoordinates(535,499);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(1000);
		swipeUp(1);
	}

	@Then("^user observe video playing or not$")
	public void user_observe_video_playing_or_not() throws Exception {
		Thread.sleep(1000);
		click(NonSubscribedUser.NonSubMovie_Img, "user click one free content video");
		Thread.sleep(5000);

	}

	@Given("^user click any movie item$")
	public void user_click_any_movie_item() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");

		}

		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Headercontaint.MusicVideos_Btn, " user click music videos button");
		Thread.sleep(1000);
		swipeUp(1);
		Thread.sleep(3000);
		click(NonSubscribedUser.NonSubMovie2_Img, "user click one premium content movie");
	}

	@Then("^user observe subscription popup displayed or not$")
	public void user_observe_subscription_popup_displayed_or_not() throws Exception {
		Thread.sleep(3000);
		String signIn = getElementText(SigUp.SubscribeNow_Btn, "Sign IN page is displayed");
		System.out.println(signIn);
		if (signIn.equalsIgnoreCase("Sign In")) {
			System.out.println("Sign IN Page Verified Text Successfully");
		}
		// click(NonSubscribedUser.NonSubSkip_Btn, "user click skip button");

	}

	@Given("^Read the test data \"([^\"]*)\" and \"([^\"]*)\" from Excel file$")

	public void given_Read_the_test_data_from_Excel_file(String arg1, String arg2) {
		try {
			GlobalUtil.dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, arg2);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^play any movie content$")
	public void play_any_movie_content() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");

		}

		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}

		click(Allow.selectFirstLanguege, "User select's the language");

		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		click(Login.SelectMovie_Btn, "user click one movie");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		// clickUsingCoordinates(632,1182);
		Thread.sleep(1000);
		// clickUsingCoordinates(382,1467);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(2000);
		click(Login.SelectMoviePlay_Btn, "user click play button");
	}

	@When("^click existing user button$")
	public void click_existing_user_button() throws Exception {

		click(Login.ExistingUser_Btn, "user click existing user button");

	}

	@And("^enter valid credentials$")
	public void enter_valid_credentials() throws Exception {
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered mobile number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
	}

	@And("^observe user login or not$")
	public void observe_user_login_or_not() throws Exception {

		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(5000);

	}

	@When("^user click subscribe now button$")
	public void user_click_subscribe_now_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		click(SigUp.SelectMovie2_Btn, "user click one movie icon");
		Thread.sleep(3000);
		clickUsingCoordinates(632, 1182);
		Thread.sleep(1000);
		clickUsingCoordinates(382, 1467);
		Thread.sleep(1000);
		click(SigUp.SelectMovie2Play_Btn, "user click play button");
		click(SigUp.SubscribeNow_Btn, "user click subscribe Now button");

	}

	@Then("^fill all required details in signup$")
	public void fill_all_required_details_in_signup() throws Exception {
		inputText(SigUp.SigUpMobile_Txt, GlobalUtil.dataMap.get("SignUpMobileNumber"), "Entered mobile number");
		inputText(SigUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created  password");
		inputText(SigUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
		click(SigUp.SigUpAge_Btn, "user click age drop down button");
		click(SigUp.SigUpAgeRange_Btn, "user click one age range");
		click(SigUp.SigUpGender_Btn, "user click one gender button");
		click(SigUp.SignUpCountry_Btn, "user click country drop down button");
		click(SigUp.SignUpSelectCountry_Btn, "user click one country");
		click(SigUp.SignUpState_Btn, "user click state drop down button");
		click(SigUp.SignUpSelectState_Btn, "user click one state");

	}

	@And("^click Submit button$")
	public void click_Submit_button() throws Exception {
		click(SigUp.SignUpSubmit_Btn, "user click submit button");
		click(SigUp.MobileNumberExist_Btn, "user click number exist OK button");
		Thread.sleep(5000);
	}

	@When("^user click login page button$")
	public void user_click_login_page_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");

		click(Login.Profile2_Btn, "user click LOG IN button");

	}

	@Then("^user click SignUp button$")
	public void user_click_SignUp_button() throws Exception {
		click(Login.SignUp_Btn, "user click signup button");
	}

	@And("^enter all required details in Signup page$")
	public void enter_all_required_details_in_Signup_page() throws Exception {

		inputText(SigUp.SigUpMobile_Txt, GlobalUtil.dataMap.get("SignUpMobileNumber"), "Entered mobile number");
		inputText(SigUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created password");
		inputText(SigUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
		click(SigUp.SigUpAge_Btn, "user click age drop down button");
		click(SigUp.SigUpAgeRange_Btn, "user select one age range");
		click(SigUp.SigUpGender_Btn, "user select one gender button");
		click(SigUp.SignUpCountry_Btn, "user click country drop down button");
		click(SigUp.SignUpSelectCountry_Btn, "user select one country");
		click(SigUp.SignUpState_Btn, "user click state drop down button");
		click(SigUp.SignUpSelectState_Btn, "user select one state");
		click(SigUp.SignUpSubmit_Btn, "user click submit button");
		click(SigUp.MobileNumberExist_Btn, "user click exist number ok button");
		Thread.sleep(5000);

	}

	@When("^user Enter valid Email ID in text field$")
	public void user_Enter_valid_Email_ID_in_text_field() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		Thread.sleep(2000);

		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("ForgotPasswordEmailID"), "Entered Email ID");
	}

	@Then("^user observe link receive to Email ID$")
	public void user_observe_link_receive_to_Email_ID() throws Exception {
		click(ForgotPasswordEmail.ForgotPwd_Btn, "user click forgot password button");
		click(ForgotPasswordEmail.ForgotPwdSubmit_Btn, "user click submitbutton");
		Thread.sleep(5000);
		// Back();
	}

	@Given("^user Enter valid mobile number in text field$")
	public void user_Enter_valid_mobile_number_in_text_field() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("ForgotPasswordMobileNumber"), "Entered Mobile number");
	}

	@Then("^user observe OTP receive to the register mobiile number$")
	public void user_observe_OTP_receive_to_the_register_mobiile_number() throws Exception {

		click(ForgotPasswordEmail.ForgotPwd_Btn, "user click forgot password button");
		click(ForgotPasswordEmail.ForgotPwdSendOTP_Btn, "user click request OTP button");
		String OTP = getElementText(ForgotPasswordEmail.ForgotPhoneOTP_Btn, "ENTER OTP TEXT box is displayed");
		System.out.println(OTP);
		if (OTP.equalsIgnoreCase("Enter OTP")) {
			System.out.println("Sign IN Page Verified Text Successfully");
		}
		Thread.sleep(2000);
		Back();

	}

	@When("^user click login button$")
	public void user_click_login_button() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");

	}

	@Then("^user login to sunnxt portal by using guest credentials and play free content$")
	public void user_login_to_sunnxt_portal_by_using_guest_credentials_and_play_free_content() throws Exception {
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(1000);
		swipeUp(1);
		Thread.sleep(2000);
		click(NonSubscribedUser.NonSubMovie_Img, "user click one free content video");
		Thread.sleep(5000);

	}

	@Given("^user login sunnxt portal and user perform logout opertion$")
	public void user_login_sunnxt_portal_and_user_perform_logout_opertion() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered guest user mobile number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered guest user password");
		click(Login.Login_Btn, "user click login button");

		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Logout.Logout_Btn, "user click logout button");
		click(Logout.Logout2_Btn, "user click logout OK button");
		Thread.sleep(5000);
	}

	@Given("^user login sunnxt portal by using EMAIL$")
	public void user_login_sunnxt_portal_by_using_EMAIL() throws Exception {

		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(5000);
	}

	@Given("^user observe swipe bottom in side of movies$")
	public static void user_observe_swipe_bottom_in_side_of_movies() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		// Thread.sleep(2000);
		swipeUp1(5, "swipe up");
		// swipeUp_FindElementClick(8, Headercontaint.Movies_Swipe_Btn);

	}

	@Then("^user observe swipe bottom in side of TVShows$")
	public static void user_observe_swipe_bottom_in_side_of_TVShows() throws Exception {
		click(Headercontaint.TVShow_Btn, "user click TVShow button");
		// Thread.sleep(2000);
		swipeUp1(4, "swipe up");
		// swipeUp_FindElementClick(10, Headercontaint.TVShow_Swipe_Btn);

	}

	@When("^user observe swipe bottom in side of music videos$")
	public static void user_observe_swipe_bottom_in_side_of_music_videos() throws Exception {
		// Thread.sleep(5000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		// Thread.sleep(2000);
		swipeUp1(3, "swipe up");
		// swipeUp_FindElementClick(8, Headercontaint.MusicVideos_Swipe_Btn);

	}

	@And("^user observe swipe bottom in side of comdies$")
	public static void user_observe_swipe_bottom_in_side_of_comdies() throws Exception {
		// Thread.sleep(5000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		// Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(3000);
	}

	@Given("^user click edit profile button$")
	public static void user_click_edit_profile_button() throws Exception {

		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(EditProfile.Edit_Btn, "user click edit profile button");
	}

	@Then("^user select age range$")
	public static void user_select_age_range() throws Exception {

		click(EditProfile.EditCompleteProfile_Btn, "user click edit complete profile button");
		Thread.sleep(5000);
		inputText(EditProfile.EditName_Txt, GlobalUtil.dataMap.get("EditProfileFirstName"), "Entered first name");
		click(EditProfile.EditAge_Btn, "user click age button");
		click(EditProfile.EditSelectAge_Btn, "user select one age range");

	}

	@When("^user select country and state$")
	public static void user_select_country_and_state() throws Exception {
		click(EditProfile.EditCountry_Btn, "user click country button");
		click(EditProfile.EditSelectCountry_Btn, "user select one country");
		click(EditProfile.EditState_Btn, "user click state button");
		click(EditProfile.EditSelectState_Btn, "user select one state");
	}

	@And("^user observe edit profile change or not$")
	public static void user_observe_edit_profile_change_or_not() throws Exception {
		Thread.sleep(1000);
		swipeUp1(1, "swipe up");
		Thread.sleep(1000);
		click(EditProfile.Done_Btn, "user click done button");
		Thread.sleep(1000);
		click(EditProfile.Save_Btn, "user click save button");
		Thread.sleep(5000);
	}

	@Given("^user click on profile photo$")
	public void user_click_on_profile_photo() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(EditProfile.Edit_Btn, "user click edit profile button");
		click(ProfilePicChange.ProfilePic_Img, "user click profile photo image");
	}

	@Then("^user select one image of the library$")
	public void user_select_one_image_of_the_library() throws Exception {
		click(ProfilePicChange.ChooseFromLibrary_Btn, "user click choose from library button");
		click(ProfilePicChange.ChooseOnePic_Btn, "user select one pic from the library");
		// if(isWebElementNotPresent(EditProfile.Save_Btn))
		// {
		// Thread.sleep(5000);
		// click(EditProfile.Save_Btn, "user click save button");
		// }
		// else
		// {
		// Thread.sleep(10000);
		// }

		// click(EditProfile.Save_Btn, "user click save button");

	}

	@When("^user observe the profile photo is update or not$")
	public void user_observe_the_profile_photo_is_update_or_not() throws Exception {
		// click(EditProfile.Edit_Btn, "user click edit profile image");
		click(ProfilePicChange.ProfilePic_Img, "user click profile photo image");
		click(ProfilePicChange.RemoveOhoto_Btn, "user click remove upload photo button");
		// click(EditProfile.Save_Btn, "user click save button");
		Thread.sleep(3000);
	}

	@Given("^user click subscrption button$")
	public static void user_click_subscrption_button() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Subscriptions.Subscriptions_Btn, "user click subscriptions button");
		click(Subscriptions.Invoice_Btn, "user click invoice button");
	}

	@Then("^user observe the customer state$")
	public static void user_observe_the_customer_state() throws Exception {
		Thread.sleep(1000);
		String state = getElementText(Subscriptions.CustomerState_Txt, "customer state is displayed");
		System.out.println(state);
		if (state.equalsIgnoreCase("Telangana")) {
			System.out.println("customer state is displayed");
		}
		Thread.sleep(3000);

	}

	@Given("^user login by unsubscription credentials and click subscription button$")
	public void user_login_by_unsubscription_credentials_and_click_subscription_button() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Subscriptions.Subscriptions_Btn, "user click subscriptions button");
	}

	@Then("^user select payment mode through credit card$")
	public void user_select_payment_mode_through_credit_card() throws Exception {
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		click(CCDCPAYTM.DebitCard_Btn, "user click debit card button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");
		Thread.sleep(3000);
		Back();

	}

	@And("^user select payment mode through debit card$")
	public void user_select_payment_mode_through_debit_card() throws Exception {
		Thread.sleep(1000);
		click(Subscriptions.Subscriptions_Btn, "user click subscriptions button");
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		click(CCDCPAYTM.CreditCard_Btn, "user click credit card button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");
		Thread.sleep(3000);
		Back();
	}

	@Then("^user select payment mode through paytm$")
	public void user_select_payment_mode_through_paytm() throws Exception {
		Thread.sleep(1000);
		click(Subscriptions.Subscriptions_Btn, "user click subscriptions button");
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		click(CCDCPAYTM.Paytm_Btn, "user click paytm button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");
		Thread.sleep(3000);
		Back();
	}

	@Given("^user observe the subscription plan switching$")
	public void user_observe_the_subscription_plan_switching() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Subscriptions.Subscriptions_Btn, "user click subscriptions button");
		Thread.sleep(3000);
		clickUsingCoordinates(408, 1167);
		// Thread.sleep(3000);

		String renew = getElementText(Subscriptions.ReNewPlan_Btn, "RENEW/UPGRADE PLAN text button is displayed");
		System.out.println(renew);
		if (renew.equalsIgnoreCase("Renew / Upgrade Plan")) {
			System.out.println("Renew / Upgrade Plan text button is displayed");
		}
		Thread.sleep(5000);
		// getElementText(Subscriptions.ReNewPlan_Btn, "user observe the TEXT of
		// element");

		// click(Subscriptions.ReNewPlanBack_Btn, "user click back arrow");
		// Thread.sleep(5000);
		// click(Subscriptions.SubscriptionBack_Btn, "user click Subscriptions back
		// button");
		// Thread.sleep(5000);
		// Back();

	}

	@Given("^user click comedy button and select view all button$")
	public void user_click_comedy_button_and_select_view_all_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music video button");
		Thread.sleep(1000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		// swipeDown(10);
		// HorizontalSwipe(2);
		// horizontalSwipeWRTOelment(Genres.GenSwipeHorizontal_Btn, 800, 100);
		// Thread.sleep(5000);
		// horizontalSwipeWRTOelment("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]",
		// 80, 30);
		// Thread.sleep(3000);
		click(Genres.GenViewAllMovies_Btn, "user click view All movies button in comedy");

	}

	@When("^user click movie button and select on one category$")
	public void user_click_movie_button_and_select_on_one_category() throws Exception {
		// Thread.sleep(5000);
		click(Genres.GenGenres_Btn, "user click movies button in comedy");

		click(Genres.GenSelectCategory_Btn, "user select one category in movies");

		click(Genres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on that select category in movies$")
	public void user_play_one_video_on_that_select_category_in_movie() throws Exception {

		click(Genres.GenMovieSelect_Img, "user select and play one movie in movie");
		Thread.sleep(2000);
		// click(Allow.click_coachmark, "user click coachmark");
		// Thread.sleep(1000);
		// click(Allow.click_coachmark, "user click coachmark");
		// Thread.sleep(1000);
		// click(Genres.GenMoviePlay_Btn, "user click play button");
		// Thread.sleep(5000);

	}

	@Given("^user click comedy button and select viewall button$")
	public void user_click_comedy_button_and_select_viewall_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music video button");
		Thread.sleep(1000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		Thread.sleep(1000);
		// swipeDown(10);
		// HorizontalSwipe(2);
		// horizontalSwipeWRTOelment(Genres.GenSwipeHorizontal_Btn, 800, 100);
		// Thread.sleep(5000);
		// horizontalSwipeWRTOelment("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]",
		// 80, 30);
		// Thread.sleep(3000);
		click(Genres.GenViewAllMovies_Btn, "user click view All movies button in comedy");

	}

	@When("^user click comedians button and select on one category$")
	public void user_click_comedians_button_and_select_on_one_category() throws Exception {
		// Thread.sleep(5000);
		click(Actors.ActActors_Btn, "user click comedians button in comedy");

		click(Genres.GenSelectCategory_Btn, "user select one category in comedians");

		click(Genres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on that select category in comedians$")
	public void user_play_one_video_on_that_select_category_in_comedians() throws Exception {

		click(Genres.GenMovieSelect_Img, "user select and play one video in comedians");
		// Thread.sleep(2000);
		// click(Allow.click_coachmark, "user click coachmark");
		// Thread.sleep(1000);
		// click(Allow.click_coachmark, "user click coachmark");
		// Thread.sleep(1000);
		// click(Genres.GenMoviePlay_Btn, "user click play button");
		Thread.sleep(5000);

	}

	@Given("^user click movie and select view all button$")
	public void user_click_movie_and_select_view_all_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(1000);
		// swipeDown(10);
		// HorizontalSwipe(2);
		// horizontalSwipeWRTOelment(Genres.GenSwipeHorizontal_Btn, 800, 100);
		// Thread.sleep(5000);
		// horizontalSwipeWRTOelment("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]",
		// 80, 30);
		// Thread.sleep(3000);
		click(Genres.GenViewAllMovies_Btn, "user click view All movies button");

	}

	@When("^user click geners button and select on one category$")
	public void user_click_geners_button_and_select_on_one_category() throws Exception {
		// Thread.sleep(5000);
		click(Genres.GenGenres_Btn, "user click genres button");

		click(Genres.GenSelectCategory_Btn, "user select one category");

		click(Genres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on that select category in geners$")
	public void user_play_one_video_on_that_select_category_in_geners() throws Exception {

		click(Genres.GenMovieSelect_Img, "user select one movie");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Genres.GenMoviePlay_Btn, "user click play button");
		Thread.sleep(5000);

	}

	@Given("^user click actors button and select on one category$")
	public void user_click_actors_button_and_select_on_one_category() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		click(Genres.GenViewAllMovies_Btn, "user click view All movies button");
		click(Actors.ActActors_Btn, "user click actors button");
		click(Actors.ActSelectCategort_Btn, "user select one category");
		click(Actors.ActOk_Btn, "user click ok button");

	}

	@Then("^user play one video on that select category in actors$")
	public void user_play_one_video_on_that_select_category_in_actors() throws Exception {

		click(Actors.ActMovieSelect_Img, "user select one movie");
		Thread.sleep(2000);
		clickUsingCoordinates(627, 1177);
		Thread.sleep(1000);
		clickUsingCoordinates(377, 1467);
		Thread.sleep(1000);
		click(Actors.ActMoviePlay_Btn, "user click  play button");
		Thread.sleep(5000);

	}

	@Given("^user click TVShow and select view all button$")
	public void user_click_TVShow_and_select_view_all_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		// Thread.sleep(3000);
		// swipeDown(10);
		// Thread.sleep(3000);
		click(TVShowsGenres.GenViewAllMovies_Btn, "user click view all shows button");
	}

	@When("^user click geners button in TVShow and select on one category$")
	public void user_click_geners_button_in_TVShow_and_select_on_one_category() throws Exception {

		click(TVShowsGenres.GenGenres_Btn, "user click genres button");

		click(TVShowsGenres.GenSelectCategory_Btn, "user click one category button");

		click(TVShowsGenres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on TVShows and select category in geners$")
	public void user_play_one_video_on_TVShows_and_select_category_in_geners() throws InterruptedException {

		click(TVShowsGenres.GenMovieSelect_Img, "user click one movie");
		Thread.sleep(5000);
		// Back();
		// Thread.sleep(1000);
		// Back();
	}

	@Given("^user click TVChannel button in TVShow and select on one category$")
	public void user_click_TVChannel_button_in_TVShow_and_select_on_one__category() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(2000);
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		click(TVShowsGenres.GenViewAllMovies_Btn, "user click view all shows button");
		click(TVShowsTVChannels.TVChannels_Btn, "user click tvchannel button");
		click(TVShowsTVChannels.TVChannelsSelectCategory_Btn, "user click one category");

	}

	@Then("^user play one video on TVShow and select category in TVChannels$")
	public void user_play_one_video_on_TVShow_and_select_category_in_TVChannels() throws Exception {

		click(TVShowsTVChannels.TVChannelsOk_Btn, "user click ok button");
		click(TVShowsTVChannels.TVChannelsMovieSelect_Img, "user click one movie");
		Thread.sleep(5000);
		// Back();
		// Thread.sleep(5000);
		// Back();

	}

	@Given("^user click change content language$")
	public void user_click_change_content_language() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(ChangeContentLanguage.ChangeContentLanguage_Btn, "user click change content language button");

		click(ChangeContentLanguage.ChangeLanguageMalayalam_Btn, "user click malayalam language button");
		click(ChangeContentLanguage.ChangeLanguageTamil_Btn, "user click tamil language button");

	}

	@Then("^user observe the selected language content displayed or not$")
	public void user_observe_the_selected_language_content_displayed_or_not() throws Exception {

		click(VideoQuality.VideoSave_Btn, "user click save button");
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(5000);
	}

	@Given("^user click change app language$")
	public void user_click_change_app_language() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(ChangeAppLanguage.ChangeAppLanguage_Btn, "user click change app language button");
	}

	@Then("^user observe the headers showing selected language content$")
	public void user_observe_the_headers_showing_selected_language_content() throws Exception {
		Thread.sleep(1000);
		click(ChangeAppLanguage.ChangeAppTelugu_Btn, "user click telugu language button");

		click(VideoQuality.VideoSave_Btn, "user click save button");
		Thread.sleep(1000);

		String text = getElementText(ChangeAppLanguage.ChangeAppHeaderTxt_Btn,
				"user observe the changed language TEXT is displayed");
		System.out.println(text);
		if (text.equalsIgnoreCase("చలన చిత్రాలు")) {
			System.out.println("user observe the changed language TEXT is displayed");
		}
		// getElementText(ChangeAppLanguage.ChangeAppHeaderTxt_Btn, "user observe the
		// TEXT of element");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile button");

		click(ChangeAppLanguage.ChangeAppLanguage_Btn, "user click change app language button");

		click(ChangeAppLanguage.ChangeAppEnglish_Btn, "user click telugu language button");

		click(VideoQuality.VideoSave_Btn, "user click save button");
		Thread.sleep(3000);
	}

	@Given("^user click settings button$")
	public void user_click_settings_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Wifi.WifiVerticalDots_Btn, "user click vertical dots button");

		click(Wifi.WifiSettings_Btn, "user click settings button");

	}

	@Then("^user observe wifi on and off button working$")
	public void user_observe_wifi_on_and_off_button_working() throws Exception {

		click(Wifi.WifiDownloadOnWIFI_Btn, "user on  wifi");
		Thread.sleep(3000);

		click(Wifi.WifiDownloadOnWIFI_Btn, "user off wifi");
		Thread.sleep(3000);

		// click(Wifi.WifiSettingsBack_Btn, "user click settings back button");
	}

	@Given("^user click video quality button$")
	public void user_click_video_quality_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Wifi.WifiVerticalDots_Btn, "user click vertical dots button");

		click(Wifi.WifiSettings_Btn, "user click settings button");

		click(VideoQuality.VideoQuality_btn, "user click video Quality button");

		click(VideoQuality.VideoAuto_Btn, "user DE-select Automatic quality button");
	}

	@Then("^user observe video quality changeing operation and play one content$")
	public void user_observe_video_quality_changeing_operation_and_play_one_content() throws Exception {

		click(VideoQuality.VideoMedium_Btn, "user click medium quality button");

		click(VideoQuality.VideoSave_Btn, "user click video Save button");
		Thread.sleep(2000);
		Back();
		Thread.sleep(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in Movies");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Thread.sleep(3000);
		Back();

	}

	@Given("^user click FeedBack button$")
	public void user_click_FeedBack_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Wifi.WifiVerticalDots_Btn, "user click vertical dots button");
		click(Wifi.WifiSettings_Btn, "user click settings button");
		click(FeedBack.FeedBack_Btn, "user click FeedBack button");

	}

	@Then("^user observe feedback submition$")
	public void user_observe_feedback_submition() throws Exception {

		inputText(FeedBack.FeedBackWrite_Txt, GlobalUtil.dataMap.get("Text"), "Entered text in write field");
		click(FeedBack.Submit_Btn, "user click submit button");
		Thread.sleep(5000);
	}

	@Given("^user click AboutUs button and observe the information of SunNxt App$")
	public void user_click_AboutUs_button_and_observe_the_information_of_SunNxt_App() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Wifi.WifiVerticalDots_Btn, "user click vertical dots button");
		click(Wifi.WifiSettings_Btn, "user click settings button");
		click(AboutUs.AboutUS_Btn, "user click About US button");
		Thread.sleep(1000);
		swipeUp1(2, "swipe up");
		Back();
	}

	@Given("^user click FAQs button and observe the FAQs information in SunNxt App$")
	public void user_click_FAQs_button_and_observe_the_FAQs_information_in_SunNxt_App() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Wifi.WifiVerticalDots_Btn, "user click vertical dots button");
		click(Wifi.WifiSettings_Btn, "user click settings button");
		click(FAQs.FAQs_Btn, "user click FAQ's button");
		Thread.sleep(2000);
		swipeUp1(6, "swipe up in FAQ's");
		Back();
	}

	@Then("^user click terms and conditions button and observe the terms and conditions in SunNxt App$")
	public void user_click_terms_and_conditions_button_and_observe_the_terms_and_conditions_in_SunNxt_App()
			throws Exception {

		click(FAQs.TermsAndConditions_Btn, "user click Terms And Conditions button");
		Thread.sleep(2000);
		swipeUp1(10, "swipe up in terms and conditions");
		Thread.sleep(2000);

		// Thread.sleep(5000);
		// click(Wifi.WifiSettingsBack_Btn, "user click settings back button");

	}

	@Given("^user click Switch profile button$")
	public void user_click_Switch_profile_button() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch proflile image");
	}

	@When("^user create one new profile$")
	public void user_create_one_new_profile() throws Exception {

		click(SwitchProfile.AddPlus_Btn, "user click add profle button");
		Thread.sleep(1000);
		inputText(SwitchProfile.AddUserName_Txt, GlobalUtil.dataMap.get("SwitchUserName"),
				"Entered user name in new profile");
		Thread.sleep(1000);
		click(SwitchProfile.AddLanguage_Btn, "user click preferred language button");
		Thread.sleep(5000);
		click(SwitchProfile.Selectlanguage_Btn, "user select one language button");
		Thread.sleep(5000);
		click(SwitchProfile.AddSave_Btn, "user click save button");
		Thread.sleep(5000);
		click(SwitchProfile.Add_Btn, "user click language button");
	}

	@Then("^user observe the swithing operation$")
	public void user_observe_the_swithing_operation() throws Exception {
		Thread.sleep(5000);
		click(SwitchProfile.SelectNewProfile_Btn, "user click new profile");
		Thread.sleep(5000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(5000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch profle image");
		Thread.sleep(5000);
		click(SwitchProfile.SelectOldProfile_Btn, "user click previous profile");

	}

	@And("^user delete the create profile$")
	public void user_delete_the_create_profile() throws Exception {
		Thread.sleep(5000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(5000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch profle image");
		Thread.sleep(5000);
		click(SwitchProfile.ProfileDelete_Btn, "user click new profile delete button");
		Thread.sleep(3000);

	}

	@When("^user play one movie content in each carousel at homepage$")
	public void user_play_one_movie_content_in_each_carousel_at_homepage() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(HomeCarousel.FirstCarouselMovie, "user click first carousel movie play");
		Thread.sleep(2000);
		Back();
		// SwipeVerticalWRElement(HomeCarousel.HomeFirstCarouse_Btn, 4);
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(2000);
		click(HomeCarousel.SecondCarouselMovie, "user click second carousel movie play");
		Thread.sleep(2000);
		Back();
		// SwipeVerticalWRElement(HomeCarousel.HomeFirstCarouse_Btn, 4);
		Thread.sleep(2000);
		click(HomeCarousel.ThirdCarouselMovie, "user click third carousel movie play");
		Thread.sleep(2000);
		Back();
		Thread.sleep(2000);
		click(HomeCarousel.FourthCarouselMovie, "user click fourth carousel movie play");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Back();
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(2000);
		click(HomeCarousel.FifthCarouselMovie, "user click fifth carousel movie play");
		Thread.sleep(2000);
		Back();
		// SwipeVerticalWRElement(HomeCarousel.HomeFirstCarouse_Btn, 4);
		Thread.sleep(2000);
		click(HomeCarousel.SixCarouselMovie, "user click sixth carousel movie play");
		Thread.sleep(2000);
		Back();
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(4000);

		click(HomeCarousel.SeventhCarouselMovie, "user click seventh carousel movie play");
		Thread.sleep(2000);
		Back();

		// SwipeVerticalWRElement(HomeCarousel.HomeFirstCarouse_Btn, 4);
		Thread.sleep(2000);
		click(HomeCarousel.EightCarouselMovie, "user click eight carousel movie play");
		Thread.sleep(2000);
		click(HomeCarousel.SeventhCarouselMovieSelect, "user click eight carousel movie select");
		Thread.sleep(2000);
		// Thread.sleep(3000);

		click(HomeCarousel.HomePlay_Btn, "user click play icon");
		Thread.sleep(3000);
		Back();

	}

	@When("^user play one movie content in each carousel at Movie page$")
	public void user_play_one_movie_content_in_each_carousel_at_Movie_page() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(2000);
		click(MovieCarousel.SelectsecondMovie_Img, "user select one movie in second carousel");
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Thread.sleep(2000);
		Back();
		// SwipeVerticalWRElement(MovieCarousel.MovieFirstCarouse_Btn, 4);
		// Thread.sleep(3000);
		// horizontalSwipeWRTOelment(MovieCarousel.MovieFirstCarouse1_Btn, 3, 800, 100);
		// Thread.sleep(3000);
		// click(MovieCarousel.SelectFirstMovie_Img, "user select one movie");

		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		// Thread.sleep(5000);
		// swipeUp(2);
		// Thread.sleep(3000);
		// horizontalSwipeWRTOelment(MovieCarousel.MovieFirstCarouse1_Btn, 3, 800, 100);
		// Thread.sleep(3000);
		// click(MovieCarousel.SelectFirstMovie_Img, "user select one movie");

		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		// Thread.sleep(5000);
		// Back();

	}

	@When("^user play one TVshow content in each carousel at TVShows page$")
	public void user_play_one_TVshow_content_in_each_carousel_at_TVShows_page() throws Exception {

		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one TVShow in first carousel");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(2000);
		click(MovieCarousel.SelectsecondMovie_Img, "user select one TVSHOW in second carousel");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Thread.sleep(2000);
		Back();

	}

	@When("^user play one musicvideo content in each carousel at music video page$")
	public void user_play_one_musicvideo_content_in_each_carousel_at_music_video_page() throws Exception {

		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one music video in first carousel");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(2000);
		click(MovieCarousel.SelectsecondMovie_Img, "user select one music video in second carousel");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Thread.sleep(2000);
		Back();

	}

	@When("^user play one musicvideo content in each carousel at comedy page$")
	public void user_play_one_musicvideo_content_in_each_carousel_at_comedy_page() throws Exception {

		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");

		Thread.sleep(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(2000);

		click(Headercontaint.Comedy_Btn, "user click comedy button");
		Thread.sleep(2000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one music video in first carousel");
		Thread.sleep(2000);
		// click(Allow.click_coachmark, "user click coachmark");
		// click(Allow.click_coachmark, "user click coachmark");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		Thread.sleep(2000);
		swipeUp1(1, "swipe up");
		Thread.sleep(2000);
		click(MovieCarousel.SelectsecondMovie_Img, "user select one music video in second carousel");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Thread.sleep(2000);
		Back();

	}

	@When("^user select one movie and add selected movie to watch list$")
	public void user_select_one_movie_and_add_selected_movie_to_watch_list() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");

		click(Addwatchlist.AddWatchList_Btn, "user add content to watch list");
		Thread.sleep(2000);
		Back();
		Thread.sleep(2000);
		Back();

	}

	@Then("^user observe added movie is displayed in watchlist$")
	public void user_observe_added_movie_is_displayed_in_watchlist() throws Exception {
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Addwatchlist.WatchList_Btn, "user click on watch list button");
		Thread.sleep(2000);
		click(Addwatchlist.WatchListdots_Btn, "user click on hamburger menu");
		Thread.sleep(2000);
		click(Addwatchlist.RemoveWatchList_Btn, "user click on remove from watchlist button");
		Thread.sleep(2000);
		click(Addwatchlist.Ok_Btn, "user click on ok button");
		Thread.sleep(3000);
		Back();

	}

	@Given("^user click subscription button and observe subscription plans$")
	public void user_click_subscription_button_and_observe_subscription_plans() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Subscriptions.Subscriptions_Btn, "user click subscriptions button and observe subscriptions plans");
	}

	@Given("^user click devices button and observe the list of devices$")
	public void user_click_devices_button_and_observe_the_list_of_devices() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Devices.Device_Btn, "user click devices button and observe devices");
		Thread.sleep(5000);
	}

	@Given("^user search one movie content in search field$")
	public void user_search_one_movie_content_in_search_field() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Searching.Searching_Icon, "user click search icon");
		Thread.sleep(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		Thread.sleep(2000);
		inputText(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchingMovie"),
				"Entered movie in searching field");
		Thread.sleep(4000);
		Back();
		Thread.sleep(2000);
		click(Searching.Searchingmovie_Btn, "user click searching movie");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Back();

	}

	@Then("^user search one TVShow content in search field$")
	public void user_search_one_TVShow_content_in_search_field() throws Exception {
		Thread.sleep(2000);
		inputText(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchingTVshow"),
				"Entered TVShow in searching field");
		Thread.sleep(4000);
		Back();
		Thread.sleep(2000);
		click(Searching.SearchingTVShow_Btn, "user click searching TVShow");
		Thread.sleep(2000);
		Back();
	}

	@Given("^user click enter coupon code button in profile page$")
	public void user_click_enter_coupon_code_button_in_profile_page() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Couponcode.Entercode_Btn, "user click enter coupon code button");
		Thread.sleep(2000);
	}

	@Then("^user subscribe using couponcode$")
	public void user_subscribe_using_couponcode() throws Exception {
		click(Couponcode.Code_Txt, "user click coupon code text field");
		Thread.sleep(3000);
		Back();
		Thread.sleep(3000);
		inputText(Couponcode.Code_Txt, GlobalUtil.dataMap.get("couponcode"), "Entered couponcode");
		Thread.sleep(1000);
		click(Couponcode.Submit_Btn, "user click submit button");
		Thread.sleep(5000);
	}

	@Given("^user select one movie by using unsubscribed cridentials$")
	public void user_select_one_movie_by_using_unsubscribed_cridentials() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		Thread.sleep(1000);
		click(Login.Profile2_Btn, "user click LOG IN button");
		Thread.sleep(1000);
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		Thread.sleep(1000);
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		Thread.sleep(1000);
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(1000);
		swipeUp(1);
		Thread.sleep(2000);
		click(Couponcode.SelectMovie_Img, "user click one movie content video");
		Thread.sleep(3000);
	}

	@Then("^user select one package and enter couponcode and subscribe$")
	public void user_select_one_package_and_enter_couponcode_and_subscribe() throws Exception {
		click(Couponcode.EntercodeInPack_Btn, "user select couponcode pack");
		Thread.sleep(2000);
		click(Couponcode.Code_Txt, "user click coupon code text field");
		Thread.sleep(2000);
		inputText(Couponcode.Code_Txt, GlobalUtil.dataMap.get("couponcode"), "Entered coupon code");
		Thread.sleep(1000);
		click(Couponcode.Submit_Btn, "user click submit button");
		Thread.sleep(5000);
	}

	@Given("^user go to profile page and select devices button$")
	public void user_go_to_profile_page_and_select_devices_button() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Devices.Device_Btn, "user click devices button and observe devices");
		Thread.sleep(5000);
	}

	@Then("^user deactivate one device into the list of devices$")
	public void user_deactivate_one_device_into_the_list_of_devices() {

	}

	@And("^user enter activate device code and click activate button$")
	public void user_enter_activate_device_code_and_click_activate_button() throws Exception {
		inputText(Devices.EnterDeviceCode_Txt, GlobalUtil.dataMap.get("devicecode"), "Entered device code");
		Thread.sleep(1000);
		click(Devices.DeviceActivate_Btn, "user click Activate button");
	}

	@Given("^user select one genre in discovery section at homepage$")
	public void user_select_one_genre_in_discovery_section_at_homepage() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		swipeUp_FindElementClick(20, Discover.Discover_Txt, "vertical swipe");
		Thread.sleep(2000);
		click(Discover.DiscoverGenre_Btn, "user select genres for discover");
		Thread.sleep(2000);
		visible(Discover.Movies_Img, "selected genres movies displayed");
		Thread.sleep(5000);
	}

	@Given("^user click viewall for All carousels and observe$")
	public void user_click_viewall_for_All_carousels_and_observe() throws Exception {
		Thread.sleep(3000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		Thread.sleep(1000);

		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(2000);

		swipeUp_FindElementClick(10, Carouselviewall.LatestEpic_Txt, "vertical swipe for required carousel");
		Thread.sleep(2000);
		horizontalSwipeWRTOelment(MovieCarousel.MovieFirstCarouse1_Btn, 5, 800, 100,
				"horizontal swipe in first carousel");
		Thread.sleep(2000);
		click(Carouselviewall.Viewall_Btn, "user click view all button");
		Thread.sleep(2000);
		visible(Discover.Movies_Img, "selected genres movies displayed");
		// visible(Discover.Movies_Img, "selected genres movies displayed");
		Thread.sleep(2000);
		Back();
		Thread.sleep(2000);

		swipeUp_FindElementClick(10, Carouselviewall.ActionSeries_Txt, "vertical swipe for required carousel");
		Thread.sleep(2000);
		horizontalSwipeWRTOelment(MovieCarousel.MovieFirstCarouse1_Btn, 5, 800, 100,
				"horizontal swipe in second carousel");
		Thread.sleep(2000);
		click(Carouselviewall.Viewall_Btn, "user click view all button");
		Thread.sleep(2000);
		visible(Discover.Movies_Img, "selected genres movies displayed");
		Thread.sleep(2000);

	}

	@Given("^user download one content in homepage$")
	public void user_download_one_content_in_homepage() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(DownloadContent.SelectInHomepage, "user play one movie in homepage");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(2000);
		click(DownloadContent.Download_Btn, "user download selected content in homepage");
		Thread.sleep(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content homepage");
		Thread.sleep(2000);
		Back();
	}

	@Then("^user download one content in movies$")
	public void user_download_one_content_in_movies() throws Exception {
		Thread.sleep(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in movies");

		click(DownloadContent.Download_Btn, "user download selected content in movies");
		Thread.sleep(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content movies");
		Thread.sleep(2000);
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		Thread.sleep(2000);
	}

	@When("^user download one content in TVShows$")
	public void user_download_one_content_in_TVShows() throws Exception {
		Thread.sleep(3000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one TVShow in TVShows");
		Thread.sleep(2000);
		click(DownloadContent.Download_Btn, "user download selected content in TVShow");
		Thread.sleep(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content TVShow");
		Thread.sleep(2000);
		Back();
		// Thread.sleep(2000);
	}

	@And("^user download one content in music videos$")
	public void user_download_one_content_in_music_videos() throws Exception {
		Thread.sleep(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one music video in Music videos");
		Thread.sleep(2000);
		click(DownloadContent.Download_Btn, "user download selected content in music video");
		Thread.sleep(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content music video");
		Thread.sleep(2000);
		Back();
		// Thread.sleep(2000);
	}

	@Then("^user download one content in comedy$")
	public void user_download_one_content_in_comedy() throws Exception {
		Thread.sleep(2000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		Thread.sleep(2000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one comedy video in comedys");
		Thread.sleep(2000);
		click(DownloadContent.Download_Btn, "user download selected content in comedy");
		Thread.sleep(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content comedy");
		Thread.sleep(2000);
		Back();
		Thread.sleep(2000);
	}

	@Given("^user login once again after logout$")
	public void user_login_once_again_after_logout() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"),
				"Entered unsubscribed user mobile number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"),
				"Entered unsubscribed user password");
		click(Login.Login_Btn, "user click login button");

		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Logout.Logout_Btn, "user click logout button");
		click(Logout.Logout2_Btn, "user click logout OK button");
		Thread.sleep(5000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"),
				"Entered unsubscribed user mobile number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"),
				"Entered unsubscribed user password");
		click(Login.Login_Btn, "user click login button");
	}

	@Given("^user share one content via facebook$")
	public void user_share_one_content_via_facebook() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		Thread.sleep(1000);
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in movies");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(2000);

		click(Share.Share_Btn, "user click share button");
		Thread.sleep(2000);
		click(Share.ShareGmail_Btn, "user click Gmail to share content");
		Thread.sleep(2000);
		inputText(Share.SenderGmail_Btn, GlobalUtil.dataMap.get("shareGmailId"), "Entered shareing GmailID");
		Thread.sleep(2000);
		click(Share.SendGmail_Btn, "user click send ");
		Thread.sleep(5000);

	}

	@Given("^user play one movie content and select one more movie in recommended section$")
	public void user_play_one_movie_content_and_select_one_more_movie_in_recommended_section() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		Thread.sleep(1000);
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in movies");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(2000);
		click(SigUp.SelectMovie2Play_Btn, "user play selected movie");
		Thread.sleep(2000);
		click(Recommended.RecommendedMovie_Img, "user select one recommended section movie");
		Thread.sleep(2000);
		click(SigUp.SelectMovie2Play_Btn, "user play selected movie in recommended section");

	}

	@Given("^user perform refresh operation in all pages$")
	public void user_perform_refresh_operation_in_all_pages() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		Thread.sleep(1000);
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(2000);
		swipeDown(1, "homepage is refresh");
		Thread.sleep(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(3000);
		swipeDown(1, "moviespage is refresh");
		Thread.sleep(3000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		Thread.sleep(3000);
		swipeDown(1, "TVShows page is refresh");
		Thread.sleep(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		Thread.sleep(3000);
		swipeDown(1, "music videos page is refresh");
		Thread.sleep(3000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		Thread.sleep(3000);
		swipeDown(1, "comedy page is refresh");
		Thread.sleep(3000);
	}

	@Given("^user observe Filters data should be in alphabetical order$")
	public void user_observe_Filters_data_should_be_in_alphabetical_order() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music video button");
		Thread.sleep(1000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		Thread.sleep(3000);
		click(Genres.GenViewAllMovies_Btn, "user click view All movies button in comedy");
		click(Genres.GenGenres_Btn, "user click movies button in comedy");
		click(Genres.GenSelectCategory_Btn, "user select one category in movies");

		visible(Filters.FiltersAlpha_Section, "filter showing alphabetical order");
		Thread.sleep(5000);

	}

	@Given("^user change playing content to landscape in TVShows$")
	public void user_change_playing_content_to_landscape_in_TVShows() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(3000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		Thread.sleep(3000);
		swipeUp1(2, "swipe up");
		Thread.sleep(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one TVShow in first carousel");
		Thread.sleep(8000);
		// click(Allow.click_coachmark, "user click coachmark");
		// click(Allow.click_coachmark, "user click coachmark");
		// click(Allow.click_coachmark, "user click coachmark");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		// Thread.sleep(1000);
		// landscapemode("screen rotate to land scape");
		// Thread.sleep(9000);
		// Back();
	}

	@Then("^user change playing content to landscape in music videos$")
	public void user_change_playing_content_to_landscape_in_music_videos() throws Exception {
		// Thread.sleep(3000);
		// click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		// Thread.sleep(3000);
		// swipeUp1(2, "swipe up");
		// Thread.sleep(3000);
		// click(MovieCarousel.SelectFirstMovie_Img, "user select one music video in
		// first carousel");
		// Thread.sleep(2000);
		// click(Allow.click_coachmark, "user click coachmark");
		// click(Allow.click_coachmark, "user click coachmark");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		// Back();
	}

	@When("^user change playing content to landscape in comedy clips$")
	public void user_change_playing_content_to_landscape_in_comedy_clips() {

	}

	@And("^user change playing content to landscape in live tv$")
	public void user_change_playing_content_to_landscape_in_live_tv() {

	}

	@Given("^user login portal and play one movie content and go back to homepage$")
	public void user_login_portal_and_play_one_movie_content_and_go_back_to_homepage() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		click(Login.Login_Btn, "user click login button");
		Thread.sleep(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		Thread.sleep(1000);
		click(ContinueWatching.Select_Mve, "user play one movie button");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Genres.GenMoviePlay_Btn, "user click play button");
		Thread.sleep(5000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(4000);
		Back();
		Thread.sleep(1000);
		Back();

	}

	@Then("^user observe previous played content added to continue watching section or not and play content in continue watching section$")
	public void user_observe_previous_played_content_added_to_continue_watching_section_or_not_and_play_content_in_continue_watching_section()
			throws Exception {
		Thread.sleep(1000);
		click(Headercontaint.Homepage_Btn, "user click homepage button");
		Thread.sleep(2000);
		swipeDown(1, "user refreshing homepage");
		Thread.sleep(1000);
		click(ContinueWatching.ContinuewatchingSelect_Mve,
				"user select previous watched content movie in continue watching section");
		Thread.sleep(1000);
		click(Genres.GenMoviePlay_Btn, "user click play button");
		Thread.sleep(5000);
	}

	@Given("^user login to portal and activate international roaming$")
	public void user_login_to_portal_and_activate_international_roaming() throws Exception {
		Thread.sleep(5000);
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		if (GlobalUtil.getMDriver().findElement(By.xpath("//*[@class='android.widget.Button'][2]")).isDisplayed()) {
			click(Allow.Allow_Btn, "user click allow button");
		}
		click(Allow.selectFirstLanguege, "User select's the language");
		click(Allow.next, "User tap on next button");
		click(Allow.Accept_Btn, "user click Accept button");
		Thread.sleep(3000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		inputText(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered guest user mobile number");
		inputText(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered guest user password");
		click(Login.Login_Btn, "user click login button");

		click(Logout.After_Lgin_profile_Btn, "user click profile image");
		Thread.sleep(2000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Allow.click_coachmark, "user click coachmark");
		Thread.sleep(1000);
		click(Roamingactivate.InternationalRoaming_Btn, "user click international roaming button");
		Thread.sleep(1000);
		// click(Roamingactivate.Activate_Btn, "user click activate button");
		Thread.sleep(5000);
	}

	@Then("^content playback in the non home region$")
	public void content_playback_in_the_non_home_region() {

	}
}
