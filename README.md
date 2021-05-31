# template-java

Gradle Java template:

- Nebula Gradle linter
- CheckStyle plugin with [Netflix checkstyle rules](https://github.com/Netflix/gradle-template/blob/master/codequality/checkstyle.xml)
- Google Code Fromatter
  > Execute the task googleJavaFormat to format all *.java files in the project
    >> $ ./gradlew goJF
  > 
  > Execute the task verifyGoogleJavaFormat to verify that all *.java files are formatted properly
    >> $ ./gradlew verGJF
- sonarLint gradle plugin 🚧
- Junit5
- IntelliJ annotation
- Jacoco test report (export as HTML, XML, CSV)
- Jacoco log to have in the console the coverage when I'm using the watch approach 'gradle -t test'
- Mocha unit test report style