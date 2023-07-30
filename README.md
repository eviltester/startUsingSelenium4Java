# startUsingSelenium4Java

[![build status](https://github.com/eviltester/startUsingSelenium4Java/actions/workflows/build.yml/badge.svg)](https://github.com/eviltester/startUsingSelenium4Java/actions)

Simple start example for Selenium 4 with java.

It has the basic startup and configuration for a test using Chrome Driver.

Pre-requisites are:

- a Java SDK
- maven 
- and and IDE Install.

The code uses JUnit 5 so you can follow the Quick Start Guide in the "[Getting Started with JUnit 5 repo](https://github.com/eviltester/startUsingJavaJUnit5)"

- [Quick start guide is here](https://github.com/eviltester/startUsingJavaJUnit5/blob/main/speedrun_install_java_checklist.md)

You can run the test using:

`mvn test`

And can run it using headless mode by setting the environment variable `BROWSER_STATE` to have the value "`Headless`"

e.g.

```
BROWSER_STATE=Headless mvn test
```

The repo also has [Github actions](https://github.com/eviltester/startUsingJavaJUnit5/blob/main/.github/workflows/build.yml) to run the test in headless mode periodically.
