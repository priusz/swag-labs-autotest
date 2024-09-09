# Swag Labs AutoTest

[![GitHub Contributors][contributors-shield]][contributors-url]
[![GitHub Forks][forks-shield]][forks-url]
[![GitHub Stars][stars-shield]][stars-url]
[![GitHub Issues][issues-shield]][issues-url]


 **priusz:** 
 
[![LinkedIn][linkedin-shield]][linkedin-url-one]

**sarkadins:** 

[![LinkedIn][linkedin-shield]][linkedin-url-two]

**idlewombat:** 

[![LinkedIn][linkedin-shield]][linkedin-url-three]

This repository contains automated tests for the [Swag Labs](https://www.saucedemo.com/) web application, developed
using Selenium Grid, Docker, and Behavior-Driven Development (BDD) principles. The project aims to demonstrate scalable
and maintainable test automation practices.

## Table of Contents

- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Setup Instructions](#setup-instructions)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Tests](#running-the-tests)
- [Test Structure](#test-structure)
- [Built With](#built-with)

## Project Overview

Swag Labs AutoTest is a comprehensive test suite designed to automate the end-to-end testing of the Swag Labs web
application. This project leverages Selenium Grid for distributed test execution, Docker for containerization, and
Cucumber for BDD-style test scenarios.

## Technology Stack

- **Selenium Grid**: Used for parallel test execution across multiple browsers and environments.
- **Docker**: Containerization of the test environment to ensure consistent and reproducible test runs.
- **Cucumber**: A BDD framework that allows writing tests in a human-readable format (Gherkin).
- **Java**: The programming language used to write the test scripts.
- **Maven**: Build automation tool for managing dependencies and running tests.

## Setup Instructions

### Prerequisites

Before setting up the project, ensure you have the following tools installed:

- **Java Development Kit (JDK) 11 or higher**
- **Maven**
- **Docker**
- **Git**

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/priusz/swag-labs-autotest.git
   cd swag-labs-autotest
   ```
   
2. **Set up Environment Variables**

    ```bash
       export base_url=https://www.saucedemo.com/ password=secret_sauce
    ```

3. **Set up Selenium Grid with Docker**

    ```bash
   docker-compose up -d
   ```

4. **Install dependencies**

    ```bash
   mvn clean install
   ```

### Running the Tests

1. Execute Tests

    ```bash
    mvn test
    ```
   
2. View test reports

    After running the tests, the report can be found in the target/cucumber-reports/ directory.

## Test Structure

The tests are organized in a BDD-style format using Cucumber. The project structure is as follows:

src/test/java: Contains step definitions and support classes.<br>
src/test/resources: Contains feature files written in Gherkin syntax.<br>
docker-compose.yml: Configuration for setting up the Selenium Grid with Docker.

## Built With

[![Selenium][selenium-shield]][selenium-url]

[![Java][java-shield]][java-url]

[![Maven][maven-shield]][maven-url]

[![Cucumber][cucumber-shield]][cucumber-url]


[contributors-shield]: https://img.shields.io/github/contributors/priusz/swag-labs-autotest

[contributors-url]: https://github.com/priusz/swag-labs-autotest/graphs/contributors

[linkedin-shield]: https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white

[linkedin-url-one]: https://www.linkedin.com/in/timeaboros-priusz/

[linkedin-url-two]: https://www.linkedin.com/in/soma-sarkadi-nagy/

[linkedin-url-three]: https://www.linkedin.com/in/bence-futasz/

[selenium-shield]: https://img.shields.io/badge/-selenium-CB02A?style=for-the-badge&logo=selenium&logoColor=white

[selenium-url]: https://www.selenium.dev/

[java-shield]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white

[java-url]: https://www.java.com/en/

[maven-shield]: https://img.shields.io/badge/Maven-3.6.3+-orange.svg

[maven-url]: https://maven.apache.org/

[cucumber-shield]: https://img.shields.io/badge/Cucumber-6.10.4-brightgreen.svg

[cucumber-url]: https://cucumber.io/

[contributors-shield]: https://img.shields.io/github/contributors/priusz/swag-labs-autotest

[contributors-url]: https://github.com/priusz/swag-labs-autotest/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/priusz/swag-labs-autotest?style=social

[forks-url]: https://github.com/priusz/swag-labs-autotest/forks

[stars-shield]: https://img.shields.io/github/stars/priusz/swag-labs-autotest?style=social

[stars-url]: https://github.com/priusz/swag-labs-autotest/stargazers

[issues-shield]: https://img.shields.io/github/issues/priusz/swag-labs-autotest

[issues-url]: https://github.com/priusz/swag-labs-autotest/issues
