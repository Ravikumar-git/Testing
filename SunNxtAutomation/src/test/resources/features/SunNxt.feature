Feature: SunNxt Mobile Automation


@MobileTest @freecontentPlayForguestUser
Scenario Outline: TC-25-verify Free content should be played for non subscribed users operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click free content video
Then user observe video playing or not

Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @subscriptionPopUpShownForNonSubScribeUser 
Scenario Outline: TC-24-verify Subscription Popup should be shown when clicked any premium content for Non Subscribed users operatrion
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click any movie item
Then user observe subscription popup displayed or not
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @playcontentByLogin
Scenario Outline: TC-16-check Click on any content click play user is taken to Sign In Screen enter valid existing Credentials and login operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Then play any movie content
When click existing user button
And enter valid credentials 
And observe user login or not 
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|





                         
@MobileTest @playcontentBySignUp
Scenario Outline: TC-20-Check Click on any content and click play then user is taken to Sign In Screen click Sign Up Fill all the required details and Click Submit operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user click subscribe now button
Then fill all required details in signup
And click Submit button
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 
                        
@MobileTest @SigUpByLogin
Scenario Outline: TC-21-check Move to profile page and click on Login Option and User is taken to Sign in page and Click Sign Up and Fill all the Required details and click Submit operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user click login page button
Then user click SignUp button
And enter all required details in Signup page 
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 






@MobileTest @forgotPasswordEmailID
Scenario Outline: TC-12-Check forget password for valid Email Signed In users operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user Enter valid Email ID in text field
Then user observe link receive to Email ID 
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|







@MobileTest @forgotPasswordMobileNumber
Scenario Outline: TC_13_Check forget password for valid mobile Number users operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user Enter valid mobile number in text field
Then user observe OTP receive to the register mobiile number
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
	





@MobileTest @unsubscribed
Scenario Outline: TC-027-Check content playback for unsubscribed user
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App	
When user click login button
Then user login to sunnxt portal by using guest credentials and play free content
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 




@MobileTest @logout
Scenario Outline: Validate SunNxt LogOut operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user login sunnxt portal and user perform logout opertion
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 




@MobileTest @emailLogin
Scenario Outline: TC-10-verify the Email Sign In operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user login sunnxt portal by using EMAIL
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|              
 
 
 
 


@MobileTest @headercontaintplay
Scenario Outline: TC_08_Validate SunNxt header all containt inside swipe down operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user observe swipe bottom in side of movies
Then user observe swipe bottom in side of TVShows
When user observe swipe bottom in side of music videos
And user observe swipe bottom in side of comdies
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  




@MobileTest @editprofile
Scenario Outline: TC_47_user verify Edit Profile operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click edit profile button
Then user select age range
When user select country and state
And user observe edit profile change or not
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 



@MobileTest @profilePicChange
Scenario Outline: TC-48-user verify Profile page and Update the Profile picture and save the changes operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click on profile photo
Then user select one image of the library
When user observe the profile photo is update or not
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 
@MobileTest @subscriptions
Scenario Outline: user verift subscrptions operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click subscrption button
Then user observe the customer state
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 

@MobileTest @paymentsubscriptions
Scenario Outline: check CC, DC and Paytm as Payment Modes for indian build and Paypal for International build
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user login by unsubscription credentials and click subscription button
Then user select payment mode through credit card
And user select payment mode through debit card
Then user select payment mode through paytm
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @SwitchPlan
Scenario Outline: TC-28-verify Do Switch plan in Subscription page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user observe the subscription plan switching
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|





@MobileTest @filterForMoviesInComedy
Scenario Outline: Verify In Comedy  page - Select View all Comedy scenes Apply filter for Movies and observe the results. play any content from the results. operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click comedy button and select view all button
When user click movie button and select on one category
Then user play one video on that select category in movies
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @filterForcomediansInComedy
Scenario Outline: Verify In Comedy  page - Select View all Comedy scenes and Apply filter for Comedians and observe the results and play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click comedy button and select viewall button
When user click comedians button and select on one category
Then user play one video on that select category in comedians
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|



@MobileTest @filterForGenresInMovies
Scenario Outline: TC-36-Verify Movies page and Select View all Movies and Apply filter for genre and observe the results play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click movie and select view all button
When user click geners button and select on one category
Then user play one video on that select category in geners
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @filterForActorsInMovies
Scenario Outline: TC-37-Verify Movies page and Select View all Movies and Apply filter for actors and observe the results play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click actors button and select on one category
Then user play one video on that select category in actors
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|




@MobileTest @filterForGenresInTVShow
Scenario Outline: TC-38-Verify TV shows page and Select View all for Tv shows and Apply filter for Genre and observe the results and play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click TVShow and select view all button
When user click geners button in TVShow and select on one category
Then user play one video on TVShows and select category in geners
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 

@MobileTest @filterForTVChannelsInTVShow
Scenario Outline: TC-39-Verify TV shows page and Select View all TV shows and Apply filter for TV channels and observe the results and play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click TVChannel button in TVShow and select on one category
Then user play one video on TVShow and select category in TVChannels
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|




@MobileTest @changeContentLanguage
Scenario Outline: TC-40-Verify Change content language and see whether the content for that particular language is displayed or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click change content language
Then user observe the selected language content displayed or not
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 


@MobileTest @changeAppLanguage
Scenario Outline: TC-41-Verify Change App language and observe the content names and headers in the app are shown in that particular change app language operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click change app language
Then user observe the headers showing selected language content
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @wifi
Scenario Outline: TC-42-Verify in Settings page and Observe download only on WiFi check on and off is working or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click settings button
Then user observe wifi on and off button working
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @changeVideoQuality
Scenario Outline: TC-43-Verify In settings page and select Video quality and change the quality and observe the Changes operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click video quality button
Then user observe video quality changeing operation and play one content
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @feedBack
Scenario Outline: TC-44-Verify In Settings page and User can send the feedback through Feedback option operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click FeedBack button
Then user observe feedback submition
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @aboutUS
Scenario Outline: TC-45-Verify In Settings page and User can view about the app in About Us option operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click AboutUs button and observe the information of SunNxt App
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @fAQsAndTermsAndConditions
Scenario Outline: TC-46-Verify In Settings page and User can view FAQs and Terms and Conditions operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click FAQs button and observe the FAQs information in SunNxt App
Then user click terms and conditions button and observe the terms and conditions in SunNxt App
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @switchProfile
Scenario Outline: TC_49_Verify In profile Page and Select Switch profile and Add sub profiles and switch to secondary profiles operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click Switch profile button
When user create one new profile
Then user observe the swithing operation
And user delete the create profile
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
@MobileTest @homePageCarouselPlay
Scenario Outline: TC_31_Verify In Home page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user play one movie content in each carousel at homepage
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


@MobileTest @moviesPageCarouselPlay
Scenario Outline: TC_32_Verify In movies page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user play one movie content in each carousel at Movie page
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @tvShowsCarouselPlay
Scenario Outline: TC_33_Verify In Tv shows page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user play one TVshow content in each carousel at TVShows page
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 

 
@MobileTest @musicVideosCarouselPlay
Scenario Outline: TC_34_Verify In Music Videos Page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user play one musicvideo content in each carousel at music video page
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 @MobileTest @comedyCarouselPlay
Scenario Outline: TC_35_Verify In Comedy Page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user play one musicvideo content in each carousel at comedy page
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
  @MobileTest @addContenttowatchlist
Scenario Outline: verify Add Some content to Watch list and observe the added favourite contents in Watch List in profile page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
When user select one movie and add selected movie to watch list
Then user observe added movie is displayed in watchlist
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

 @MobileTest @subscriptionPlan
Scenario Outline: verift subscriptions plans operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click subscription button and observe subscription plans
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 

 
 
 
 
@MobileTest @listOfDevices
Scenario Outline: verift subscriptions plans operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click devices button and observe the list of devices
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
@MobileTest @searchparticularMovieAndTVShow
Scenario Outline: Observe Search icon on the header and click on search and search for any type of content and observe the search results in that particular section operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user search one movie content in search field
Then user search one TVShow content in search field
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 @MobileTest @entercouponcodeInProfilePage
Scenario Outline: User can apply different type of coupon codes through enter coupon code page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click enter coupon code button in profile page
Then user subscribe using couponcode
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 

 
 @MobileTest @selectPackageAndentercouponcode
Scenario Outline: User can also apply coupon codes while payments in Payment modes page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user select one movie by using unsubscribed cridentials
Then user select one package and enter couponcode and subscribe 
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 @MobileTest @enterActivatedevice
Scenario Outline: User can also Add/delete the devices from devices Option in Profile page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user go to profile page and select devices button
Then user deactivate one device into the list of devices
And user enter activate device code and click activate button
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
  @MobileTest @selectgenresInDiscoverySection
Scenario Outline: In discover section in Home page - select any genre and observe the results for the selected genre operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user select one genre in discovery section at homepage
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 @MobileTest @viewallInAllCarousels
Scenario Outline: Click on View all for all carousels and observe user is taken to view all screen operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user click viewall for All carousels and observe
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 @MobileTest @downloadcontent
Scenario Outline: Download all type of content from different sections when user is in online mode operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App    
Given user download one content in homepage
Then user download one content in movies
When user download one content in TVShows
And user download one content in music videos
Then user download one content in comedy
 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 @MobileTest @loginAfterlogout
Scenario Outline: Validate After logout user should be shown Login again operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user login once again after logout
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 
 @MobileTest @sharecontent
Scenario Outline: In content detail page -share button is shown below the player screen and Share the content via facebook message gmail etc and observe whether the sharing is done 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user share one content via facebook
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 @MobileTest @selectInRecomendedSection
Scenario Outline: In Content detail page - select any other content from Recommended section and check playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user play one movie content and select one more movie in recommended section
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 @MobileTest @refreshInAllSections
Scenario Outline: Verify App refresh across all the sections in online and offline mode operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user perform refresh operation in all pages

Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 
  @MobileTest @filterDataAlphabetical
Scenario Outline: Verify the data in filters is showing in alphabetical order or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user observe Filters data should be in alphabetical order

Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
  @MobileTest @contentLandscape
Scenario Outline: Verify action bar is showing in landscape mode for Live tv/Tv shows/Music videos/Comedy clips operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user change playing content to landscape in TVShows
Then user change playing content to landscape in music videos
When user change playing content to landscape in comedy clips
And user change playing content to landscape in live tv

Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 @MobileTest @playContinueWatchingMovie
Scenario Outline: Watch some content and observe continue watching section is getting updated or not and content should
resume playing from that point operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user login portal and play one movie content and go back to homepage
Then user observe previous played content added to continue watching section or not and play content in continue watching section

Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
 
 @MobileTest @roamingActivate
Scenario Outline: Activate International roaming and verify the content playback in the non home region operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given open the SunNxt App
Given user login to portal and activate international roaming
Then content playback in the non home region
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|