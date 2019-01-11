package singleton;

public class Singleton {

    private static Singleton uniqueInstance;

    // Other useful instance variables here

    private Singleton(){}

    public static Singleton getInstance(){  // if uniqueInstance is null, then we haven't created the instance yet
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;   // if uniqueInstance wasn't null, then it was previously created.
    }

    // Other useful methods here
}
