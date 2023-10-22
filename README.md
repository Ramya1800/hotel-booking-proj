                       *Steps to set up a project*
 
 1A)JAVA Project with build tool Maven  
                           
1.Launch Eclipse IDE then Go to File > Import > Existing Maven Project > Select Maven Project from the Root Directory OR if you'r checking out code through Eclipse provided git option then we just have to convert the project to maven project using option(right click on the project and select the option Configure ->Convert To Maven Project).
2.To run the application right click on the project and choose Run As > Java Application
  
NOTE: As a Prerequsite, To Run the above application we need Eclipse IDE and MYSQL Database in your system and Schema Name should be "hotel_management_system" and configure UserName and Password as "root" and "abcd" respectively .                
                             
1B)Please follow the below steps for Downloading & Installing Eclipse IDE:

i)In the first step, Open your browser and navigate to this URL(https://www.eclipse.org/downloads/). 
ii)Then, click on the “Download”(right side top) button to download Eclipse IDE.
iii)Next, click on the “Download x86_64” button. 
iv)Then click on the “Download” button. After clicking on the download button the .exe file for the eclipse will be downloaded.
v) Now go to File Explorer and click on “Downloads” after that click on the “eclipse-inst-jre-win64.exe” file to install Eclipse IDE.
vi)Then, click on “Eclipse IDE for Java Developers”.
vii)Then, click on the “Install” button.
 
1C)IF YOU'RE NOT AWARE ABOUT HOW TO CREATE AN MAVEN PROJECT THEN FOLLOW THE BELOW STEPS:

i)First we will open our Eclipse IDE then Go to File > New > Maven Project. 
ii)Once we click on Maven Project we will get a prompt for setting up our Workspace location.
iii)After setting Workspace location according to our choice. We will click on Next to go to further project setup steps.
iv)Setting Up Archetype(In this step, we will setup the archetype for our maven project. Archetype is a templating toolkit. It provides a templating solution for your project and helps to create a sample project structure that you can extend based on your business requirements. For this tutorial, we will use the maven-archetype-j2ee-simple archetype for our project).
v)After choosing the archetype we will click on Next and it will ask for the details like Group Id, Artifact Id, and Package information.
vi)Group Id – It’s a unique identifier to uniquely identify the project in a maven repository.
vii)Artifact Id – It’s basically the project name.
viii)After adding all these details we need to click on the Finish button. Maven will start creating your project and after a few seconds, your project will be created.
ix)In your maven project you will find the "pom.xml" file in that we have to add the sql dependency(open your browser and search maven repository click on that next you will find search bar in that type mysql-connector-java and click on that you will find the version 8.0.28 click on it and copy the dependency paste it on "pom.xml" file and save the xml file and maven dependencies will be added in your project).
x)Next,right click on your project you will find bulid path in that click on configure build path and click on add external jar  file (mysql-connector-java-8.0.28) then apply and finally click on apply and close(jar file will be added in Referenced Libraries).
xi)Then in your maven project you will find the "src/main/java" create your project.
xii)Right click on your project Go to Run As > Java Application.


