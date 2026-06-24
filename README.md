# Vehicle Rental System

A console-based Vehicle Rental System developed in Java as part of a university OOP project.

## Features

* Manage Cars, Trucks, and Motorcycles
* Register and manage customers
* Rent vehicles for a specified number of days
* Return rented vehicles
* Automatic rental cost calculation
* 10% discount for rentals of 7 days or more
* View all rental agreements
* Display all vehicles or only available vehicles

## Object-Oriented Concepts Used

### Inheritance

* `Car` extends `Vehicle`
* `Truck` extends `Vehicle`
* `Motorcycle` extends `Vehicle`

### Polymorphism

* Vehicle information is displayed through overridden `displayInfo()` methods.

### Composition & Aggregation

* `RentalShop` manages vehicles, customers, and rental agreements.
* `RentalAgreement` connects customers and vehicles.

## Project Structure

```text
Main.java
Menu.java
RentalShop.java
Vehicle.java
Car.java
Truck.java
Motorcycle.java
Customer.java
RentalAgreement.java
CostCalculator.java
diagram_class.mmd
diagram_rent_flowchart.mmd
PROJECT_DOCUMENTATION.md
```

## How to Compile

```bash
javac *.java
```

## How to Run

```bash
java Main
```

## Sample Workflow

1. View available vehicles
2. Register a customer
3. Rent a vehicle
4. Generate rental agreement
5. Return vehicle
6. View all agreements

## Pricing

```text
Total Cost = Daily Rate × Number of Days
```

For rentals of 7 days or more:

```text
10% Discount Applied
```

## Technologies

* Java
* Object-Oriented Programming
* Console-Based Interface

## Author

Amaan Nizam

THWS – Mechatronics Engineering
