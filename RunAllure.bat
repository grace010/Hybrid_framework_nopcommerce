set ProjectPath=%~dp0
cd %ProjectPath%
echo %ProjectPath%
set p=%PATH%
java -javaagent:"%ProjectPath%libAllure\aspectjweaver-1.9.8.jar" -classpath "%ProjectPath%bin;%ProjectPath%libAllure\*;%ProjectPath%Log4j\*;%ProjectPath%libExtendReportV2\*;%ProjectPath%libraries\*;%ProjectPath%libReportNG\*;%ProjectPath%libDriverManager\*" org.testng.TestNG "%ProjectPath%bin\runNopcommerceTest.xml"
pause

