Ports and Adapters
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

click here for port and adapters structure: https://spin.atomicobject.com/2013/02/23/ports-adapters-software-architecture/



* 
*  
* 


Q: 
A: 
