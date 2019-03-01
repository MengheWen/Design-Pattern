Proxy Pattern
        -- Control and manage access
        -- Provide a surrogate or placeholder for another object to control access to it

*** Advantage: provides the protection to the original object from the outside world


- Remote Proxy: 
    definition: it acts like a local representative to a remote object. 
    What is a "remote object"? 
        -- It is an object that lives in the heap of a different JVM. 
    What is an "local object"? 
        -- It is an object that you can call local methods on, and have them forwarded on to the remote object. 
    Represents an object running on a remote JVM. Java RMI and Jini used to create distributed applications in Java uses remote proxies, which are called stubs. Pre-Java EE 6 remote proxies were used by JAX-RPC Web services.

- Virtual Proxy


- Proxy (ReportGeneratorImplProxy): 
    Implements Subject and maintains a reference to RealSubject.
    
- Caching Proxy

- Protection Proxy: 
    Controls access to the real object. As an example, in the report viewer application, a report generator object generates sensitive reports that a protection proxy allows access to only users with the Manager role.

- Remote Proxy: 
    Represents an object running on a remote JVM. Java RMI and Jini used to create distributed applications in Java uses remote proxies, which are called stubs. Pre-Java EE 6 remote proxies were used by JAX-RPC Web services.

- Smart Reference Proxy: 
    Performs additional actions on the real object, such as maintaining reference counts to a real object so that the real object can be freed when no more references exist. It can also load and cache a persistent object in memory when first referenced or lock a real object to ensure that no other objects can change it.

- Smart Proxy: 
    provides additional layer of security by interposing specific actions when the object is accessed. 
    For example: check whether the real object is locked or not before accessing it, so no other objects can change it. 
    


Questions: 
1. Why javax.persistence.PersistenceContext is an example of proxies in Java library? 
    A: JPA is a implementation of proxy pattern (EJB)

Comments: 
    Proxy == Wrapper
    Spring winded out -- hides the method wrapped with a Cache Proxy. 
    For example: @Bean @Server @Component --> Wrapped in a proxy. 
                @Bean is a Singleton Pattern by default. 
                Dashboard Header Server --> User Server (get populated by header) 

