# SKY
SKY_Assignment
Step 1: Install Java 
To Install the JDK Software and Set JAVA_HOME on a Windows System
1.	To install the JDK software, do the following:
a.	Go to http://java.sun.com/javase/downloads/index.jsp.
b.	Select the appropriate JDK software and click Download.
The JDK software is installed on your computer in the default location; for example, at C:\Program Files\Java\jdk1.6.0_02. You can move the JDK software to another location.
2.	To set JAVA_HOME, do the following:
a.	Right click My Computer and select Properties.
b.	On the Advanced tab, select Environment Variables, and then edit JAVA_HOME to point to where the JDK software is located, for example, C:\Program Files\Java\jdk1.6.0_02.
Step 2: Down load the folder from GitHub to local
Step 3: Open Eclipse IDE
Step 4: Load the project 
File  Import  Maven  Existing Maven projects  select the folder  Finish
Step 5: Imported Project will be opened in the Package Explorer
Step 6: Open SKY_Assignment\src\test\java\cucumberOptions\TestRunner.java file 
Step 7: Run as TestNG options
Step 8: Test Result will be displayed in the console
Note: In feature file, kindly change the Blue highlighted word to the any choice of word available in the latest news in the Scenario 4.


Scenario: To verify the child tab title
Given I navigate to Sky News homepage
And I select a article in the Homepage
Then I should see that given word "PM told" is available in the child page title
And I close the browser
