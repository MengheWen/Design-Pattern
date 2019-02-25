Adapter Pattern
    -- Converts the interface of a class into another interface the clients expect. 
            Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. 
        
       
Advantages: 
    * this pattern allows us to use a client with an incompatible interface by creating an Adapter that does the conversion. 
    * This acts to decouple the client from the implementated interface, and if we expect the interface to change over time, 
    the adapter encapsulates the changes so that the client doesn't have to be modified each time it needs to operate against a different interface. 
    
    
Example: 
    Have you ever needed to use a US-made laptop in Great Britain? 
    Then you would need an AC power adapter. 
    
Q: In our project, we have couple of "transformers". Some of them are for presenting.  
   Can they be viewed as Adapter Pattern? 
A: 


1. Object Adapter
2. Class Adapter
    -- need multiple inherientance to implement it, which isn't possible in Java