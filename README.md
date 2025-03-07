# 1.8-Lambdas-Nivell1
This repository contains solutions to several exercises demonstrating the use of Java 8 Lambdas and Streams API.

**Requirements**
- Java 8 or higher is required to run the code as it uses features introduced in Java 8, including Lambdas and Streams.

**Exercises Overview**
- **_Exercici 1:_**
    * Task: Given a list of strings, write a method that returns a list of all strings containing the letter ‘o’. Print the result.
    * Java 8 & API Usage: Uses .stream(), .filter(), and .collect(Collectors.toList()), which are part of the Streams API.
- **_Exercici 2:_** 
    * Task: Similar to the previous exercise, but now the method should return a list with strings containing the letter ‘o’ and having more than 5 letters. Print the result.
    * Java 8 & API Usage: 
- **_Exercici 3:_**
    * Task: Create a list of the names of the months of the year. Print all the elements of the list using a lambda expression.
    * Java 8 & API Usage: Uses forEach(), which is introduced in Java 8 and supports both lambdas and method references.
- **_Exercici 4:_**
    * Task: Print the elements of the list using method reference instead of a lambda expression.
    * Java 8 & API Usage: Uses forEach(), which is introduced in Java 8 and supports both lambdas and method references.
- **_Exercici 5:_**
    * Task: Create a Functional Interface with a method called getPiValue() that returns a double. Instantiate the interface in the main class, assign the value 3.1415, invoke getPiValue(), and print the result.
    * Java 8 & API Usage: Uses a Functional Interface and a lambda expression to implement the getPiValue() method.
- **_Exercici 6:_**
    * Task: Create a list with numbers and strings, then sort the list by string length from shortest to longest.
    * Java 8 & API Usage: Uses .stream(), .filter(), .map(), .sorted(), and .collect(Collectors.toList()), all of which are part of Java 8’s Stream API.
- **_Exercici 7:_**
    * Task: With the list from the previous exercise, sort it in reverse order (longest string to shortest).
    * Java 8 & API Usage: Uses .stream(), .filter(), .map(), .sorted(), and .collect(Collectors.toList()), all of which are part of Java 8’s Stream API.
- **_Exercici 8:_**
    * Task: Create a Functional Interface with a method called reverse(). This method should receive and return a String. In the main method, use a lambda expression to reverse a string and print the result.
    * Java 8 & API Usage: Uses a Functional Interface and a lambda expression, which is a key feature of Java 8.
