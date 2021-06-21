Hello! This is the ReadMe for the K Health automation assignment. If you look through the script, you'll notice that I am a supreme novice with automation. Unfortunately, I couldn't figure out the assertion portion. 

I'll be honest with you - I'm not sure completely sure how to execute the tests after downloading them so instead I'll detail what I did to create them. 
Assuming there is nothing installed on your computer, here's what you should do. First, download and install the Java Development Kit. It can be found here - https://www.oracle.com/java/technologies/javase-downloads.html
Next, download and install the Eclipse IDE. It can be found here - https://www.eclipse.org/downloads/
Last, download and install the Selenium Java Client Driver, which can be found here - https://www.selenium.dev/downloads/
Download ChromeDriver - https://chromedriver.chromium.org/downloads. Take note of where this file is stored.
After all of these have been downloaded and installed, launch Eclipse. 
In Eclipse, select File - New - Project - Java - Java Project. A New Java Project will modal will appear. Give your project a name and finish creating the project.
Locate the newly created project. Create a new package by right clicking the project and selecting New - Package. Make sure to name the package.
Right click the project and select Properties. Select Java Build Path and Add External Jars. These are all the jar files from line 6 of this txt file.
Right click the newly created package and select New - Class. A modal will appear. In this modal, besides leaving the default values as is, mark the "public static void" checkbox and then create the new class. 
Write your script. I guess the script that I put into  Github can be copy/pasted here. Note that since I used ChromeDriver, I had to enter the ChromeDriver location appropriately in the script. 
Execute the script by clicking the Run button.

In order to make the framework more reusable, I'd say to use something different than the price of the first product for the assertion. This is because not only can the product catalog can change, but the price of the item that used to be less than $30 can change to a value greater than $30. Maybe instead of using the price, we can use something more static such as the URL of the page or the text at the top of page stating "1-16 of 158 results for "QA Automation Books".

For improving the scenario, first and foremost, I can figure out how to write a correct assertion statement :( Jokes aside, maybe we can try testing it with different browsers, and interacting with the page such as using the sort by and filter functions. We can also search for different things, such as entering different unique characters along with "QA Automation Books".
