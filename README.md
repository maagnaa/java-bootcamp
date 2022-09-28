# Java Development Bootcamp

This repository contains exercises and progress for [The Complete Java Development Bootcamp @ Udemy](https://www.udemy.com/course/the-complete-java-development-bootcamp/)

##  Content Overview
### Module 1 - Java Fundamentals
1. **Getting Started** 
    - [X] 1 Workbook
    - [X] Summary Assignment
    - Completed 16/09/22
2. **Variables**
    - [X] 5 Workbooks
    - [X] Summary Assignment
    - Completed 16/09/22
3. **Booleans and Conditionals**
    - [X] 7 Workbooks
    - [X] Summary Assignment
    - Completed 19/09/22
4. **Functions**
    - [X] 5 Workbooks
    - [X] Summary Assignment
    - Completed 20/09/22
5. **Loops**
    - [X] 11 Workbooks
    - [X] Summary Assignment - **Game of Pokerito**
    - [X] Summary Assignment - **Game of BlackJack**
    - Completed 20/09/22
6. **Arrays**
    - [X] 14 Workbooks
    - [X] Summary Assignment - **Game of TicTacToe**
    - Completed 23/09/22
7. **Capstone Project** 
    - [X] Module Summary Assignment - **Game of Hangman**
    - Completed 23/09/22

### Module 2 - Object-Oriented Programming
1. **Objects**
    - [X] Workbook: airline-reservation-system
    - [X] Summary Assignment: vending-machine
    - Completed 26/09/22
2. **Debugging and Exception Handling** 
    - [X] 10 Workbooks - Debugging
    - [ ] 4 Workbooks - Exception Handling
    - [ ] Summary Assignment
3. **Unit Testing, Stream API and Lambda Expressons**
    - [ ] Summary Assignment
4. **Inheritance and Polymorphism**
    - [ ] Summary Assignment
5. **Capstone Project** 
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

## 1.3. - Booleans and Conditionals

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
