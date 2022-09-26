## Section 1.2 - Variables 

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

