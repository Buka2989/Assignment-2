# Assignment 2: Vehicle Management System

## Project Overview
The **Vehicle Management System** is a Java console application designed to simulate the management of a group of vehicles. The main purpose of this project is to demonstrate the practical application of 
Object-Oriented Programming principles.

The system allows the creation of specific vehicle types (Cars, Trucks, and Motorcycles) that share common characteristics but behave differently. It also includes a `Driver` class to show how objects can interact
with each other. The program creates a list of vehicles, assigns drivers to them, and executes commands to test their functionality, like starting the engine or displaying details.

## Class Hierarchy

1.  **Vehicle.java**
    This is an `abstract` class. It is a parent class for all vehicles. It has `brand` and `year`. It also has abstract methods `startEngine` and `stopEngine` because every vehicle starts differently.

2.  **Car.java**
    This class extends `Vehicle`. It adds specific things like `doors` (number of doors) and `fuelType` (like Gasoline or Diesel).

3.  **Truck.java**
    This is for big trucks. It extends `Vehicle` too. It has `capacity` (how much weight it can take) and `numAxles`.

4.  **Motorcycle.java**
    This is a bike. It has a boolean `hasSidecar` to check if it has a sidecar or not.

5.  **Driver.java**
    This is a simple class for a driver. It has a name and license number. One driver can drive many vehicles.

6.  **Main.java**
    This is the main class where I test my code. I create objects, put them into an array, and use a loop to show info.

## Instructions to Compile and Run
You can run this code in IntelliJ IDEA or using terminal.
If by terinal:
1. Open the folder with files.
2. Compile the code:
   javac *.java
   java Main

## Screenshots
![img](/docs/screenshots/img.png)

## Reflection Section
Inheritance made the project structure much simpler and cleaner because I did not have to repeat code. Instead of declaring fields like `brand`, `year`, and `driver` separately in every class , I defined them 
once in the `Vehicle` parent class. This reduced code duplication and made it easier to manage the project: if I need to add a new common feature, I only need to change the parent class.
But i have some difficulties with realization due to requirements for Driver about having composition and aggregation at the same time. I'm not sure about this part, because i think there is no composition in my work, 
but i didn't know how to do it.
