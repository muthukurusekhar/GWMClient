Feature:Given client able to login gwm4 
@Client_Login 
Scenario Outline: User able to login with valid details
Given user Open browser and Enter GWM URL
Then user enter valid "<Username>" and "<Password>" and click login 
Then Click Skip now 

Examples: 
|  Username      | Password | ClientName        |
|  qaclient001   | Test1234 | Mr. QA Client 001 |

@Create_Person_ContactDetails
Scenario Outline: User able to create person with valid details
Given user navigate to pending Tranation page 
Then Click Create person    
Then enter valid details "<firstName>" , "<lastName>" , "<Id>" , "<nation>" , "<Race>" and "<Remarks>"
Then Click save  
And Click next 
And Enter valid address "<addres1>" , "<addres2>" , "<addres3>" , "<Postalcode>" , "<city>" , "<state>" , "<country>" , "<officenumber>" , "<homenumber>" , "<mobilenumber>" and "<email>"
Then Click save 
And Click next
Examples: 
|  firstName     | lastName | Id    | nation    | Race       | Remarks        |  addres1   | addres2  | addres3 | Postalcode | city      | state      | country   |officenumber| homenumber| mobilenumber | email                         |
|  Phillip       | capital  | 0000  | Singapore |Singaporean | Thanks Phillip |  singapore | Phillip  | capital | 603103     | Singapore |Singaporean | Singapore | 8985755737 |8838259615 |8849782882    |muthukurusekhar@phillip.com.sg |


@Create_Login
Scenario Outline: User able to create login with valid details
Given user Click Create login
Then Enter create login details "<LoginId>" , "<validfrom>" and "<ValidTo>"   
And Click next 

Examples: 
|  LoginId       | validfrom  | ValidTo    |
|  PhillipQAO    | 08/03/2022 | 29/03/2022 |

@AddRole
Scenario: User able to Add role with valid details
Given user Click AddRole
Then Enter Role details    
Then Click save
And Verify Login ID

@Forgot_UserID
Scenario Outline: User able to retrieve UserID with valid details
Given user Open browser and Enter GWM URL
Then Click Forgot UserID link  
And Enter  "<nric>"  and "<dob>" and click Recover my User Id button

Examples: 
|  nric          | dob        |
|  12345         | 06/02/1992 |

@Forgot_Password
Scenario Outline: User able to retrieve Password with valid details
Given user Open browser and Enter GWM URL
Then Click Forgot Password link 
Then Click Reset my Password button 
Then Enter details "<UserId>" , "<nric>" and "<dob>" and click Reset my Password button   

Examples: 
|  UserId        | nric       | dob        |
|  qaclient001   | 12345      | 06/02/1992 |

@portfoliomanagement
Scenario Outline: User able to create model portfolio with valid details
Given user Open browser and Enter GWM URL
Then user enter valid "<Username>" and "<Password>" and click login 
#Then Click Skip now 
Then click portfolio dropdown
Then Click portfolio management  
And click create model portfolio 
And enter Details "<modelname>" , "<portfoliosize>" and "<corridor>" 
Then click Save model portfolio 

Examples: 
|  Username      | Password   | modelname  | portfoliosize| corridor|
|  qaclient001   | Test1234   | Phillip    |  70          | 100     |

@Clientdashbord
Scenario Outline: User able to retrieve portfolio summery with valid details
Given user Open browser and Enter GWM URL
Then user enter valid "<Username>" and "<Password>" and click login 
Then click portfolio dropdown
Then Click dashbord
And Click Portfolio summery month and year
Then click search button

Examples: 
|  Username      | Password   |
|  qaclient001   | Test1234   |



