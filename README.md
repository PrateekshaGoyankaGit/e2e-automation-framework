# E2E Automation Framework

End-to-end test automation framework built with Java, Selenium, Cucumber BDD and REST Assured, with AI-assisted test maintenance and a CI/CD pipeline planned.

## Tech Stack

**Current**
- Java 17
- Maven
- Selenium WebDriver 4
- TestNG
- Cucumber (BDD)
- REST Assured (API testing)
- Git / GitHub

**Planned**
- GitHub Actions and Jenkins (CI/CD pipelines)
- Docker (containerized test execution)
- Kubernetes (scalable test execution)
- AI integration (see roadmap)

## Project Structure
- `src/main/java` : base, pages (Page Object Model), utils, api helpers
- `src/test/java` : step definitions, runners, tests
- `src/test/resources/features` : Gherkin feature files
- `reports` : test reports
- `screenshots` : failure screenshots

## Roadmap

### AI-assisted testing
- Self-healing locators: when a test fails because a locator broke, AI suggests a repaired locator
- Failure analysis: AI summarizes test results and likely root causes
- Automated report creation: AI-generated, readable test reports

### CI/CD and infrastructure
- GitHub Actions and Jenkins pipelines to build and run tests on every push
- Docker image so tests run the same way on any machine
- Kubernetes (future scope) for running tests in parallel at scale

## Status
Work in progress. Project setup and core dependencies (Selenium, TestNG, Cucumber, REST Assured) are in place. Framework layers, AI features and CI/CD are being added step by step.