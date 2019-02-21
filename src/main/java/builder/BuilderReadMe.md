Builder Pattern
        -- Use the Builder pattern to encapsulate the construction of a product and allow it to be constructed in steps
    
* Benefits
    * Encapsulates the way a complex object is constructed. 
    * Allows objects to be constructed in a multistep and varying pocess (as opposed to one-step factories)
    * Hides the internal representation of the product from the client. 
    * Product implementations can be swapped in and out because the client only sees an abstract interface. 

* Drawbacks
    * Often used for building composite structures. 
    Constructing objects requires more domain knwledge of the client than when using a Factory. 