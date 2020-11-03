# using_SHAFT_ENGINE

Test Automation Task Using Java programming Language , Maven , SHAFT-ENGINE



#### *Getting Started*

- Within your IDE import this project by clone the project url, before that you need to signin with GitHub.
- IntelliJ first fork the project to you repositories (File >> New >> Project from Version Control >> GitHub (Login) >> Select the project >> Clone )
- Eclipse (File >> import >> Git >> Projects from Git >> Clone URI >> Copy the URI >> Next >> Next >> Check "Clone submodules" >> Next >> Next >> Finish)

#### *Test Data and Test Classes *

- All Test data inisde  "config.properties" file.
- PageObjects PackageIncludes all Pages starts with NameOfPage_mainfunctionality_page , inisde every class includes its own methods 
- Utilities Package includes 2 java classes first one is :PropertiesConfig.java configuration and handling config.properties file.
-config.properties file contains all test data in project
- ObjectRepo: Identify all element locators inside the project 
- BaseTests Package includes configuration for test runs and priorties.

##### *Running Tests *

-Tests can be run within the test class, testng.xml, or via terminal "mvn test".

##### *Reporting *

-Allure report is generated with gif, videos of each test, logs, and assertion result.
-This report can be run from the project folder "generate_allure_report".

#### *Prerequisites*

- JDK 14
- Lastest Eclipse or IntelliJ IDE.
- Lastest Chrome WebDriver.
- Latest Chrome Browser.

#### *Technology Used* 

Java, TestNG, Selenium, SHAFT-Engine , MavenFramework Used: Page Object Model
