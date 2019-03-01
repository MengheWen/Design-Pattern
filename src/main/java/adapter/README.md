Adapter Pattern
    -- Converts the interface of a class into another interface the clients expect. 
            Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. 
            
        
Example: 
    Have you ever needed to use a US-made laptop in Great Britain? 
    Then you would need an AC power adapter. 
      
         
Advantages: 
    * this pattern allows us to use a client with an incompatible interface by creating an Adapter that does the conversion. 
    * This acts to decouple the client from the implemented interface, and if we expect the interface to change over time, 
    the adapter encapsulates the changes so that the client doesn't have to be modified each time it needs to operate against a different interface. 
    
    
Q: In our project, we have couple of "transformers". Some of them are for presenting.  
   Can they be viewed as Adapter Pattern? 
A: In our project the presenters are acting like adapters. 
    Transformers -- yes and no? It is not the same style but the SAME PURPOSE. They can be also. 
    
SEFSShipmentsProvider (SEFSclients is the deep down one to make the call) and its implementation that wrappers the SEFS call (maybe DB stuff too). 
Repository hides away all the details, it acts kinda the adapter pattern. 
When repository being implemented, 


1. Object Adapter
2. Class Adapter
    -- need multiple inherientances to implement it, which isn't possible in Java


A good loads of test in ADAPTER LAYER. 
