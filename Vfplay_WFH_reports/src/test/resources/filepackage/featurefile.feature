Feature:Sign Up
@Createaccount
Scenario:Create an account
Given Launch Appium server
Then Create an account 
And Click on logout
@login
Scenario: Shoestore App,
Given Launch Appium server
Then Do login with username and password
When Click on men,Shoe items will be displayed and select the item
Then Product Screen will be displayed, then select the quantity and add to cart
And Click on cart,Cart screen will be displayed
Then Click on delivery,and fill the details to place the order
|order_firstname|order_lastname|order_mailid    |order_phonenumber|order_note|
|ram            |rahul				 |aaalll@gmail.com|89456123077			|hello hai |
And Click on logout
