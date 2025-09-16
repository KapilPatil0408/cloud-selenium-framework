# Test Automation Framework

This is a **Java-based Test Automation Framework**.

The framework is built using Java 11, TestNG, Maven, and integrates with cloud-based testing on **LambdaTest**. It supports data-driven testing and generates detailed reports and logs.


## 🚀 About Me
Hi My Name is Kapil Patil and I have 4 years of experience in Automation Testing using technologies like Selenium WebDriver, RestAssured, Appium.

My major expertise is in Java Programming Langauge.

## Authors
-Kapil Patil
- [@KapilPatil0408](https://github.com/KapilPatil0408)
- Email: patil.kapilqa@gmail.com


## Tech Stack

**Programming Lanaguge:** Java 11


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/KapilPatil0408)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kapil-patil-b23360232/)


## Prerequisites
Make sure you have the following installed and configured before running the framework:

- ** Java 11 **
- ** Maven **  
   - Download link -https://maven.apache.org/download.cgi
- LambdaTest credentials (username & access key)


## ✅ Features
- **Data-Driven Testing**: OpenCSV, JSON, Apache POI
- **Fake Data Generation**: Faker library
- **Cloud Testing**: LambdaTest integration
- **Cross Browser Testing**: Supports running tests on different  browsers
- **Headless Mode**: Enabled for faster execution
- **CLI Execution**: Maven Surefire Plugin with configurable parameters
- **Reporting**: Extent Reports (HTML format)
- **Logging**: Log4j for detailed logging
- **Test Artifacts**:
  - Reports → `reports.html`
  - Logs → `/logs` folder`


## Technologies Used
- Java 11
- TestNG 
- OpenCSV
- Gson
- Apache POI
- Faker
- LambdaTest
- Log4j
- Extent Reports
## Setup Instruction

**Clone the Repository:**

```bash
  git clone https://github.com/KapilPatil0408/cloud-selenium-framework
  cd cloud-selenium-framework
```

**Running tests on LambdaTest:**

```bash
  mvn test -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X
```

**Running tests on chrome browser on Local Machine in Headless mode:**

```bash
  mvn test -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X
```

## Reports & Logs
- Reports: After test execution, an HTML report will be generated in the root folder as: ./reports.html. 

The Report contains information on the test results, including: Test summary, Pass/Fail counts, Execution duration, Logs and screenshots.

## Logs:
All execution logs are captured using Log4j and stored in the ./logs/ directory


## Integrated the project GitHub Actions
This automation project is integrated with github actions.
The tests will be executed at 11:30PM IST every single day.

The reports will be archived in gh-pages branch
You can we HTML Report at: 
https://kapilpatil0408.github.io/cloud-selenium-framework/report.html
