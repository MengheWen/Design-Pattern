Proxy Pattern
        -- Provide a surrogate or placeholder for another object to control access to it

*** Advantage: provides the protection to the original object from the outside world


- Proxy (ReportGeneratorImplProxy): 
    Implements Subject and maintains a reference to RealSubject.
    
- Caching Proxy

- Virtual Proxy

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
