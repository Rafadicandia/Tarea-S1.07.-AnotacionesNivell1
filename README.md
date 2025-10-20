
## 📄 Description - Exercise Statement

***

## **Exercise 1**
Create an object hierarchy with three classes: **Worker**, **OnlineWorker**, and **On-siteWorker**.

The **Worker** class has the attributes name, surname, price/hour, and a `calculateSalary()` method that receives the number of hours worked as a parameter and multiplies it by the price/hour. The child classes must override it, using **@Override**.

From the `main()` method of the Main class, make the necessary calls to demonstrate the functionality of the **@Override** annotation.

For **on-site workers**, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour, plus the value of a static attribute named `gasoline` that we will add to this class.

For **online workers**, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour, and the price of the flat-rate internet, which will be a constant in the **OnlineWorker** class, will be added to it.

***

## **Exercise 2**
Add some obsolete (deprecated) methods to the child classes and use the corresponding annotation. Invoke the obsolete methods from an external class, suppressing the "warnings" for being obsolete by using the appropriate annotation.

## 💻 Used Technologies

**Java**: 24 (OpenJDK)

-----

## 📋 Requirements

- Operating System: Windows/macOS/Linux.

- **Java Development Kit (JDK):** Version 24.0.1 (or higher). It is recommended to use an **OpenJDK** distribution.

- Integrated Development Environment (IDE): IntelliJ IDEA.

-----

## 🛠️ Installation

- Clone the Repository:

```bash
git clone https://github.com/Rafadicandia/Tarea-S1.07.-AnotacionesNivell1.git
```

- IDE Configuration:

Open the file as a Java project.

-----

## ▶️ Execution

- Execute from the IDE
    - Open the main file (the one containing the `main` method).

    - Right-click and select "Run 'Main'".

-----

## 🤝 Contributions

Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.