# Java Development Bootcamp

This repository contains exercises and progress for [The Complete Java Development Bootcamp @ Udemy](https://www.udemy.com/course/the-complete-java-development-bootcamp/)

Notes and summary of key learnings and takeaways is found below the content overview.

##  Content Overview

### Module 1 - Java Fundamentals
1. [Getting Started](https://github.com/maagnaa/java-bootcamp#11-getting-started) 
    - [X] 1 Workbook
    - [X] Summary Assignment
    - Completed 16/09/22
2. [Variables](https://github.com/maagnaa/java-bootcamp#12-variables)
    - [X] 5 Workbooks
    - [X] Summary Assignment
    - Completed 16/09/22
3. [Booleans and Conditionals](https://github.com/maagnaa/java-bootcamp#13-booleans-and-conditionals)
    - [X] 7 Workbooks
    - [X] Summary Assignment
    - Completed 19/09/22
4. [Functions](https://github.com/maagnaa/java-bootcamp#14-functions)
    - [X] 5 Workbooks
    - [X] Summary Assignment
    - Completed 20/09/22
5. [Loops](https://github.com/maagnaa/java-bootcamp#15-loops)
    - [X] 11 Workbooks
    - [X] Summary Assignment - **Game of Pokerito**
    - [X] Summary Assignment - **Game of BlackJack**
    - Completed 20/09/22
6. [Arrays](https://github.com/maagnaa/java-bootcamp#16-arrays)
    - [X] 14 Workbooks
    - [X] Summary Assignment - **Game of TicTacToe**
    - Completed 23/09/22
7. Capstone Project 
    - [X] Module Summary Assignment - **Game of Hangman**
    - Completed 23/09/22

### Module 2 - Object-Oriented Programming
1. [Objects](https://github.com/maagnaa/java-bootcamp#21-classes-and-objects)
    - [X] Workbook: airline-reservation-system
    - [X] Summary Assignment: vending-machine
    - Completed 26/09/22
2. [Debugging and Exception Handling](https://github.com/maagnaa/java-bootcamp#22-debugging-and-exception-handling) 
    - [X] 10 Workbooks - Debugging
    - Completed 28/09/22
    - [X] 4 Workbooks - Exception Handling
    - [x] Summary Assignment
    - Completed 01/10/22
3. [Unit Testing, Stream API and Lambda Expressons](https://github.com/maagnaa/java-bootcamp#23-unit-testing-stream-api-and-lambda-expressions)
    - [ ] Summary Assignment
4. Inheritance and Polymorphism
    - [ ] Summary Assignment
5. Capstone Project 
    - [ ] Module Summary Assignment

    
# 1. Java Fundamentals

## 1.1. Getting Started

Goals of this section:

- Installing a JDK
- Running my first Java code


### JDK - Java Development Toolkit

JDK stands for Java Development Toolkit and is the software development environment used to develop Java applications. 
It contains dev tools like the interpreter and compiler, as well as the JRE.
JRE stands for Java Runtime Environment and it provides the environment that executes Java code as it is the implementation of the Java Virtual Machine (JVM). 

I am using [Amazon Corretto 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) for this bootcamp.

#### Compiling and running Java Code

- Compile:  &nbsp;&nbsp;&nbsp;&nbsp;  *javac* class.java      
- Runtime:  &nbsp;&nbsp;&nbsp;&nbsp;  *java* &nbsp; class           

Also, to check compiler and/or runtime version: *javac* -version / *java*  -version

#### Notes

- In Java, all code must be contained within a class.
- Every Java app needs a main method as an entry point, but not necessarily every class.
- Class name and corresponding file name must always match exactly.

#### Naming Conventions

- Classes: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CamelCase
- Variables: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;lowerCamelCase
- Functions: &nbsp;&nbsp;&nbsp;&nbsp;lowerCamelCase

## 1.2. Variables 

### Main Data Types

| Type        | Description        |
|-------------|--------------------|
| **int**     | 32b signed integer |
| **long**    | 64b signed integer |
| **double**  | decimal            |
| **String**  | text               |
| **char**    | single character   | 
| **boolean** | true / false       |

#### A note on indexing characters in Java strings
In Java, we dont index characters in strings like in languages where string is considered an array of char. 

```java
String stringVariable = "Hello from my String!";
char char3 = stringVariable[3];
```
The above example is a very big nope!

Instead, we use the **.charAt()** method to index the String variable.
```java
String stringVariable = "Hello from my String!";
char char3 = stringVariable.charAt(3);
```

#### BigDecimal

Also: not covered in this part of the BootCamp is **BigDecimal**. The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, format conversion and hashing. It can handle very large and very small floating point numbers with great precision but compensating with the time complexity a bit.

```java
// Java Program to illustrate BigDecimal Class
  
import java.math.BigDecimal;
public class BigDecimalExample
{
    public static void main(String[] args) 
    {
        // Create two new BigDecimals
        BigDecimal bd1 = 
               new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = 
               new BigDecimal("987654321.123456789");
          
        // Addition of two BigDecimals
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Multiplication of two BigDecimals
        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Subtraction of two BigDecimals
        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Division of two BigDecimals
        bd1 = bd1.divide(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // BigDecima1 raised to the power of 2
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Negate value of BigDecimal1
        bd1 = bd1.negate();
        System.out.println("BigDecimal1 = " + bd1);
    }    
}        
```



### Math Operators

| Operator    | Description     |
|------------ |---------------- |
| **+**       | Addition        |
| **++**      | Add one         |
| **+=**      | Add by          |
| **-**       | Subtraction     |
| **\***      | Multiplication  |
| **/**       | Division        |
| **%**       | Modulus         |

### Other Math Operations

#### Calculating powers

To calculate the result of *a<sup>x</sup>*  

```java
Math.pow(a,x);
```

#### Using π

First import:

```java
import java.lang.Math.*;
```

Then use in code like this:
```java
double area = Math.PI*Math.pow(radius,2);
```

### Typecasting

Typecasting a decimal double value to an integer:
```java
int integerValue = (int)decimalValue;
```
Typecasting int to string:
```java
String integerValueOfString = String.valueOf(integerValue);
```
### Scanner

To await input (eg. from system or command line)
```java
import java.util.Scanner;

public class getUserName{

  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your name:");
    String nameInput = scan.nextLine();
    
    scan.close();
  }

}
```

#### Scanner Methods

- .nextLine()
- .nextDouble()
- .nextLong()
- .nextInt()

#### The .nextLine() trap
- .nextLine() gets skipped if directly after any of the other scanner methods. 
- This happens because the other methods do not read the newline that is created when created when eg. a user writes '5' and presses enter as an input to the .nextLine() scanner method. 
- The solution is to *add an extra .nextLine()* ahead of the desired .nextLine().

#### Making scanner available to functions within class
Declare the scanner variable as a static variable within the class, but outside the main method.

```java
import java.util.Scanner;

public class InteractiveApp {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
      // Code implementing the main method, may ask the user something using scanner
    }
    
    public static int[] askUserInpu(char[][] board){
      // Code implementing a method that also asks the user something using scanner
    }
}
```

## 1.3. Booleans and Conditionals

### Comparison Operators

| Operator  | Description               |
|-----------|---------------------------|
| >         | Greater than              |
| <         | Less than                 |
| >=        | Greater than or equal to  |
| <=        | Less than or equal to     |
| ==        | Equal to                  |
| equals    | String equality           |
| !equals   | String inequality         |

### Logical Operators

| Operator | Description |
|----------|-------------|
| &&       | Logical And |
| \|\|     | Logical OR  |
| !        | Logical NOT |

#### A note on comparing strings
```java
String userKey = "Potato728";
String sysKey  = "Carrot728";

// To check for string equality
boolean result1 = userKey.equals(sysKey);  // Evaluates FALSE

// To check for string inequality
boolean result2 = !userKey.equals(sysKey);  // Evaluates TRUE

```


### Flow Control

#### If-Else Syntax
```java
if(condition1){
    // Code to execute 
 }else if(condition2){
    // Code to execute 
 }else{
  // Default code to execute
 }

```
#### Conditional Assignment
```java
variable = (comparison) ? (value1) : (value2)
```
If comparison evaluates true, variable is assigned the value of value1.
If comparison evaluates false, variable is assigned the value of value2.

#### Case/Switch Syntax
```java
switch(varToEvaluate){
  case value1 :
      // Code to execute
      break;
  case value2 :
      // Code to execute
      break;
  case value3 :
      // Code to execute
      break;
  default :
      // Default code to execute
}

```


##  1.4. Functions

Not a lot to be said about functions specifically for Java that is not intuitively similar to other languages.
However, some random notes/stuff I learned from workbooks

### Exiting a method with error

```java
  System.exit(status: 0);
```

### Sleeping
```java
try{
  Thread.sleep(150); // Time in ms
}
catch(InterruptedException e){
  System.out.println(e);  // Or some other handling of e
}
```

### Generating random numbers

#### One Alternative
```java
  double randomNumber = Math.random*13;
  int randomIntNumber = (int)randomNumber;
```

In this example we want to obtain a random integer number between 0 and 13.
Math.random produces a random decimal value (double) between 0 and 1, so we multiply the result with 13 to scale the output of Math.random appropiately.
We then store the value as an integer by way of typecasting.

#### Another Alternative
```java
  import java.util.concurrent.ThreadLocalRandom;
```
```java
  int a = ThreadLocalRandom.current().nextInt(origin,bound);
```

In this example we generate a pseudorandom integer between the value of origin (inclusive) and bound (exclusive).


## 1.5. Loops

### For-loop Syntax
```java
  for(int i=0; i<10; i++){
    // Code to run 10x
  }
```
### While-loop Syntax
```java
  while(condition){
    // Code to run as long as condition is true
    
    if (breakCondition){
      condition = false; 
     }
}
```
### Do-While loop Syntax
```java
  do{
    // Code to execute at least once
    // Condition update statement
  }while(condition);

```

## 1.6. Arrays

### Declaring an array
```java
  Type[] array = { element1, element2, etc..}
```
```java
  Type[] array = new Type[3]
```

- In the first example we declare and populate in one line.
- In the second we only declare the array, but we must constrain the size of the array.

### Getting an arrays length
```java
  arrayVar.length
```
### Copying an array
```java
  int[] userCards = new int[2];
  int lengthUserCards  userCards.length;
  
  userCards = Arrays.copyOf(userCards, lengthUserCards+1);
```
Example where we use copyOf in order to increase array size.

### Two-Dimensional arrays
```java
  double[][] prices = {
    { 2.99, 1.67, 3.82, 1.99}, // Row 1
    { 1.49, 5.76, 2.83, 9.19}, // Row 2
    { 8.99, 7.49, 1.76, 6.66}, // Row 3
  };
```

```java
  prices.length     // Gives the number of rows (3)
  prices[i].length  // Gives the number of columns (4)
```

# 2. Object-Oriented Programming

## 2.1 Classes and objects

### Some definitions...

An **object** is an entity that can be distinctly identified. They consist of methods and objects to make a particular type of data useful.

An object consists of:

- A unique **identity**, even if the state is identical to the state of another object.
- **State/Properties/Attributes** that describe the object.
- **Behaviour** which tells us what the object does.

A **class** can be defined as a blueprint from which an individual object can be created.
A **field** is a class variable that describes the object.
An **action** is a method that represents what the object can do.

When a class has fields, it needs at least the following methods:
1. **Constructor** - to update the fields of a new object.
2. **Getters** - to get the values of private fields.
3. **Setters** - to set the values of private fields.

### Access modifiers

- **Access modifiers** are keywords that set the accesibility of classes, methods and other members.
- These keywords determine whether a field or method in a class can be used or invoked in another method from another class or sub-class.
- Access modifiers can be used to restrict access.

In Java there are 4 types of access modifiers.
1. **Default aka. "package-private"**
    - To make all members within a package visible, but only accesible within the same package.
2. **Public**
    - Allows a class, method or data field to be accesible from any class or package in a Java program.
3. **Private**
    - Lowest accessibility level. 
    - Methods and fields declared as private are not accessible outside the class.
    - Private entities are not even visible to the subclasses of the class.
    - To access private variables we use getter and setter methods.
4. **Protected**
    - Like default, except, in addition to being accesible within the same package, methods and data members are also accessible from subclasses.
        
### A very very simple example to show syntax
```java
// Class Declaration
public class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;
    
    // Constructor Method
    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    
    // Copy Constructor
    public Dog(Dog source){
        this.name = source.name;
        this.breed = source.breed;
        this.age = source.age;
        this.color = source.color;
    }
    
    // Getter Methods
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public String getAge(){
        return this.age;
    }
    public String getColor(){
        return this.color;
    }
    
    // Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    // toString method
    public String toString(){
        return (    " Dog name: "   + this.name     + "\n" +
                    " Breed: "      + this.breed    + "\n" +
                    " Age: "        + this.age      + "\n" +
                    " Color: "      + this.color    + "\n" );
    }
}
    
```

Then from elsewhere in app we can:
``` java
Dog nimi = new Dog("Nimi","Kleinspitz",1,"White");
System.out.println(nimi.toString());
```
### Reference Traps
|               | Reference Traps                                                       |
|---------------|-----------------------------------------------------------------------|
|               |                                                                       |
| **Trap**      | Setting an array variable equal to another.                           |
| **Pitfall**   | Both variables share a reference to the same array.                   |
| **Solution**  | Use Arrays.copyOf() to create a copy of the array.                    |
|               |                                                                       |
| **Trap**      | Setting an object variable equal to another.                          |
| **Pitfall**   | Both variables share a reference to the same object.                  |
| **Solution**  | Create a *new* copy of the object with a copy constructor.            |
|               |                                                                       |
| **Trap**      | Getter returns an array field directly.                               |
| **Pitfall**   | The outside variable and field share a reference to the same array.   |
| **Solution**  | Return a copy of the array using Arrays.copyOf().                     |
|               |                                                                       |
| **Trap**      | Getter returns an object directly.                                    |
| **Pitfall**   | The outside variable and field share a reference to the same object.  |
| **Solution**  | Return a *new* copy of the object.                                    |

## 2.2 Debugging and Exception Handling

This section is split in two:
- Section 2.2.1 - Debugging. 
- Section 2.2.2 - Exception Handling.

Section 2.2.1 was mostly just exercises in using breakpoints and fixing code with issues. :) Not a lot to say about that. 

## Exception Handling

In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. This is generally an unexpected or unwanted event which can occur either at compile-time or at run-time in application code.

The classs at the top of the exception class hierarchy is the **throwable** class, which has two direct subclasses - **Error** and **Exception**.

![Throwable Hierarchy](https://github.com/maagnaa/java-bootcamp/blob/master/assets/java-exceptions-hierarchy-example.png)

An error indicates a **serious problem that a reasonable application should not try to catch**. These are problems that the application cannot recover from and are dealt with by changing the code to avoid them. 

An example with a method that calls itself recursively until it reaches the maximum size of the Java thread stack and subsequently exits with a **StackOverflowError**:

```java
public static void print(String myString) {
    print(myString);
}
```
```java
Exception in thread "main" java.lang.StackOverflowError
at StackOverflowErrorExample.print(StackOverflowErrorExample.java:6)
```
This method throws the error during execution, and the error is not handled in code. It would not make sense to try to handle it because the application cannot recover from such an error, as when it occurs the maximum thread stack size has already been reached. Instead the application exits and throws the error.

Exceptions on the other hand indicate **conditions that a reasonable application might want to catch**. 

Exceptions may be classified as:
- **Checked Exceptions**: Problems that occur at compile time. Must be explicitly checked and handled in code.
- **Unchecked Exceptions**: Problems which occur during run-time. Results from badly written code and should not be catched, rather, the code must be fixed.

### Checked Exceptions

In general, checked exceptions represent errors outside the control of the program. For example, the constructor of FileInputStream throws FileNotFoundException if the input file does not exist.

Java verifies checked exceptions at compile-time.

##### Example 1: FileNotFound Exception (++ also how to read files with Java)
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Greetings.txt");
            Scanner scan = new Scanner(fis);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }        
    }
}

```
If we wanted to do the same as in the code above, but from a function, we could either try-catch the exception inside the function or specify that the function can throw the exception and force the code that calls the function to handle the exception.
```java

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesTwo {
    public static void main(String[] args) {
        try{
            loadData("Greetings.txt");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void loadData(String name) throws FileNotFoundException {
            FileInputStream fis = new FileInputStream(name);
            Scanner scan = new Scanner(fis);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
    }

}
```
##### Example 2: MalformedURLException 
```java
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/images");
            System.out.println("Protocol: \t"+url.getProtocol());
            System.out.println("Host: \t\t"+url.getHost());
            System.out.println("Path: \t\t"+url.getPath());
        }catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
}
```
```java
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLTwo {
    public static void main(String[] args) {
        try{
            parseURL("https://www.google.com/images");
        }catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void parseURL(String link) throws MalformedURLException {
            URL url = new URL(link);
            System.out.println("Protocol: \t"+url.getProtocol());
            System.out.println("Host: \t\t"+url.getHost());
            System.out.println("Path: \t\t"+url.getPath());
    }    
}
```


### Unchecked Exceptions
If a program throws an unchecked exception, which is an exception that happens during runtime, it reflects either some error inside the program logic or that something is missing from the code. If something is missing, it might for example be that appropiate checks need to be put in place to make sure corrective action is taken when something (for example a variable or input) is not what we expected.

For example, if we divide a number by 0, Java will throw ArithmeticException:

```java
private static void divideByZero() {
    int numerator = 1;
    int denominator = 0;
    int result = numerator / denominator;
}
```

Java does not verify unchecked exceptions at compile-time. Furthermore, we don't have to declare unchecked exceptions in a method with the throws keyword. And although the above code does not have any errors during compile-time, it will throw ArithmeticException at runtime.

In fact, *never catch an unchecked exception*, instead **fix the code**.

Other common unchecked runtime exceptions:

- ArrayIndexOutOfBoundsException
- NullPointerException
- IllegalArgumentException
- InputMismatchException

##### Example 1: ArrayIndexOutOfBoundsException
```java
public class RuntimeException1 {
    public static void main(String[] args) {
        int[] array = new int[3];

        // Trying access the 6th element of an array that only stores 3 elements.
        System.out.println(array[5]);   
    }
}
```
Results in:
```java
>>  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
>>          at RuntimeException1.main(RuntimeException1.java:5)
```

##### Example 2: NullPointerException
Happens when we try to access (dot syntax) from a null.

```java
public class RuntimeException2 {
    public static void main(String[] args) {
        String word = null;
        
        word.toLowerCase();
    }
}

```
Results in:
```java
>>  Exception in thread "main" java.lang.NullPointerException  
>>          at RuntimeException2.main(RuntimeException2.java:5)
```

One way to manage this exception - other than assigning a non-null value to the word String - could be:

```java
public class RuntimeException2 {
    public static void main(String[] args) {
        String word = null;
        
        if(word==null){
            System.out.println("The word is null.");
        }else{
            word.toLowerCase();
        }
    }
}
```

Then the result becomes:
```java
>>  The word is null.
```

Observe that in this case we are using the "==" operator on the word variable to check if it is equal to null.
Should we instead try to use word.equals(null), which is the method we usually use to check String equality, then this method too would cause a NullPointerException! 

##### Example 3: InputMismatchException

InputMismatchException can for example happen when the user enters a value that Scanner isnt expecting.

Given the code:
```java
import java.util.Scanner;
public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        System.out.println(scan.nextInt());
        scan.close();
    }
}
```
The code asks the user to enter a number. If the user instead enters a string, then it results in:
```java
>>  Please enter a number: fra
>>  Exception in thread "main" java.util.InputMismatchException
>>          at java.base/java.util.Scanner.throwFor(Scanner.java:939)
>>          at java.base/java.util.Scanner.next(Scanner.java:1594)
>>          at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
>>          at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
>>          at RuntimeException3.main(RuntimeException3.java:6)
```
The code can be improved to be resilient against this sort of exception like this:
```java
import java.util.Scanner;
public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Please enter a number: ");
            if(scan.hasNextInt()){
                System.out.println(scan.nextInt());
                break;
            }else{
                scan.nextLine();
                System.out.println("That is not a number.");
            }
        }
        scan.close();
    }
}

```
We should check if the user actually inputs valid data and take corrective action if they dont, rather than allowing the app to crash when there is an input mismatch! This also means that most of my code for Module 1 needs to be fixed, as I havent implemented these checks earlier. :) 

#### Throwing Unchecked Exceptions

Its important to throw unchecked exceptions to mantain quality control. This forces the caller to improve their code.

Some common situations:

- Throw an **IllegalArgumentException** if the caller passes illegal values into a method/constructor.
- Throw an **IllegalStateException** if the caller invokes a method at a time when the object is not in a valid state.

##### Example 1: Throwing an IllegalArgumentException
Given the following constructor method:
```java
public Employee(String name, String position) {
    this.name = name;
    this.position = position;
}
```
A caller might use the constructor like this:
```java
Employee stocker = new Employee("   ", null);
Employee assisManager = new Employee("Nicholas", "     ");
Employee manager = new Employee(null, "      ");
```
Resulting in rubbish employee objects that do not reflect any meaningful data. The constructor must include checks to quality control the arguments as much as possible.

To improve the constructor method, we check if any or the arguments is null or blank. If either argument is null or blank, we throw an IllegalArgumentException using the **new** keyword.
```java
public Employee(String name, String position) {
    if(name == null || name.isBlank() || position == null || position.isBlank()){
        throw new IllegalArgumentException("Name or position cannot be null or blank.");
    }
    this.name = name;
    this.position = position;
}
```
Now if the constructor is used in the same way as in the second snippet of this example, the app will crash and result in:
```java
>>  Exception in thread "main" java.lang.IllegalArgumentException: Name or position cannot be null or blank.
>>          at models.Employee.<init>(Employee.java:9)
>>          at Main.main(Main.java:6)
```
This exception gives a meaningful message which can help the developer identify what is wrong with their code and improve it.

##### Example 2: Throwing an IllegalStateException
We need to throw an IllegalStateException if an object isnt properly initialized before calling a method.

Given this class describing a store:
```java
public class Store {
    Employee[] employees;

    public Store() {
        employees = new Employee[3];
    }

    public void setEmployees(int index, Employee employee) {
        this.employees[index] = new Employee(employee);
    }

    public void open() {
        System.out.println("We're open for business!");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i] != null ? employees[i].toString() : "";
            temp += "\n";
        }
        return temp;
    }

}
```

In our app, we declare a Store object and call the .open() method.
```java
Store store = new Store();
System.out.println(store);
store.open();
```

We have now opened the store object without initializing the employees array with any meaningful content.

Assuming that the store object **should not be opened** unless it is staffed by 3 employees, we should change the .open() method so that it checks that none of the Employee objects in the employees array is null. If any is null, we throw an IllegalStateException to indicate that the store object has not been properly initialized.

```java
public void open() {
    for(int i=0; i<employees.length;i++){
        if(employees[i] == null){
            throw new IllegalStateException("The store cannot be opened unless it is staffed by three employees.");
        }
    }
    System.out.println("We're open for business!");
}
```
If we are going to properly open the store, we then need to do it like this from the app code:
```java
Employee stocker = new Employee("Magna", "Stocker");
Employee assisManager = new Employee("Nimi", "Assistant Manager");
Employee manager = new Employee("Pus", "Manager");

Store store = new Store();
store.setEmployees(0, stocker);
store.setEmployees(1, assisManager);
store.setEmployees(2, manager);

System.out.println(store);
store.open();        
```

### Mutable and Immutable Objects

- **Immutable Objects** are objects that, once created, always represent the same value. 
- **Mutable Objects** are objects that have methods to change the value of the object.

A nice reference I found on this topic: ![Mutability & Immutability](https://web.mit.edu/6.005/www/fa16/classes/09-immutability/)

#### Mutable Objects

- Another name for a setter method is mutator method.
- It follows that objects with setter methods are mutable objects: their value can be changed after creation. 


```java
Car car = new Car("Nissan", 10000);
car.setMake("Honda");
```

#### immutable Objects
- Objects whose state is impossible to update after creation. 
- Eg. object will all-private fields and no setters/mutators.

### Wrapper Classes

>A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.


```java
int         mutableWholeNumber      = 5;                    // Primitive. No methods, cannot be null.
Integer     immutableWholeNumber    = Integer.valueOf(5);   // Wrapper around int. Stores a ref. to the integer value. 
```
![wrappermethods](/assets/wrapper_methods.PNG)


**Autoboxing:** Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. \
For example: conversion of int to Integer, long to Long, double to Double etc.

**Unboxing:** The reverse of autoboxing. For example: conversion of Integer to int, Long to long, Double to double, etc. 

##### When to use primitive vs. wrapper
- Primitives take up less space and are faster.
- Use Wrapper only when absolutely necessary. Eg. when:
    - The variable needs to be nullable.
    - The variable must be able to call a method.

### ArrayList
Since usually arrays need to be constrained and cannot be updated without creating a new array with a new size constraint...

ArrayList:
- Is resizable. Can add or remove elements.
- Can only store **objects**. It cannot store primitives.

```java
import java.util.ArrayList;
```
```java
ArrayList <class type> collection = new ArrayList<class type>();    // *< >* denotes a generic 
                                                                    // It can only accept class types (never primitives).
```

#### Example usage

```java
import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Magna");
        names.add("Pus");
        names.add("Nimi");
        names.add("Katrine");
        names.add("Frank");                             

        for(int i=0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        names.set(0, "Magna the Mindblown"); 
        names.remove(1);                        // Remove item at index 1. Pus has left the game.
        names.clear();                          // Clear the whole ArrayList. 
    }
}
```

## 2.3 Unit Testing, Stream API and Lambda Expressions

In the context of unit testing, the smallest testable parts of an application are considered units.
*Unit testing is a testing methodology where every single unit has a test.*
A prerequisite is to have appropiately modularized code. Code which isn't modular performs too many tasks at once and is harder to test.

### Test Driven Development

Writing tests before writing code. Aka. the dream! 

Steps:
1. Identify meaningful testcases.
2. Write a unit test for each case.
3. Write the code and test it.

#### A super simple example 

We have the following requirement for a app that performs a checkout:
>During checkout, the app returns a receipt that includes a subtotal, tax, and total.
The tax rate is 13%.

From this, we identify the following testcases:
1. Check that the subtotal equals the sum of each price.
2. Check that the tax equals 13% of the subtotal.
3. Check that total = subtotal + tax.

To begin with, the Main class looks like this:
```java
package src.main; // We need to provide a package that the test class can import

public class Main {
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {   
    }
}
```
So far, no functionality has been implemented, but we can see the array of prices. 
With the prices, we can find the values the testcases need to check for.

We start with the first testcase we identified by calculating the expected value of the subtotal.

Subtotal = 2.23 + 1.32 + 4.32 + 11.33 **= 19.2**

We create the following test class:
```java
package src.test;

import org.junit.Test;
import src.main.Main;

public class checkoutTest{
    @Test
    public void subtotalIsValid(){
        assertEquals(19.2, Main.getSubtotal());  // 1st argument is expected value, 2nd argument is actual
    }
}
```
Now that we have written the testcase, we see that we need to create a function in Main called getSubtotal.
First, we write the function code so that the test will fail deliberately:

```java
 public static double getSubtotal(){
        return 0;
    }
```
We run the test to check that it fails as expected:
![intro-unit-testing-1](/assets/intro-unit-testing-1.PNG)

Then we can start developing the actual implementation of getSubtotal().
During development we can run the test as many times as we need, until we know we have a solution that is correct.

```java
public static double getSubtotal(){
        double temp = 0;
        for(int i=0; i<prices.length; i++){
            temp += prices[i];
        }
        return temp;
    }
```
![intro-unit-testing-2](/assets/intro-unit-testing-2.PNG)

We can now move on to the next testcases. We iterate the same steps for each testcase:
1. Identify the requirement and write the testcase.
2. From the testcase, find out what methods/logic we need to create for the application.
3. Write first code that causes the testcase to fail.
4. Write so code that implements the desired logic, and test until the testcase passes.

When these steps have been implemented for testcases 2. and 3., the checkoutTest class looks like this:
```java
package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import src.main.Main;

public class checkoutTest{
    @Test
    public void subtotalIsValid(){
        assertEquals(19.2, Main.getSubtotal());
    }

    @Test
    public void taxIsValid(){
        assertEquals(2.50, Main.getTax(19.2));
    }

    @Test
    public void totalIsValid(){
        assertEquals(21.7, Main.getTotal(19.2,2.50));
    }
}
```

And the main class looks like this:
```java
package src.main;

import java.text.DecimalFormat;

public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};
    static DecimalFormat formatter = new DecimalFormat("#.##");

    public static void main(String[] args) {   

    }

    public static double getSubtotal(){
        double temp = 0;
        for(int i=0; i<prices.length; i++){
            temp += prices[i];
        }
        return temp;
    }

    public static double getTax(double subtotal){
        return Double.parseDouble(formatter.format(subtotal*0.13));
    }

    public static double getTotal(double subtotal, double tax){
        return Double.parseDouble(formatter.format(subtotal+tax));
    }
}
```
We can see that all tests are passing and we are happy with the solution!

![intro-unit-testing-3](/assets/intro-unit-testing-3.PNG)

### Streams and Lambda Expressions
** **THIS SECTION IS WIP AND NEEDS TO BE RESTRUCTURED TO BE A BIT MORE DIDACTIC** **

Streams are wrappers around a data source, allowing us to operate with that data source and making bulk operations convenient and fast. 

A use case for streams is, for example, to do operations on an ArrayList without having to loop through said ArrayList explicitly. 

##### Use case example:
Given the following class Filter:
```java
import java.util.ArrayList;

public class Filter {
    static ArrayList<Double> prices = new ArrayList<Double>();
    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);
        filterLowPrices();
    }

    public static void filterLowPrices() {
        System.out.println("\n\nLOW PRICES");
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                System.out.println(prices.get(i)); 
            }
        }
    }
}
```
The function filterLowPrices loops through every element of the array and prints the values that are less than 5.

We can do the same using streams like this:
```java
import java.util.ArrayList;
import java.util.stream.*;

public class Filter {
    static ArrayList<Double> prices = new ArrayList<Double>();
    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        prices.stream()                         // Treat prices as a stream
            .filter((price) -> {                // Intermediate Operation
                return price < 5;
            })
            .forEach((price) ->{                
                System.out.println(price);      // Terminal Operation
            });
    }
}
``` 

So whats going on here?
- First we treat prices as a stream, using prices.stream()
- Directly below we have the pipeline, consisting of:
    1. One intermediate operation. 
        - An intermediate operation processes the sequence of elements and then continues the pipeline.
            - In this case, the intermediate operation is .filter(*lambda expression*). 
            - We filter the prices which are less than 5 and discard the rest. This is determined by the lambda expression inside .filter(). 
            - The updated sequence of prices then continues through the pipeline.

    2. One terminal operation.
        - A terminal operation ends the pipeline and may return a final value.
            - In this case, the terminal operation is .forEach(*lambda expression*).
            - The lambda expression of forEach recieves each value from the updated sequence of elements coming from the previous operation in the pipeline.
            - In this case, we print all the filtered values.

#### Lambda expression syntax

- The name of the '**->**' in the lambda expression is **arrow token**.
- The body of a lambda expression can contain zero, one or more statements.
- When there is a single statement in the body of the lambda expression, curly brackets are not mandatory and the return type is the same as that of the body expression.
- When there are more than one statements, then these must be enclosed in curly brackets (a code block) and the return type is the same as the type of the value returned within the code block, or void if nothing is returned.

```java
// Lambda expression with one parameter and a multi-line body
((parameter) -> {
  // Body of lambda expression
  // Code goes here
})
```
```java
// Lambda expression with one parameter and a single line body
((parameter1) -> /*Single line body*/)
```
```java
// Lambda expression with multiple parameters
((parameter1, parameter2) -> {          
  // Body of lambda expression
})
```


An alternative syntax for the lambda expressions in the example we looked at before is:
```java
        prices.stream()                                             
            .filter((price)     -> price < 5)                       
            .forEach((price)    ->  System.out.println(price));     
```

#### More Streams Operations

In the streams-starter lesson, following pipeline operations are introduced:
- .filter() : filters based on predicate
- .foreach() : does something for each element in the sequence
- .map() : updates and returns every element coming into that step of the pipeline      
- .collect() : terminal operation that returns the updated sequence of elements at the end of the pipeline

#### From workbooks:
- .anymatch() : returns a boolean if there is a match
- .findFirst().orElse() : terminal operation that returns first match (depending on previous pipeline step). Returns value within orElse() if no match is found (eg. null/false)

Also used map to access an element in object instead of just updating the element value coming into that step of the pipeline.

From movie-store workbook:
```java
public boolean movieIsAvailable(String movieName){
        return this.movies.stream()
                .filter(movie -> movie.getName().equals(movieName)) // First find element that has a name that matches the movieName parameter
                .map(movie -> movie.isAvailable()) // Use map to access isAvailable field
                .findFirst().orElse(false);  // Find and return the first match, else return false                              
    }
```
