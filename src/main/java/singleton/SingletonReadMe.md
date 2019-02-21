Singleton Pattern
        -- ensures a class has only one instance, and provides a global point of access to it

* Is a convention for ensuring one and only one object is instantiated fo ra given class.
* Ensure only one object gets created. 
* Provide a good global point of access, just like a global variable without downsides. 


Q: How would you create a single object? 
A: `new MyObject()`; 

Q: what if another object wanted to create a MyObject? Could it call new on MyObject again? 
A: Yes, of course. 

Q: So as long as we have a class, can we always instantiate it one or more times? 
A: Yes. Well, only if it's a public class. 

Q: What if it is not a public class? 
A: Then only classes in the same package can instantiate it, but they can still instantiate it more than once. 

Q: What about 

        public MyClass {
            
            private MyClass(){}
        }
A: It is a class that cannot be instantiated cause it has a private constructor. 
    Therefore, the code in MyClass is the only code that could call it. (It doesn't make much sense)

Q: What about 

        public MyClass {
        
            public static MyClass getInstance(){}
        }
A: We can call the method by `MyClass.getInstance(); `

Q: What about 

        public MyClass {
        
            private MyClass(){}
            
            public static MyClass getInstance(){
                return new MyClass(); 
            }
        }
A: We can instantiate an object by 

        MyClass.getInstance(); 