# 🤖 Automation Testing – Learning Project

> A step-by-step hands-on project to learn **Java-based Test Automation** from scratch.  
> This repository grows with you — from writing your first test to running a full CI/CD pipeline.

---

## 🎯 Who Is This For?

This project is for anyone who wants to:
- Learn automation testing with **zero prior experience**
- Understand how real-world test automation projects are structured
- Practice writing automated tests using industry-standard tools
- Build confidence before entering a professional QA/SDET role

---

## 🗺️ Learning Roadmap

Follow this path step by step. Don't skip ahead — each stage builds on the previous one.

```
Stage 1 → Java Basics
Stage 2 → Testing Fundamentals (JUnit / TestNG)
Stage 3 → Web Automation (Selenium WebDriver)
Stage 4 → Framework Design (Page Object Model)
Stage 5 → CI/CD Integration (Jenkins)
```

---

## 📁 Project Structure

```
LearningDemo/
│
├── src/
│   ├── main/java/          # Helper classes, utilities, base classes
│   └── test/java/          # All your test files go here
│       ├── day01/          # Your first test
│       ├── day02/          # Locators & interactions
│       └── ...             # Grows day by day
│
├── libs/                   # JAR files (Selenium, TestNG, etc.)
├── bin/                    # Compiled class files (auto-generated)
├── .settings/              # Eclipse IDE settings
├── .classpath              # Java build path configuration
├── .gitignore              # Files ignored by Git
└── Jenkinsfile             # CI/CD pipeline script
```

---

## 🛠️ Tech Stack

| Tool | Purpose | Learn First? |
|------|---------|--------------|
| Java | Programming language for writing tests | ✅ Yes |
| Selenium WebDriver | Automates browser actions | ✅ Yes |
| TestNG | Test framework (annotations, reports) | ✅ Yes |
| Maven / Gradle | Build & dependency management | After basics |
| Jenkins | CI/CD – runs tests automatically | Last stage |
| Git & GitHub | Version control | ✅ Yes |
| Eclipse IDE | Code editor used in this project | ✅ Yes |

---

## 🚀 Getting Started (Setup Guide)

### Step 1 — Install Java

Download and install **JDK 11 or above** from:  
👉 https://www.oracle.com/java/technologies/downloads/

Verify installation:
```bash
java -version
```

---

### Step 2 — Install Eclipse IDE

Download **Eclipse IDE for Java Developers** from:  
👉 https://www.eclipse.org/downloads/

---

### Step 3 — Clone This Repository

```bash
git clone https://github.com/Naresh-Kumar01/LearningDemo.git
```

---

### Step 4 — Import Project into Eclipse

1. Open Eclipse
2. Go to `File → Import → General → Existing Projects into Workspace`
3. Browse and select the cloned `LearningDemo` folder
4. Click **Finish**

---

### Step 5 — Add Libraries to Build Path

1. Right-click the project → `Build Path → Configure Build Path`
2. Go to **Libraries** tab → click **Add JARs**
3. Select all `.jar` files from the `libs/` folder
4. Click **Apply and Close**

---

### Step 6 — Run Your First Test

1. Navigate to `src/test/java/day01/`
2. Right-click the test file → `Run As → TestNG Test` (or JUnit Test)
3. ✅ If it passes — you're ready to go!

---

## 📖 Stage-by-Stage Learning Guide

### 🟡 Stage 1 — Java Basics (Week 1–2)

Before writing tests, get comfortable with Java.

**Topics to cover:**
- Variables, data types, and operators
- Conditions (`if/else`) and loops (`for`, `while`)
- Methods and return types
- Arrays and Collections (List, Map)
- Object-Oriented Programming (classes, objects, inheritance)
- Exception handling (`try/catch`)

**Practice:** Write small programs — don't jump to Selenium yet!

---

### 🟠 Stage 2 — Testing Fundamentals (Week 3)

Understand how to structure and run tests.

**Topics to cover:**
- What is a test framework?
- TestNG annotations: `@Test`, `@BeforeMethod`, `@AfterMethod`, `@BeforeClass`
- Assertions: `assertEquals`, `assertTrue`, `assertNotNull`
- Running tests and reading results
- Grouping and prioritizing tests

**Goal:** Write 5 simple tests without any browser.

---

### 🔵 Stage 3 — Selenium WebDriver (Week 4–6)

Now automate a real browser!

**Topics to cover:**
- What is Selenium? How does it work?
- Setting up ChromeDriver / WebDriverManager
- Opening a browser and navigating to a URL
- Finding elements: `By.id`, `By.name`, `By.xpath`, `By.cssSelector`
- Interacting with elements: `click()`, `sendKeys()`, `getText()`
- Handling dropdowns, checkboxes, alerts, and pop-ups
- Waits: Implicit, Explicit (`WebDriverWait`), Fluent
- Taking screenshots on failure

**Goal:** Automate a login, form submission, and search scenario.

---

### 🟣 Stage 4 — Framework Design (Week 7–8)

Make your tests maintainable and professional.

**Topics to cover:**
- What is the **Page Object Model (POM)**?
- Creating Page classes for each screen
- Separating test logic from page actions
- Reading test data from Excel / JSON / properties files
- Generating HTML test reports (ExtentReports / TestNG reports)
- Taking screenshots and attaching to reports

**Goal:** Refactor your existing tests into a proper POM framework.

---

### 🔴 Stage 5 — CI/CD with Jenkins (Week 9–10)

Run your tests automatically on every code change.

**Topics to cover:**
- What is CI/CD and why does it matter?
- Installing and setting up Jenkins
- Creating a Jenkins pipeline job
- Connecting Jenkins to your GitHub repository
- Reading and understanding the `Jenkinsfile` in this project
- Viewing test reports in Jenkins

**Goal:** Push code to GitHub → Jenkins runs tests → See results automatically.

---

## 💡 Tips for Learners

- **Code every day** — even 30 minutes is enough to build momentum
- **Don't copy-paste** — type the code yourself to build muscle memory
- **Break things on purpose** — understanding errors makes you a better tester
- **Commit your progress to GitHub** — your commit history is your portfolio
- **Read error messages carefully** — they almost always tell you what's wrong

---

## ❓ Common Issues & Fixes

| Problem | Fix |
|---------|-----|
| `chromedriver not found` | Download matching ChromeDriver from https://chromedriver.chromium.org or use WebDriverManager |
| `NoSuchElementException` | Your locator is wrong or the page hasn't loaded yet — add an explicit wait |
| `ClassNotFoundException` | Check if JAR files are added to the build path |
| Tests not found in Eclipse | Right-click project → `Refresh`, then run again |
| Jenkins build failing | Check the console output — usually a missing dependency or wrong path |

---

## 📚 Recommended Free Resources

| Resource | Link |
|----------|------|
| Java for Beginners | https://www.w3schools.com/java |
| Selenium Docs | https://www.selenium.dev/documentation |
| TestNG Docs | https://testng.org/doc |
| Git Basics | https://git-scm.com/doc |
| Jenkins Getting Started | https://www.jenkins.io/doc/pipeline/tour/getting-started |

---

## 🤝 Contributing

Found a bug or want to add a practice exercise?

1. Fork this repository
2. Create a new branch: `git checkout -b add-exercise-day42`
3. Make your changes and commit: `git commit -m "Add login test exercise"`
4. Push and open a Pull Request

---

## 👨‍💻 Author

**Naresh Kumar**  
Automation Testing Learner & Practitioner  
[GitHub](https://github.com/Naresh-Kumar01)

---

> ⭐ If this repository helped you learn, please give it a star — it motivates continued improvement!
