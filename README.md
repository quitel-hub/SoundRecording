[SoundRecording_Readme.md](https://github.com/user-attachments/files/33067111/SoundRecording_Readme.md)
# Sound Recording Compilation 🎵

A Java console application designed to model a music disk compilation. This project is a university laboratory work (Variant 5) that actively demonstrates core Object-Oriented Programming (OOP) principles, clean code practices (Java Code Conventions), and automated unit testing.

## 🌟 Features
* **OOP Principles in Action:** Utilizes Inheritance (base `Track` class extended by `RockTrack` and `ClassicalTrack`), Polymorphism (dynamic `play()` methods), and strict Encapsulation.
* **Compilation Management:** Add tracks to a disk and calculate the total duration of the entire compilation.
* **Sorting & Filtering:** Sort tracks by musical style (`CLASSICAL`, `ROCK`, `POP`, `JAZZ`) and search for specific tracks within a specified duration range.
* **Robust Testing:** Logic is covered by unit tests using JUnit 5, utilizing Mockito for isolated component testing.

## 🛠 Technologies & Tools
* **Language:** Java 21
* **Build Tool:** Maven
* **Testing:** JUnit 5 (Jupiter), Mockito
* **Version Control:** Git & GitHub

## 📂 Project Structure
```text
src/
├── main/java/com/university/
│   ├── Main.java                 # Application entry point
│   └── model/
│       ├── Style.java            # Enum for music styles
│       ├── Track.java            # Abstract base class
│       ├── RockTrack.java        # Specific track implementation
│       ├── ClassicalTrack.java   # Specific track implementation
│       └── Disk.java             # Compilation manager class
└── test/java/com/university/model/
    └── DiskTest.java             # Unit tests with Mockito
```

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 21 or higher
* Apache Maven
* Git

### Installation
Clone the repository to your local machine:
```bash
git clone https://github.com/YOUR_USERNAME/sound-recording.git
cd sound-recording
```
*(Note: Replace `YOUR_USERNAME` with your actual GitHub username).*

### Running the Application
To compile and run the application via Maven from the terminal:
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.university.Main"
```
*(Alternatively, simply open the project in VS Code or IntelliJ IDEA and click "Run" inside `Main.java`).*

### Running Tests
To execute the unit tests and verify the application's business logic:
```bash
mvn test
```

## 🎓 Academic Context
Developed as part of the Object-Oriented Programming laboratory curriculum. 
* **Task:** Create a flower shop/taxi park/sound recording/etc. hierarchy using OOP.
* **Variant:** 5 (Sound Recording).
