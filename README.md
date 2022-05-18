## S.O.L.I.D. Principles:

### Table of Contents

<!-- AUTO-GENERATED-CONTENT:START (TOC:collapse=true&collapseText="Click") -->
<details>
<summary>"Click to expand"</summary>

<!-- AUTO-GENERATED-CONTENT:END -->

* [1 Single Reponsability Principle](#1-single-reponsability-principle)
* [2 Open Close Principle](#2-open-close-principle)
* [3 Liskov Principle](#3-liskov-principle)
* [4 Interface Segregation Principle](#4-interface-segregation-principle)
* [5 Dependency Injection Principle](#5-dependency-injection-principle)
</details>

### 1 Single Reponsability Principle

* Concept:
    - "There should never be more than one reason for a class to change."
* Rewording:
    - Every class should have only one responsibility.
    - Every class will do only one job, meaning it should have only one reason to change."
* Example App:
    - 'Manage Users App'
* Sources:
    - [Wikipedia](https://en.wikipedia.org/wiki/Single-responsibility_principle)
    - [baeldung](https://www.baeldung.com/java-single-responsibility-principle)

### 2 Open Close Principle

* Concept:
    - "Software entities ... should be open for extension, but closed for modification."
* Rewording:
    - New resources will be done amplifing a preivous ones, not changing them.
    - A feature must be added extending a previous feature, not change/modify it.
* Direct Relation:
    - Dependency Injection Principle - SOLID 5
* Example App:
    - 'Simple Bank Account App'
    - 'Dip Bank Account App'
* Sources:
    - [Wikipedia](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle)
    - [baeldung](https://www.baeldung.com/java-open-closed-principle)

### 3 Liskov Principle

* Concept:
    - "Functions that use pointers or references to base classes must be able to use objects of derived classes without
      knowing it."
* Rewording:
    - Subtypes must be substitutable for their base types
    - Objects of our subclasses behaving the same way as the objects of our superclass.
* Direct Relation:
    - Interface Segregation Principle - SOLID 4
    - Open Closed Principle - SOLID 2
* Example App:
    1. 'Area Calculator App'
* Sources:
    - [Wikipedia](https://en.wikipedia.org/wiki/Liskov_substitution_principle)
    - [knoldus](https://blog.knoldus.com/what-is-liskov-substitution-principle-lsp-with-real-world-examples/)
    - [baeldung](https://www.baeldung.com/java-liskov-substitution-principle)
* Observations:
    - This pinciple avoid the use of inheritance/polymorphism, leveraging abstractions such as interfaces when multiple
      inheritances is not supported

### 4 Interface Segregation Principle

* Concept:
    - “Clients should not be forced to depend upon interfaces that they do not use“
* Rewording:
    - "Many client-specific interfaces are better than one general-purpose interface."
    - The goal is to reduce the side effects of using larger interfaces by breaking application interfaces into smaller
      ones.
* Direct Relation:
    - Single Reponsability Principle - SOLID 1
* Example:
    2. Segregating the interfaces 'Client' / 'Product' / 'ListItems'
* Sources:
    - [Wikipedia](https://en.wikipedia.org/wiki/Interface_segregation_principle)
    - [baeldung](https://www.baeldung.com/java-interface-segregation)
* Observations:
    - Similar to the SRP - SOLID 1, however, SRP is aplicable to classes
    - Here it is applicabble to interfaces; therefore, each interface will have only a single purpose/responsability.

### 5 Dependency Injection Principle

* Concept:
    - High level modules should not depend on low level modules; both should depend on abstractions.
        - High level modules:
            - Tell us what the software should do, not how it should do, but what the software should do
            - part of our application that bring real value
        - Low level modules:
            - Implementation details that are required to execute the business policies;
            - Concrete features that help us to get our business implementation ready.
    - Abstractions should not depend on details. Details should depend upon abstraction.
        - Something that is not concrete, hence, must be implemented(concretizied)
* Rewording:
    - Problem:
        - Classes depending on other classes;
        - Whenever _class A_ uses another _class B_, then it is said that A depends on B;
        - _Class A_ can not work without _class B_, because _class B_ was created/instanciated inside _class A_;
        - Hence, the_class A_ is a **dependent** of _class B_, consenquently _class B_ is a **dependency** of
          _class A_ (Strongly coupled dependencies - High coupling);
        - Traditionaly, high-level components depend on low-level ones. Thus, it's hard to 
          reuse the high-level components.
        - **CONCLUSION**: _class A_ can not be reused without also reusing _class B_.
    - Solution:
        - "Depend upon abstractions, _**not**_ concretions."
        - DIP - SOLID 5 is about inverting the classic dependency between high-level and low-level components by 
          abstracting the interaction between them.
* Direct Relation:
    - Open Closed Principle - SOLID 2
* Example App:
    2. 'EcommerceApp'
* Sources:
    - [Wikipedia](https://en.wikipedia.org/wiki/Dependency_inversion_principle)
    - [baeldung](https://www.baeldung.com/java-dependency-inversion-principle)
    - [ducmanhphan](https://ducmanhphan.github.io/2020-01-15-Understanding-about-SOLID-part-5/)
* Observations:
    - the DIP - SOLID 5 is neither dependency injection (DI) nor inversion of control (IoC);
    - General speaking, they all work together; specially DIP + DI
    - DI makes the classes/components **_ask/receive their dependencies_**, instead of create them inside themselves.

### Other sources:
- [Entendendo o SOLID - Academia Android](https://www.youtube.com/watch?v=IAMdkzVpO44)
- [Clean Code na prática](https://www.youtube.com/watch?v=rkzviFgf6P0)
- [Learn SOLID Principles with CLEAN CODE Examples](https://www.youtube.com/watch?v=_jDNAf3CzeY&t=1298s)