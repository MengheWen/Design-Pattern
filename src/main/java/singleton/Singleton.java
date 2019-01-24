package singleton;

public class Singleton {

    // Private static variable of the same class that is the only instance of the class
    private static Singleton uniqueInstance;

    // Other useful instance variables here

    // Private constructor to restrict instantiation of the class from other classes
    private Singleton(){}

    // Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class
    public static Singleton getInstance(){  // if uniqueInstance is null, then we haven't created the instance yet
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;   // if uniqueInstance wasn't null, then it was previously created.
    }

    // Other useful methods here
}
