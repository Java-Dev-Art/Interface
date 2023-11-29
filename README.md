>Create the package entity for entity classes.
Define the mutable class called Euro that represents a financial entity for Euro.

**Class field:**
>value of a financial entity in cents.

>Constructors:

* no-arg constructor,
* parameterized constructors.
**Methods:**

* operations with financial entity;
* toString( ) – returns a string representation of a financial entity in the format d+.dd;
* equals(Object obj) – compares financial entities and returns true if their cents are equal, false
* compareTo(Euro euro) – compares cents and returns a negative integer, zero, or a positive integer as this cents is less than, equal to, or greater than the specified euro.
>Define the superclass called Purchase that represents a product purchase.

**Purchases fields:**
* product name,
* price in Euro,
* number of purchased units.

**Constructors:**
* no-arg constructor,
* parameterized constructor,
* constructor of reading from an instance of the class Scanner.

**Methods:**
* getters/setters;
* getCost( ) – returns the purchase cost in Euro;
* toString( ) – returns a string representation of a purchase in the csv–format: class name and then each non constant field and the purchase cost, separated by the ";" symbol;
* equals(Object obj) – compares names and prices of purchases and returns true if these fields are equal, false

>Define the first subclass for the purchase with a price discount for every unit of the product purchased and override necessary methods.

>Define the second subclass for the purchase with a discount to be presented if the number of purchased units is greater than the given subclass constant. A discount rate is given by the percentage from the purchase cost. Override necessary methods.

>File src\in.txt consists of 6 lines with correct data. Every line contains needed data separated by spaces for 1 object of the superclass or the first subclass or the second one. Every line begins with some identifier of the purchase class, then other data follow.

>The line example for the superclass object:

GENERAL_PURCHASE Milk 140 3

1. Define the Runner class in the default package, where:
2. Create an array for 6 objects.
3. Input data from the given file into the array.
4. Output the array content to the console (one element per line).
5. Output the purchase with maximum cost.
6. Determine whether all purchases are equal.
7. Implement subtasks 2–5 with the single cycle.
>Define the TestRunner class in the default package, where create unit tests for the following functionality:
* class Euro;
* creation of purchase entities;
* methods getCost( ) and equals( ) of purchase entities