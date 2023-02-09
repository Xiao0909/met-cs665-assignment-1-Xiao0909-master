# Implementation of Fully Automatic Beverage Vending Machine

This application implements a beverage vending machine that can make different types of coffee and tea drinks with the ability to add condiments such as milk and sugar. The machine allows the users to select between 0 to 3 units of milk or sugar to add to their drinks. The system has a maximum limit of 6 units of condiments in total, 3 units of sugar and 3 units of milk.

## Software Design ConceptsImplementation of Fully Automatic Beverage Vending Machine ##
This application implements a beverage vending machine that can make different types of coffee and tea drinks with the ability to add condiments such as milk and sugar. The machine allows the users to select between 0 to 3 units of milk or sugar to add to their drinks. The system has a maximum limit of 6 units of condiments in total, 3 units of sugar and 3 units of milk.

Software Design Concepts
This implementation is based on the following software design concepts:

Modularity: The application is divided into separate modules, each with its own responsibilities and interfaces. The main modules are the Main class, Coffee class, Tea class, and Relish class. This modular design makes the application more flexible and easier to maintain and expand in the future.

Abstraction: The Main class provides a high-level interface to the users, hiding the underlying details of how the drinks are made and how the condiments are added. The Coffee and Tea classes provide a higher-level abstraction for making the drinks, and the Relish class provides a higher-level abstraction for adding the condiments.

Inheritance: The Coffee and Tea classes inherit from a common Drink class, which represents the common attributes and behaviors of all drink types. This reduces duplicated code and makes the implementation more maintainable and scalable.

Encapsulation: The implementation uses encapsulation to hide the implementation details of the classes and to protect the data and state of the objects. This makes the implementation more robust and secure, and reduces the likelihood of bugs and errors.

## Object-Oreinted Programming ##

The implementation is based on Object-Oriented Programming concepts. The application includes the classes like `BeverageMachine`, `Beverage`, `Coffee`, `Tea`, `Expresso`, `Americano`, `Latte Macchiato`, `Black Tea`, `Green Tea`,  and `Yellow Tea`. These classes represent the real-word objects and their relationships

## Design Patterns ##

This implementation uses the Factory Method pattern. The Main class uses the Factory Method pattern to create instances of the Coffee and Tea classes based on the user's input. The Factory Method pattern provides a high-level abstraction for creating objects and allows the Main class to remain independent of the concrete implementations of the Coffee and Tea classes. This makes the implementation more flexible and maintainable, as new drink types can be added or removed easily in the future.

## Flexibility and Simplicity

The modular design of the implementation makes it easy to add new drink types in the future, as new classes can be created and added to the system with minimal changes to the existing code. The use of inheritance and encapsulation also makes the implementation more flexible and maintainable.

The implementation is also simple and understandable, as each class has a clear and well-defined responsibility, and the code is well-organized and easy to read. The use of the Factory Method pattern and abstraction also makes the implementation more simple and understandable.

## Conclusion ##

This implementation of the Fully Automatic Beverage Vending Machine uses software design concepts such as modularity, abstraction, inheritance, and encapsulation to provide a flexible, maintainable, and secure implementation. The use of the Factory Method pattern also makes the implementation more flexible and maintainable, and the implementation is simple and understandable.
