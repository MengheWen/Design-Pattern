orts and Adapters
       -- also known as hexagonal architecture

Problem we are trying to solve: 
    Single Responsibility in Traditional 3 - Layer Architecture: 
        ** Presentation 
        ** Logic
        ** Data
    This solves a few problems with single responsibilities, but it also creates a few, 
  most prevalently within MVC projects with a complicated domain. 
    In MVC, views are kept logic-less and controllers are kept thin. 
    Domain logic ends up getting shoveled into the data tier, 
    resulting in objects that are a tangled mess of persistence and domain logic. 
    The problem is that the SRP is not well represented in 3-layer architectures. We need a different way of looking at our software which promotes single responsibilities and decoupling.


Solution: Ports and Adapters
    -- is an attempt to solve this problem of business logic becoming tightly coupled to other dependencies, such as client frameworks and persistence. 
    When implemented well, ports and adapters results in little classes with well-defined pieces of functionality. 
    With these pieces of well-defined functionality, the classes are easy to name and the code base becomes comfortable for developers, 
    resulting in reduced cost of maintenance and development. 
    In addition, individual pieces can be mocked out, developed, and tested in isolation. 
    Domain logic can be isolated from side-effect-inducing dependencies, specifically databases and web services.
    
    The main idea of Ports & Adapters is to define the structure of an application so that it could be run by different kinds of clients (humans, tests cases, other applications,…), 
    and it could be tested in isolation from external devices of the real world that the application depends on (databases, servers, other applications, …).

click here for port and adapters structure: https://spin.atomicobject.com/2013/02/23/ports-adapters-software-architecture/
An comprehensive tutorial: https://softwarecampament.wordpress.com/portsadapters/


* A port is an entry point, provided by the core logic. It defines a set of functions. 
* Primary ports are the main API of the application. They are called by the primary adapters that from the user side of the application. 
    Examples of primary ports are functions that allow you to change objects, attributes, and relations in the core logic. 
    
* An adapter is a bridge between the application and the service that is needed by the application. It fits a specific port.  
* A primary adapter is a piece of code between the user and the core logic. One adapter could be a unit test function for the core logic. 
    Another could be a controller-like function that interacts both with the UI and the core logic. 
    The primary adapter calls the API functions of the core logic. 
* A secondary adapter is an implementation of the secondary port (which is an interface). 
    For instance, it can ve a small class that converts application storage requests to a given database, and return the result of the database in a format requested by the secondary port. 
    It can also be a mock database object needed to unit tests certain parts of the core logic. 
    The core logic calls the functions of the secondary adapter. 

Q: 
A: 
