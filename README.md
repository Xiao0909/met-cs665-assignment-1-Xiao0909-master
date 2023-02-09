# Introduction

This application is a controller software for the Fully Automatic Beverage Vending Machine. 
The software controls the brewing process of different coffee and tea beverages including 
Espresso, Americano, Latte Macchiato, Black Tea, Green Tea and Yellow Tea. The machine can 
also add condiments such as milk and sugar to the hot beverage, with a choice of zero to 
three units.

# Software Design Concepts
The following software design principles have been used to meet the criteria, make the implementation simple, flexible, and avoid duplicating code:


## Object-Oreinted Programming ##

The implementation is based on Object-Oriented Programming concepts. The application includes the classes like `BeverageMachine`, `Beverage`, `Coffee`, `Tea`, `Expresso`, `Americano`, `Latte Macchiato`, `Black Tea`, `Green Tea`,  and `Yellow Tea`. These classes represent the real-word objects and their relationships

## Inheritance and Polymorphism ##
The usage of inheritance and polymorphism helps to minimize duplication of code and make implementation easier. Coffee and tea are children of the class Beverage. The Beverage class's methods and properties are inherited by the Coffee and Tea classes. By developing additional classes that inherit from the Beverage class, we can later add or remove new drink varieties.

