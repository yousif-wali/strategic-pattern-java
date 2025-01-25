
# Car Handling Strategy Pattern

This is a Java-based mini-project demonstrating the **Strategy Design Pattern**. The project uses a `HandlingStrategy` interface to define different car handling behaviors dynamically.

## Features
- Implements the **Strategy Pattern** for flexible handling behaviors.
- Includes abstract and concrete car classes (`Car`, `Coupe`, `Sedan`, `Convertible`).
- Provides concrete strategies (`SafetyHandling`, `SportHandling`, `RacingHandling`) to define unique handling behaviors.
- Supports dynamic modification of a car's handling behavior after creation.

## Structure
- `Car`: Abstract class representing a generic car with a name and handling strategy.
- `Coupe`, `Sedan`, `Convertible`: Concrete car classes inheriting from `Car`.
- `HandlingStrategy`: Interface defining the `handle()` method for handling behavior.
- `SafetyHandling`, `SportHandling`, `RacingHandling`: Implementations of `HandlingStrategy`.

## How to Run
1. Clone the repository or download the project files.
2. Compile the Java code using your favorite IDE or the command line.
3. Run the `Main` class to see all combinations of cars and handling strategies.

## Test Instructions
1. Tests are written using **JUnit 5**.
2. Run the tests with a JUnit-compatible runner.
3. Ensure the static counter for car names resets between tests to avoid conflicts.

## Example Output
```
coupe 1 eases through turn
coupe 2 makes a tight turn
coupe 3 skids through a turn
sedan 4 eases through turn
sedan 5 makes a tight turn
sedan 6 skids through a turn
convertible 7 eases through turn
convertible 8 makes a tight turn
convertible 9 skids through a turn
```

## Requirements
- **Java 8 or higher**
- **JUnit 5** for running tests.

## Files Included
- `Main.java`: Entry point for the program.
- `Car.java`: Abstract class and its concrete subclasses.
- `HandlingStrategy.java`: Interface and its implementations.
- `MainTest.java`: JUnit 5 test cases.

## UML Diagram
The UML diagram is included in the project to illustrate the relationships and structure.

## License
This project is open-source and can be used for educational purposes.
