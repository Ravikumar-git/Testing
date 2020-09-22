package shoestorepackage;

import org.openqa.selenium.By;

public class Locators {
	//Cart_Screen
		public static By cs_cart_text=By.xpath("//*[@text='Cart']");
		public static By cs_product_image=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/productImageView']");
		public static By cs_product_Name= By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/nameTextView']");
		public static By cs_product_count=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/quantityTextView']"); ;
		public static By cs_product_cost= By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/priceTextView']");
		public static By cs_product_delete=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/deleteButton']") ;
		public static By cs_cart_total=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/totalPriceTextView']") ;
		public static By cs_product_order=By.xpath("//*[@text='ORDER']") ;
		
		//Createaccount_Screen
		public static By Acc_create_acc=By.xpath("//*[@text='CREATE ACCOUNT']") ;
		public static By Acc_full_name=By.xpath("//*[@text='Full Name']") ;
		public static By Acc_gender=By.xpath("//*[@text='Male']") ;
		public static By Acc_dob=By.xpath("//*[@text='Date of Birth']") ;
		public static By Acc_year=By.xpath("//*[@text='2001']") ;
		public static By Acc_date=By.xpath("//*[@text='5']") ;
		public static By Acc_prv=By.xpath("//*[@content-desc='Previous month']") ;
		public static By Acc_next=By.xpath("//*[@content-desc='Next month']") ;
		public static By Acc_cal_ok=By.xpath("//*[@text='OK']") ;
		public static By Acc_country_code=By.xpath("//*[@text='+91']") ;
		public static By Acc_country_search=By.xpath("//*[@text='Search…']") ;
		public static By Acc_phone_number=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/phoneTextEditText']") ;
		public static By Acc_emailid=By.xpath("//*[@text='Email Address']") ;
		public static By Acc_password=By.xpath("//*[@text='Password']") ;
		public static By Acc_checkbox=By.xpath("//android.widget.CheckBox");	
		public static By Acc_account=By.xpath("//*[@text='CREATE ACCOUNT']");	
		
		//Delivery_screen
		public static By Ds_deliverText=By.xpath("//*[@text='Delivery']");
		public static By Ds_fill_Firstname=By.xpath("//*[@text='First Name']");	
		public static By Ds_fill_lastname=By.xpath("//*[@text='Last Name']");	
		public static By Ds_fill_EmailAddress=By.xpath("//*[@text='Email Address']");	
		public static By Ds_fill_PhoneNum=By.xpath("//*[@text='Phone Number']");	
		public static By Ds_fill_Note=By.xpath("//*[@text='Note']");	
		public static By Ds_click_SubmitOrder=By.xpath("//*[@text='SUBMIT ORDER']");	
		public static By Ds_order_successmsg=By.xpath("//*[@text='OK']");
		
		//ForgotPwd_Screen	
		public static By Fs_errmsg=By.xpath("//*[@text='The password is invalid or the user does not have a password']");	
		public static By Fs_fpwd=By.xpath("//*[@text='Forgot Password?']");	
		public static By Fs_email=By.xpath("//*[@text='Email Address']");	
		public static By Fs_resetpwd=By.xpath("//*[@text='RESET PASSWORD']");
		
		//LoginScreen
		public static By Ls_Emailid=By.xpath("//*[@text='Email Address']");	
		public static By Ls_pwd=By.xpath("//*[@text='Password']");	
		public static By Ls_signin=By.xpath("//*[@text='SIGN IN']");	
		
		
		//Men_Screen
		public static By Ms_shoestore=By.xpath("//*[@text='Shoe Store']");
		public static By Ms_selectmen=By.xpath("//*[@text='MEN']");	
		//public static By Ms_item1=By.xpath("//*[@index='0']||[@instance='2']");
		public static By Ms_item= By.id("com.gsrikar.ecommerce:id/productImageView");
		
		//Menu_Screen
		public static By menu=By.xpath("//*[@content-desc='Open navigation drawer']");	
		public static By Prof_MyAccount1=By.xpath("//*[@text='My Account']");//MyAccount
		public static By Prof_Mycart1=By.xpath("//*[@text='My Cart']");//My cart
		public static By menu_MyOrders=By.xpath("//*[@text='My Orders']");//My Orders
		public static By Menu_Signout =By.xpath("//*[@text='Sign Out']");//Signout_Screen
		
		//My Account
		public static By Myaccount_update=By.xpath("//*[@text='UPDATE']");
		
		// Myprofile_Screen
		
		public static By Prof_Menu=By.xpath("//*[@content-desc='Open navigation drawer']");	
		public static By Prof_MyAccount=By.xpath("//*[@text='My Account']");	
		public static By Prof_full_name=By.xpath("//*[@text='Full Name']");	
		public static By Prof_gender=By.xpath("//*[@text='Male']");	
		public static By Prof_gender1=By.xpath("//*[@text='Female']");	
		public static By Prof_dob=By.xpath("//*[@text='Date of Birth']");	
		public static By Prof_year=By.xpath("//*[@text='2001']");	
		public static By Prof_date=By.xpath("//*[@text='15']");	
		public static By Prof_prv=By.xpath("//*[@content-desc='Previous month']");
		public static By Prof_next=By.xpath("//*[@content-desc='Next month']");	
		public static By Prof_cal_ok=By.xpath("//*[@text='OK']");	
		public static By Prof_country_code=By.xpath("//*[@text='+91']");
		public static By Prof_country_search=By.xpath("//*[@text='Search…']");
		public static By Prof_cntry_text=By.xpath("//*[@text='India (IN)']");
		public static By Prof_phone_number=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/phoneTextEditText']");
		public static By Prof_update=By.xpath("//*[@text='UPDATE']");
		//Product_Screen
		public static By Prod_text=By.xpath("//*[@text='Product']");
		public static By Prod_zoom=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/productLargeImageView']");
		public static By Prod_quantity=By.xpath("//*[@text='1']");
		public static By Prod_img=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/productImageView']");
		public static By Prod_minus=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/decrementButton']");
		public static By Prod_plus=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/incrementButton']");
		public static By Prod_add_cart=By.xpath("//*[@resource-id='com.gsrikar.ecommerce:id/cartButton']");
		public static By Prod_cart_list=By.xpath("//*[@content-desc='Cart']");
		
		
		
		//Women_Screen
		public static By WS_selectwomen=By.xpath("//*[@text='WOMEN']");
		public static By WS_item =By.xpath("//android.widget.ImageView[@resource-id='com.gsrikar.ecommerce:id/productImageView']");
		
		
		

}
