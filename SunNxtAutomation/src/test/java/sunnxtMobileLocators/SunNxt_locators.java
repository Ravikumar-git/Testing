package sunnxtMobileLocators;

import org.openqa.selenium.By;

public class SunNxt_locators {
	public static class Allow {
		public static By click_coachmark = By.xpath("//*[@text='Thanks! Got It']");
		public static By Allow_Btn = By.id("com.android.permissioncontroller:id/permission_allow_button");
		public static By LanguageSelect_Btn = By.xpath("//*[@class='android.widget.RelativeLayout'][2]");
		public static By Next_Btn = By.xpath("//*[@class='android.widget.Button']");
		public static By Accept_Btn = By.xpath("//*[@class='android.widget.Button'][2]");
		public static By profile_Btn = By.xpath("//*[@class='android.widget.ImageView'][3]");

		public static By selectFirstLanguege = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/bg1'])[2]");
		public static By next = By.id("com.suntv.sunnxt:id/but");

		public static By ScreenPor_Img = By
				.xpath("//android.widget.FrameLayout[@resource-id='com.suntv.sunnxt:id/adContainer']");

	}

	public static class ForgotPasswordEmail {
		public static By ForgotPwdEmailId_Txt = By.xpath("(//*[@class='android.widget.EditText'])[1]");
		public static By ForgotPwd_Btn = By.id("com.suntv.sunnxt:id/forgotPwd");
		// public static By
		// ForgotPwdEmail_Txt=By.id("com.suntv.sunnxt:id/emailEditTextEmailForgotPwd");
		public static By ForgotPwdSubmit_Btn = By.id("com.suntv.sunnxt:id/buttonSubmitEmailForgotPwd");
		public static By ForgotPwdSendOTP_Btn = By.id("com.suntv.sunnxt:id/buttonSubmitResetPassword");
		public static By ForgotPhoneOTP_Btn = By
				.xpath("//android.widget.EditText[@resource-id='com.suntv.sunnxt:id/phoneOtpPassword']");
	}

	public static class ChangeContentLanguage {
		public static By ChangeContentLanguage_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[2]");
		public static By ChangeLanguageTamil_Btn = By.xpath("//android.widget.CheckedTextView[@text='TAMIL']");
		public static By ChangeLanguageMalayalam_Btn = By.xpath("//android.widget.CheckedTextView[@text='MALAYALAM']");
		public static By ChangeLanguageSave_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[9]");
	}

	public static class ProfilePicChange {
		public static By ProfilePic_Img = By.id("com.suntv.sunnxt:id/imageViewEditProfile");
		public static By ChooseFromLibrary_Btn = By.xpath("//android.widget.TextView[@text='Choose from Library']");
		public static By ChooseOnePic_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.android.documentsui:id/icon_thumb'])[4]");
		public static By RemoveOhoto_Btn = By.xpath("//android.widget.TextView[@text='Remove Photo']");
	}

	public static class ChangeAppLanguage {
		public static By ChangeAppLanguage_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[3]");
		public static By ChangeAppTelugu_Btn = By.xpath("//*[@text='తెలుగు']");
		public static By ChangeAppEnglish_Btn = By.id("com.suntv.sunnxt:id/english");
		public static By ChangeAppHeaderTxt_Btn = By.xpath("(//*[@class='android.widget.TextView'])[5]");
		public static By ChangeAppSave_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[9]");
	}

	public static class EditProfile {
		public static By EditAge_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/ageSpinner']");
		public static By EditSelectAge_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[3]");
		public static By EditGender_Btn = By.id("com.suntv.sunnxt:id/femaleIcon");
		public static By EditCountry_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/countrySpinner']");
		public static By EditSelectCountry_Btn = By.xpath("//android.widget.CheckedTextView[@text='Australia']");
		public static By EditState_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/stateSpinner']");
		public static By EditSelectState_Btn = By.xpath("//android.widget.CheckedTextView[@text='Camberwell']");
		public static By Done_Btn = By.xpath("//android.widget.Button[@text='DONE']");
		public static By EditName_Txt = By
				.xpath("//android.widget.EditText[@resource-id='com.suntv.sunnxt:id/firstName']");
		public static By EditCompleteProfile_Btn = By
				.xpath("//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/completeEditProfile']");
		public static By Edit_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[1]");
		public static By Save_Btn = By.xpath("(//*[@class='android.widget.TextView'])[18]");
	}

	public static class Subscriptions {
		public static By SubscriptionBack_Btn = By.xpath("//android.view.View[@text='subscription?close=Yes']");
		public static By InvoiceBack_Btn = By.xpath("(//*[@class='android.view.View'])[4]");
		public static By CustomerState_Txt = By.xpath("(//*[@class='android.view.View'])[44]");
		public static By Invoice_Btn = By.xpath("//android.widget.TextView[@text='Invoice']");
		public static By ReNewPlan_Btn = By.xpath("(//*[@class='android.view.View'])[17]");
		public static By ReNewPlanBack_Btn = By.xpath("(//*[@class='android.view.View'])[5]");
		public static By Subscriptions_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[7]");
	}

	public static class Device {
		public static By Device_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[10]");
	}

	public static class Login {
		public static By Profile_Btn = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
		public static By Profile2_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[9]");
		public static By EmailId_Txt = By.xpath("(//*[@class='android.widget.EditText'])[1]");
		public static By Password_Txt = By.xpath("(//*[@class='android.widget.EditText'])[2]");
		public static By Login_Btn = By.xpath("(//*[@class='android.widget.Button'])[1]");
		public static By SelectMovie_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By SelectMoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By ExistingUser_Btn = By.id("com.suntv.sunnxt:id/signIn_Button");
		public static By SignUp_Btn = By.id("com.suntv.sunnxt:id/signUpText");
		public static By ChangeMovies_Btn = By.xpath("(//*[@class='android.widget.TextView'])[4]");

		// By alrt_resume =
		// By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
	}

	public static class NonSubscribedUser {
		public static By NonSubMovie_Btn = By.xpath("//android.widget.TextView[@text='MOVIES']");
		public static By NonSubMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_free_band'])[3]");
		public static By NonSubMovie2Play_Icon = By.id("com.suntv.sunnxt:id/playButton");
		public static By NonSubMovie2_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[3]");
		public static By NonSubSkip_Btn = By.id("com.suntv.sunnxt:id/skip_signin");
	}

	public static class SigUp {
		public static By SelectMovie2_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By SelectMovie2Play_Btn = By
				.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/playButton']");
		public static By SubscribeNow_Btn = By.id("com.suntv.sunnxt:id/signUp_Button");
		public static By SigUpMobile_Txt = By.id("com.suntv.sunnxt:id/userIDEditTextLoginPage");
		public static By SigUpPassword_Txt = By.id("com.suntv.sunnxt:id/passwordField");
		public static By SigUpName_Txt = By.id("com.suntv.sunnxt:id/fullName");
		public static By SigUpAge_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/ageSpinner']");
		public static By SigUpAgeRange_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[4]");
		public static By SigUpGender_Btn = By.id("com.suntv.sunnxt:id/femaleIcon");
		public static By SignUpCountry_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/countrySpinner']");
		public static By SignUpSelectCountry_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[2]");
		public static By SignUpState_Btn = By.id("com.suntv.sunnxt:id/stateSpinner");
		public static By SignUpSelectState_Btn = By.xpath("//android.widget.CheckedTextView[@text='Andhra Pradesh']");
		public static By SignUpSubmit_Btn = By.xpath("//android.widget.Button[@text='SUBMIT']");
		public static By MobileNumberExist_Btn = By.xpath("//android.widget.Button[@text='OK']");
	}

	public static class Logout {
		public static By After_Lgin_profile_Btn = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
		public static By Logout_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[16]");
		public static By Logout2_Btn = By.xpath("(//*[@class='android.widget.Button'])[2]");
	}

	public static class Genres {
		public static By GenViewAllMovies_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[12]");
		public static By GenGenres_Btn = By
				.xpath("//android.widget.LinearLayout[@resource-id='com.suntv.sunnxt:id/filter1RelativeLayout']");
		public static By GenSelectCategory_Btn = By
				.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[1]");
		public static By GenOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By GenMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
		public static By GenMoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static String GenSwipeHorizontal_Btn = "(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]";
		public static By GenswipeHorizontal_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
	}

	public static class Actors {
		public static By ActActors_Btn = By.id("com.suntv.sunnxt:id/second_filter_layout");
		public static By ActSelectCategort_Btn = By
				.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[4]");
		public static By ActOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By ActMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
		public static By ActMoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");

	}

	public static class TVShowsGenres {
		public static By GenViewAllMovies_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[12]");
		public static By GenGenres_Btn = By.id("com.suntv.sunnxt:id/filter1RelativeLayout");
		public static By GenSelectCategory_Btn = By
				.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[6]");
		public static By GenOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By GenMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");

	}

	public static class TVShowsTVChannels {
		public static By TVChannels_Btn = By.id("com.suntv.sunnxt:id/actor_filter");
		public static By TVChannelsSelectCategory_Btn = By
				.xpath("(//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[7]");
		public static By TVChannelsOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By TVChannelsMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
	}

	public static class Headercontaint {
		public static By Homepage_Btn = By.xpath("(//*[@class='android.widget.TextView'])[4]");
		public static By Movies_Btn = By.xpath("(//*[@class='android.widget.TextView'])[5]");
		public static By Movies_Swipe_Btn = By.xpath("(//android.widget.TextView[@text='MOVIE TRAILERS'])[1]");
		public static By TVShow_Btn = By.xpath("(//*[@class='android.widget.TextView'])[6]");
		public static By TVShow_Swipe_Btn = By
				.xpath("(//*[@resource-id='com.suntv.sunnxt:id/textview_genre_title'])[3]");
		// public static By
		// TVShow_Swipe_Btn=By.xpath("(//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/textview_genre_title'])[3]");
		public static By MusicVideos_Btn = By.xpath("(//*[@class='android.widget.TextView'])[7]");
		public static By MusicVideos_Swipe_Btn = By.xpath("(//*[@class='android.widget.TextView'])[20]");
		public static By Comedy_Btn = By.xpath("(//android.widget.TextView[@text='COMEDY'])[1]");
		// public static By
		// Comedy_Swipe_Btn=By.xpath("(//android.widget.TextView[@text='COMEDY'])[1]");
	}

	public static class Wifi {
		public static By WifiVerticalDots_Btn = By.id("com.suntv.sunnxt:id/action_settings");
		public static By WifiSettings_Btn = By.id("com.suntv.sunnxt:id/settings");
		public static By WifiDownloadOnWIFI_Btn = By.id("com.suntv.sunnxt:id/onlyOnWifi");
		public static By WifiSettingsBack_Btn = By.xpath("//*[@class='android.widget.ImageButton']");

	}

	public static class VideoQuality {
		public static By VideoQuality_btn = By.xpath("(//*[@class='android.widget.LinearLayout'])[3]");
		public static By VideoAuto_Btn = By.id("com.suntv.sunnxt:id/enableSwitch");
		public static By VideoMedium_Btn = By.id("com.suntv.sunnxt:id/audio_high");
		public static By VideoSave_Btn = By.id("com.suntv.sunnxt:id/save_button");
	}

	public static class FeedBack {
		public static By FeedBack_Btn = By.xpath("//android.widget.TextView[@text='Feedback']");
		public static By FeedBackWrite_Txt = By.id("com.suntv.sunnxt:id/multiAutoCompleteTextView");
		public static By Submit_Btn = By.id("com.suntv.sunnxt:id/submit_button");
		public static By Back_Btn = By.xpath("(//*[@class='android.widget.ImageButton'])[2]");
	}

	public static class AboutUs {
		public static By AboutUS_Btn = By.xpath("//android.widget.TextView[@text='About Us']");
	}

	public static class FAQs {
		public static By FAQs_Btn = By.xpath("//android.widget.TextView[@text='FAQs']");
		public static By TermsAndConditions_Btn = By.xpath("//android.widget.TextView[@text='Terms and Conditions']");
	}

	public static class SwitchProfile {
		public static By ProfileDelete_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/deleteIcon'])[1]");
		public static By SwithProfile_Brn = By.id("com.suntv.sunnxt:id/redIconRL");
		public static By AddProfile_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/circularImageId'])[3]");
		public static By AddUserName_Txt = By.id("com.suntv.sunnxt:id/editProfilename");
		public static By AddLanguage_Btn = By.id("com.suntv.sunnxt:id/RLLanguage");
		public static By Selectlanguage_Btn = By.xpath("//android.widget.CheckedTextView[@text='TELUGU']");
		public static By AddSave_Btn = By.id("com.suntv.sunnxt:id/save_button");
		public static By Add_Btn = By.xpath("//android.widget.Button[@text='ADD']");
		public static By AddPlus_Btn = By.xpath("(//*[@class='android.widget.ImageView'])[4]");
		public static By SelectNewProfile_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/circularImageId'])[2]");
		public static By SelectOldProfile_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/circularImageId'])[1]");
	}

	public static class HomeCarousel {
		// public static String
		// HomeFirstCarouse1_Btn=("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
		public static By HomeFirstCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
		public static By FirstCarouselMovie = By.xpath(
				"(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail_voditem'])[1]");
		public static By SecondCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By ThirdCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By FourthCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[8]");
		public static By FifthCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By SixCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[14]");
		public static By SeventhCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By SeventhCarouselMovieSelect = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
		public static By EightCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[12]");

		public static String HomeSecondCarouse1_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");

		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By HomeSecondCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[3]");
		public static By HomePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
	}

	public static class MovieCarousel {
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By MoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By SelectsecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");

		public static By MovieFirstCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");
		public static String MovieFirstCarouse1_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
	}

	public static class TvShowsCarousel {
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");

	}

	public static class MusicVideosCarousel {
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
	}

	public static class ComedyCarousel {
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[9]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[6]");
		public static String ComedySecondCarousel_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[3]");
	}

	public static class CCDCPAYTM {
		public static By Scbscribe90_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]");
		public static By CreditCard_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/RLBottom'])[1]");
		public static By DebitCard_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/RLBottom'])[2]");
		public static By Paytm_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/RLBottom'])[3]");
		public static By ProceedPay_Btn = By
				.xpath("//android.widget.Button[@resource-id='com.suntv.sunnxt:id/proceedToPay']");

	}

	public static class Addwatchlist {
		public static By AddWatchList_Btn = By.id("com.suntv.sunnxt:id/fav_icon");
		public static By Ok_Btn = By.id("com.suntv.sunnxt:id/ok_button");
		public static By RemoveWatchList_Btn = By.id("com.suntv.sunnxt:id/favouriteText");
		public static By WatchListdots_Btn = By.id("com.suntv.sunnxt:id/three_dots_overflow");
		public static By AddedContentText = By
				.xpath("//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/textview_title']");
		public static By WatchList_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[5]");
	}

	public static class Devices {
		public static By DeviceActivate_Btn = By
				.xpath("//android.widget.Button[@resource-id='com.suntv.sunnxt:id/submit_button']");
		public static By EnterDeviceCode_Txt = By
				.xpath("//android.widget.EditText[@resource-id='com.suntv.sunnxt:id/activationCodeEditText']");
		public static By Device_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[10]");
	}

	public static class Searching {
		public static By Searching_Icon = By.id("com.suntv.sunnxt:id/action_search");
		public static By SearchingField_Txt = By.id("com.suntv.sunnxt:id/searchTextBox");
		public static By Searchingmovie_Btn = By.xpath("//android.widget.TextView[@text='GURU']");
		public static By SearchingTVShow_Btn = By.xpath("(//android.widget.TextView[@text='BANDHAM'])[1]");
	}

	public static class Couponcode {
		public static By CodeInPack_Txt = By.xpath("(//*[@class='android.view.View'])[8]");
		public static By EntercodeInPack_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[4]");
		public static By SelectMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By Submit_Btn = By.xpath("//android.widget.Button[@resource-id='couponCodeSubmit']");

		public static By Code2_Txt = By.id("couponcode");

		public static By Code_Txt = By.xpath("//android.widget.EditText[@resource-id='couponcode']");
		public static By Entercode_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[9]");
	}

	public static class Discover {
		public static By Discover_Txt = By.xpath("//android.widget.TextView[@text='DISCOVER']");
		public static By DiscoverGenre_Btn = By.xpath("//android.widget.TextView[@text='COMEDY']");
		public static By Movies_Img = By
				.xpath("//android.widget.GridView[@resource-id='com.suntv.sunnxt:id/gridview_movies']");
	}

	public static class Carouselviewall {
		public static By LatestEpic_Txt = By.xpath("//android.widget.TextView[@text='LATEST MOVIES IN HD']");
		public static By ActionSeries_Txt = By.xpath("//android.widget.TextView[@text='TOP TELUGU MOVIES']");
		public static By Viewall_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[4]");

	}

	public static class DownloadContent {
		public static By CancelInhomeConent = By.xpath("(//android.widget.TextView[@text='Cancel Download'])[1]");
		public static By CancelInmovieConent = By.xpath("(//android.widget.TextView[@text='Cancel Download'])[2]");
		public static By CancelInTVshowsConent = By.xpath("(//android.widget.TextView[@text='Cancel Download'])[3]");
		public static By CancelInmusicvideosConent = By
				.xpath("(//android.widget.TextView[@text='Cancel Download'])[4]");
		public static By CancelIncomedyConent = By.xpath("");
		public static By CancelOK_Btn = By.xpath("//android.widget.Button[@text='OK']");
		public static By DownloadInProfile_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[4]");
		public static By SelectInHomepage = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[7]");
		public static By Download_Btn = By
				.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/download']");
		public static By DownloadBest_Btn = By
				.xpath("//android.widget.Button[@resource-id='com.suntv.sunnxt:id/best_button']");
	}

	public static class Share {
		public static By ShareGmail_Btn = By.xpath("//android.widget.TextView[@text='Gmail']");
		public static By SenderGmail_Btn = By
				.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']");
		public static By SendGmail_Btn = By
				.xpath("//android.widget.TextView[@resource-id='com.google.android.gm:id/send']");
		// public static By ShareGmail_Btn=By.xpath("");
		// public static By ShareGmail_Btn=By.xpath("");
		public static By Share_Btn = By.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/share']");

	}

	public static class Recommended {
		public static By RecommendedMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");

	}

	public static class Filters {
		public static By FiltersAlpha_Section = By
				.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view']");
	}

	public static class ContinueWatching {
		public static By Select_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[6]");
		public static By ContinuewatchingSelect_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		// public static By ContinuewatchingSelect_Mve=By.xpath("");
	}

	public static class Roamingactivate {
		public static By InternationalRoaming_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[8]");
		public static By Activate_Btn = By.xpath("//android.widget.Button[@text='ACTIVATE']");
	}

}
