# Selenium Java Cucumber Gherkin JUnit Project (Gradle)

This project demonstrates automated UI testing using **Selenium WebDriver** with **Cucumber**, **Gherkin**, and **JUnit** in Java using **Gradle** as the build tool.

## Prerequisites

Before running the tests, ensure you have the following installed on your machine:

- **Java JDK 8 or higher**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Gradle**: [Download Gradle](https://gradle.org/install/) for managing dependencies and building the project
- **Git**: For cloning the repository from GitHub

## Setup Instructions

### 1. Clone the Repository

First, clone the repository from GitHub to your local machine using the following command:

git clone https://github.com/your-repo/Web_Automation.git
Navigate into the project directory:
cd Web_Automation

### 2. Install Dependencies

Gradle automatically manages the project dependencies. You can download and install the necessary dependencies by running the following command:
gradle clean build

### 3. Project Dependencies (build.gradle)
In the build.gradle file with the required dependencies for Selenium, Cucumber, and JUnit:
- implementation 'org.seleniumhq.selenium:selenium-java:4.21.0'
- implementation 'io.cucumber:cucumber-java:7.8.0'
- implementation 'io.cucumber:cucumber-junit:7.8.0'
- implementation 'io.github.bonigarcia:webdrivermanager:5.9.0'
- testImplementation 'junit:junit:4.13.2'


### 4. Running The Tests
You can run the Cucumber tests using Gradle from the command line.

- Running from the Command Line
Run the following command to execute the tests:
gradle test

This will automatically find and run all JUnit-based tests, including those using Cucumber.

- Running from an IDE (e.g., IntelliJ IDEA or Eclipse)
Open the project: Import the project into your IDE (IntelliJ IDEA, Eclipse, etc.).
Locate the JUnit Runner: Navigate to src/test/java/runners/TestRunner.java.
Run the test: Right-click on the TestRunner class and select Run to execute the Cucumber tests.

### 5. Reporting
Gradle provides default test reports found under the build/reports/tests/test directory. 
The reports include the results of your JUnit and Cucumber tests.

### 6.Browser Configuration
This project uses WebDriverManager to handle browser drivers (e.g., ChromeDriver) automatically. By default, the tests are configured to run on Google Chrome.

To change the browser, modify the WebDriver initialization in the step definition files:
WebDriver driver = new ChromeDriver();  // For Chrome
// WebDriver driver = new FirefoxDriver();  // For Firefox

### 7. Recording for Tests


https://github.com/user-attachments/assets/5675644f-a391-4aa2-aad1-ddde63825be4




