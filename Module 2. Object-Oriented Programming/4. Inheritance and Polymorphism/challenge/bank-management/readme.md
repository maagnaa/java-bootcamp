# Summary Assignment: Bank Management

## Requirements
The [requirements](src/requirements.txt) for specified for this assignment are: 

**CHEQUING ACCOUNT**
- A chequing account contains an id, name, and balance.
- A chequing account allows users to deposit or withdraw an amount of money.
- The chequing account charges an overdraft fee of $5.50 if the amount being withdrawn exceeds the account balance.
- The overdraft limit is $200.00 dollars.
- A chequing account is taxable. Income that exceeds $3,000 is taxed 15%.


**SAVINGS ACCOUNT**
- A savings account contains an id, name, and balance.
- A savings account allows users to deposit or withdraw an amount of money.
- Deposits are free, but the savings account charges a $5.00 fee for every withdrawal.

**LOAN ACCOUNT**
- A loan account contains an id, name, and balance.
- A loan account allows users to deposit or withdraw an amount of money.
- A withdrawal can't made if the debt exceeds $10,000.
- Every withdrawal is charged a fixed interest rate of 2%.

**TRANSACTION**
- An account transaction can be: WITHDRAW or DEPOSIT.
- Every transaction has an id, amount, and timestamp.
- Transactions must be sorted based on timestamp. 
- A transaction's timestamp must display to the user as a readable date.

**BANK**
- The bank keeps a record of every account created and transaction made.
- The id of a transaction matches the id of an account. 
- Depending on the account, some transactions may be denied.
- The bank can deduct taxes from taxable accounts.

Additionally, unit tests are required even though not specified in the [requirements file](src/requirements.txt).

<hr>
## Part 1

#### Task 1
>Based on the requirements, identify:
>
>- The abstract class.
>- The children.
>- Fields every child will inherit.
>- Methods every child must override.
>

There will be an abstract class Account, with the following fields (which children will inherit): 
- id 
- name
- balance 

The children of the account class will be: 
- Chequing
- Savings
- Loan

The abstract class will define the following methods for the children to override: 
- withdraw
- deposit

#### Task 2
>Based on the requirements, identify:
>
> - The interface.
> - Classes that implement the interface.    

There will be an interface, Taxable, for accounts which are taxable. Chequing will implement Taxable.

## Part 2

The goal of Part 2 is to create the parent class: [Account](src/main/model/account/Account.java).

1. Create the class and fields.
2. Add constructor and copy constructor.
3. Add getters and setters.
4. Add constructor and copy constructor to every child class.
5. Override toString() method for Account class.
6. Create test objects and print them.
7. Add quality control / throw exceptions where needed.

The format given for the desired toString is:
```java
(className of current object) + "    " +
                                "\t" + id + "" +
                                "\t" + name + "" +
                                "\t$" + balance + "";
```

In order to print the className of the current object we can:
```java
this.getClass().getSimpleName()
```

Part 2 is finished by creating some Account objects in main and printing them to terminal.

## Part 3

- Define abstract methods inside the parent class for the common methods: withdraw and deposit.
- Create appropiate overrides in the children.
- Create [unit tests](src/test/AccountTests.java) that meaningfully test that the method overrides are compliant with requirements.

Things to test:
1. **Withdrawal:** 
    - Applies to: chequing.
    - Basic withdrawal with no fees or interest charges.
    - Withdraw amount: 1140.
2. **Overdraft:** 
    - Applies to: chequing.
    - The chequing account charges an overdraft fee of $5.50 if the amount being withdrawn exceeds the account balance.
    - Withdraw amount: 1534.43.
3. **Overdraft limit:** 
    - Applies to: chequing.
    - The overdraft limit is $200.00 dollars.
    - Withdraw amount: 1726.
4. **Withdrawal fee:** 
    - Applies to: savings.
    - The savings account charges a $5.00 fee for every withdrawal.
    - Withdraw amount: 100.
5. **Withdrawal interest:** 
    - Applies to: loan.
    - Every withdrawal is charged a fixed interest rate of 2%.
    - Withdraw amount: 2434.31.
6. **Withdrawal limit:**
    - Applies to: loan.
    - A withdrawal can't made if the *debt* exceeds $10,000.
    - Withdraw amount: 7463.69.
7. **Deposit:** 
    - Applies to: all children.

## Part 4

> Based on the requirements, Chequing implements a Taxable interface. 
> Add a void tax(double income) method inside Taxable and override it inside Chequing.
> Create a unit test named incomeTax().
>   - Deposit 4000 into the chequing account.
>   - Call tax() for an income of 4,000.
>   - Assert the resulting balance.

