# Return Ready Lab 16

* Part A - Foundations 7.1
* Part B - Foundations 7.2
* Part C - TDD

## Part A

>Exercise 01 in the lecture slides requires we have Java FX installed, so we will not be doing that activity.

>JavaFx is not used alot, and is slowly falling to the way side. Its not even included in every version of the Java Development Kit. We installed a version of the JDK that does not include FX.

### UML

**The Unified Modeling Language (UML)** is a general-purpose, developmental, modeling language in the field of software engineering that is intended to provide a standard way to visualize the design of a system.

**Classes**: A template for creating objects and implementing behavior in a system. In UML, a class represents an object or a set of objects that share a common structure and behavior. They're represented by a rectangle that includes rows of the class name, its **properties** (attributes), and its **behaviors** (operations).

![](./assets/img01.png)

* **Properties** - are the values your object will store.
* **Behaviors** - are the actions your object can perform.

### Example 01 Person

![](./assets/img02.png)

The person class contains properties and behaviors:

* Properties ( Things the object stores )
	* name
	* age
	* address
* Behaviors (Things the object can do )
	* greet
	* tellJoke  

Take a look at the `Person` class in `part_a.examples.account.example01`

1. Comment each line of code, and review with class.
2. Run `PersonTest` and see if what you expected to happen matches up.


### Example and Activity 02

Below is the UML for the `SavingAccount` class in the `part_a.examples.account.example02` package.

![](./assets/img03.png)

1. Write comments for each line in `SavingAccount` and review with class.
2. In the `part_a.activities.account.exercise02` finish the `CheckingAccount` class based on the UML below
	* ![](./assets/img04.png)

3. Complete `CheckingAccountTest` look at `SavingAccountTest` for inspiration.


### Actvity 3

* In the `part_a.activities.account.exerise03` package complete `SavingBond` with the following requirements.
	* A person may purchase a bond for any term between 1 and 60 months
	* A bond earns interest every month until its term matures (0 months remaing)
	* The term and interest rate are set at the same time
	* The bond's interest rate is based on its term according to the following tier system.

	
	![](./assets/img05.png)
	
## Part B

Use this table to generate the UML for Prisoner with [Draw.io](https://app.diagrams.net/)

| Property | Type |
| -------- | ---- |
| name | String|
| height | String |
| sentence | Integer |

* Complete the exercises in class

## Part C

### Test Driven Development (TDD)

### What is a unit test?

* A `unit test` is a practice by which `small units of code` are tested.
* The purpose of a unit test is to determine if a feature being tested is fit for use in other parts of an application.
* It is considered best practice to test every method in an application with at least 2 sets of arguments.
* Tests are typically expressed as a combination of three clauses:
	* `Given` some context
	* `When` some action is carried out
	* `Then` consequences should be observable

### Example

```java
// Given
String name = "Tariq";
Integer age = 43;
Person person = new Person(name, age);

// When
String actuaName = person.getName();
Integer actualAge = person.getAge();

// Then
Assertertions.assertEquals(name, actuaName);
Assertions.assertEquals(age, actualAge);
```


### What are the three clauses of a test?
#### Given (some context)
* `Given` is the section of a unit test method that
	* initializes, instantiates, or sets the value of data to pass to test method.

* **Example**

```java
// Given
String name = "Tariq";
Integer age = 43;
Person leon = new Person(name, age);
```

#### When (some action is carried out)
* `When` is the section of a unit test method that
	* invokes the method with the previously arranged parameters

```java
// When
String actuaName = person.getName();
Integer actualAge = person.getAge();
```


#### Then (consequences should be observable)
* `Then` is the section of a unit test method that
	* verifies that the method to be tested behaves as expected

```java
// Then
Assertertions.assertEquals(name, actuaName);
Assertions.assertEquals(age, actualAge);
```

## Assignment

* **Objective:**
    * To create tests that ensure expected behavior of each class:
        * Cat
        * Dog
        * AnimalFactory
        * CatHouse
        * DogHouse
* **Purpose:**
    * To establish familiarity with Test-Driven-Development (TDD) practices.

#### CatTest

* Create tests for `void setName(String name)`
    * ensure that when `.setName` is invoked on an instance of `Cat`, the `name` field is being set to the respective value.
* Create tests for `setBirthDate(Date birthDate)`
    * ensure that when `.setBirthDate` is invoked on an instance of `Cat`, the `birthDate` field is being set to the respective value.
* Create tests for `String speak()`
    * ensure that when `.speak` is invoked on an instance of `Cat`, the value `"meow!"` is returned.
* Create tests for `void eat(Food food)`
    * ensure that when `.eat` is invoked on an instance of `Cat`, the `numberOfMealsEaten` is increased by 1.
* Create tests for `Integer getId()`
    * ensure that when `.getId` is invoked on an instance of `Cat`, the respective `id` value is returned.
* Create test to check Animal inheritance; google search `java instanceof keyword`
    * ensure that a `Cat` is an `instanceof` an Animal 
* Create test to check Mammal inheritance; google search `java instanceof keyword`
    * ensure that a `Cat` is an `instanceof` a Mammal

#### DogTest
* Create tests for `void setName(String name)`
    * ensure that when `.setName` is invoked on an instance of `Dog`, the `name` field is being set to the respective value.
* Create tests for `setBirthDate(Date birthDate)`
    * ensure that when `.setBirthDate` is invoked on an instance of `Dog`, the `birthDate` field is being set to the respective value.
* Create tests for `String speak()`
    * ensure that when `.speak` is invoked on an instance of `Dog`, the value `"bark!"` is returned.
* Create tests for `void eat(Food food)`
    * ensure that when `.eat` is invoked on an instance of `Dog`, the `numberOfMealsEaten` is increased by 1.
* Create tests for `Integer getId()`
    * ensure that when `.getId` is invoked on an instance of `Dog`, the respective `id` value is returned.
* Create test to check Animal inheritance; google search `java instanceof keyword`
    * ensure that a `Dog` is an `instanceof` an Animal 
* Create test to check Mammal inheritance; google search `java instanceof keyword`
    * ensure that a `Dog` is an `instanceof` an Mammal
 

#### AnimalFactoryTest
* Create Test for `Animal createDog(String name, Date birthDate)`
    * ensure that when `.createDog` is invoked on `AnimalFactoryTest` a `Dog` is created with the respective `name` and `birthDate` value.
* Create Test for `Animal createCat(String name, Date birthDate)`
    * ensure that when `.createCat` is invoked on `AnimalFactoryTest` a `Dog` is created with the respective `name` and `birthDate` value.

#### CatHouseTest
* Create tests for `void add(Cat cat)`
    * ensure that when `.add` is invoked on the `CatHouse`, a respective `Cat` object can be retrieved from the house.  
* Create tests for `void remove(Cat cat)`
    * ensure that when `.remove` is invoked on the `CatHouse`, a respective `Cat` object can no longer be retrieved from the house.
* Create tests for `void remove(Integer id)`
    * ensure that when `.remove` is invoked on the `CatHouse`, a `Cat` object with the respective `id` can no longer be retrieved from the house.
* Create tests for `Cat getCatById(Integer id)`
    * ensure that when `.getCatById` is invoked on the `CatHouse`, a `Cat` with the respective `id` is returned.
* Create tests for `Integer getNumberOfCats()`
    * ensure that when `.getNumberOfCats()` is invoked on the `CatHouse`, the respective number of `Cat` objects is returned.
 
#### DogHouseTest
* Create tests for `void add(Dog dog)`
    * ensure that when `.add` is invoked on the `DogHouse`, a respective `Dog` object can be retrieved from the house.  
* Create tests for `void remove(Integer id)`
    * ensure that when `.remove` is invoked on the `DogHouse`, a respective `Dog` object can no longer be retrieved from the house.
* Create tests for `void remove(Dog dog)`
    * ensure that when `.remove` is invoked on the `DogHouse`, a `Dog` object with the respective `id` can no longer be retrieved from the house.
* Create tests for `Dog getDogById(Integer id)`
    * ensure that when `.getCatById` is invoked on the `DogHouse`, a `Dog` with the respective `id` is returned.
* Create tests for `Integer getNumberOfDogs()`
    * ensure that when `.getNumberOfDogs()` is invoked on the `DogHouse`, the respective number of `Dog` objects is returned.


