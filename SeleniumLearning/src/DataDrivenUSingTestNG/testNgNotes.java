//TestNg ---unit testing framework
//purpose ---test cases in a systematic way
//open source framework
//also called as java unit testing framework
//advantages --generate good html reports
//gives lot annotations
//option to priorities your methods---sequence of the test cases(which one execute first and which one is last)
//dependency features 
//grouping
//most important features----data provider
//TDD---test driven development
//group wise feature in report
//we can execute testNg from command prompt as well
//1.create a lib folder
//step2--copy all jar in lib folder
//in cmd type - cd/ and hit enter
//type-- cd (project path) --hit enter
//type---set classpath = (project path)\bin;(project path)\lib\*---hit enter
//type---java org.testng.TestNG (project path)\testng.xml---hit enter

//Also you could run TestNG using Batch file (.bat file)
//Copy the below code and place it in a notepad and save the file using .bat extension
//set projectLocation=(project path)
//cd %projectLocation%
//set classpath=%projectLocation%\bin;%projectLocation%\lib\*
//java org.testng.TestNG %projectLocation%\testng.xml
//pause
//Parallel testing or cross browser testing :
//we can do it through testNG or selenium grid
//using testNg there are 4 different way 
//in testng.xml  we can do parallelism on test/class/method
//we can do parallel testing using data provider
