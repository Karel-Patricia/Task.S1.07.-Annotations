# Task S1.07 - Annotations

This task focuses on the use of annotations in Java, which allow adding metadata to source code to improve readability, maintainability, and behavior control. 

## 📌 Level 1

In this level, we work with standard Java annotations like @Override and @Deprecated within a class hierarchy. The exercises apply inheritance and polymorphism to demonstrate correct method overriding and the proper handling of deprecated methods.

### Exercise 1 — Override

Create an object hierarchy with three classes: Worker, OnlineWorker, and OnsiteWorker.

The Worker class has the attributes name, surname, pricePerHour, and a method calculateSalary() that receives the number of worked hours as a parameter and multiplies it by the hourly rate. The child classes must override this method using the @Override annotation.

From the main() method of the Main class, perform the necessary calls to demonstrate the correct behavior of the @Override annotation.

For onsite workers, the salary calculation method receives the number of hours worked per month. The salary is calculated by multiplying the worked hours by the hourly rate and adding the value of a static attribute called fuel, which is added to this class.

For online workers, the salary calculation method also receives the number of hours worked per month. The salary is calculated by multiplying the worked hours by the hourly rate and adding the cost of a flat Internet fee, which is a constant defined in the OnlineWorker class.

### Exercise 1 — Deprecated

Add some deprecated (obsolete) methods to the child classes, and use the corresponding annotation. From an external class, invoke the deprecated methods, suppressing the deprecation warnings by using the appropriate annotation.

## 🛠️ Technologies
- IntelliJ IDEA 
- Java 21
- Maven
- Git & GitHub 
