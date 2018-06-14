*******Testing Automation framework using Java with Selenium:
I made this framework as a sample for testing Wikipedia website for some features and it's like a template if you would like to have an Automation QA Front End jumpstart.
This Framework is an implementation for the Front-End Testing Automation using Gradle,Java and Selenium.


#Framework/Design Decisions:

1)Check for the title of the website.
2)Check for Did you mean suggestion.
3)Check for 20 results per page.
4)Check for the chosen article title.
5)Check for the article's Table Of Content 'TOC'.
6)Check for the article's References.
7)Check the user isn't logged-in.
8)Check for the paging feature.
9)Check for window sizing dev.


#Steps to run:

1)Download and install the java JDK/JRE
2)Clone the project: https://github.com/Ahmedsaad2050/SeleniumFW.git
3)Start running tests using the gradlew file in the project directory from Command Line.

#Helping Instructions:
*Open CMD window, navigate to the project path(ex."cd c:\Workplace\SeleniumFW") and then Type "gradlew build" for building and running the tests.
*For reviewing the testing results and the report: navigate to this path "cd c:\Workplace\SeleniumFW\build\reports\tests\test\classes"
*You'll find the file "wikiPac.Wiki.html" with the testing status.


#Another used gradle commands:
  gradlew build
  gradlew clean
  gradlew test

Good Luck :)
