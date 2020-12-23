package jenkins;

/**
 * @author varma
 *
 */
public class Jenkins {

	
	/*
	 * Notes: 
	 * Jenkins is a CI tool and we will use this tool to run via maven
	 * 
	 * Jenkins can be downloaded in 2 methods one is windows other one is .war file
	 * Once you download the war file > open the cmd > go to the file path and run the below command
	 * 
	 * java -jar jenkins.war -httpPort=9090 and click on enter
	 * 
	 * once you will see the message as "INFO: jenkins is fully up and running"
	 * Then enter this URL in the browser localhost:9090 > and set up the user name and pwd
	 * 
	 * Configuration settings Jenkin:
	 * Open home page > Manage jenkins > Global Tool configuration > click on JDK installations
	 * and provide JAVA_HOME and MAVEN_Home in Maven section > click on save
	 * 
	 * To create a new job:
	 * On home page > click on new item > enter job name > click on free style project
	 * it will open job configuration window with general tab
	 * 
	 * either you can provide the project via GIT path or local machine;
	 * if it is present in location machine then click on advanced > use custom workspace
	 * > enter ${JENKINS_HOME}/<Project name>
	 * 
	 * In the local machine copy the project into .jenkins folder ..this is nothing but JENKINS_HOME
	 * 
	 * Go to build section > select 'Invoke top-level maven targets'> select maven version > enter
	 * mvn test <Test NG XML> > then click on save
	 * 
	 * how to run jenkins job:
	 * click on 'build now' button
	 * 
	 * To see the results in jenkin:
	 * Go to the latest build in the build history and click on the latest run > click on console output
	 * 
	 * To see the results in TestNG format it required in the form of .xml format then TestNG plug in will
	 * convernt into a readable format
	 * 
	 * how to setup TestNG plug in:
	 * On home page > Manage jenkins > Manage plugins > search for Test NG plug in and add it
	 * 
	 * Once the plug in is added successfully
	 * go the newly created job > click on configure > Post-build actions > select publish TestNG results
	 *  then automatically it will show the xml file > save it
	 *  
	 * once you click on the 'build now' you can see additional section as 'Test NG Results'
	 * if we have minimum of 5 previous builds then you can see the difference in the graph represented beside Test NG results
	 *  
	 * schedule the jenkins:
	 * go the newly created job > click on configure > Build trigger section > build periodically
	 * Scheduler expects the below 5 parameters
	 * MINUTES
	 * HOUR
	 * DAYMONTH
	 * MONTH
	 * DAYWEEK
	 * 
	 * if you want to run the scheduler at 7am in the morning
	 * Then enter like this '* 7 * * *' in the schedule section
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
