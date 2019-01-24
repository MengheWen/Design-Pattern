package singleton;

/*
  In eager initialization, the instance of Singleton Class is created at the time of class loading,
  this is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it.
 */

/*
  If your singleton class is not using a lot of resources,
  this is the approach to use. But in most of the scenarios,
  Singleton classes are created for resources such as File System, Database connections etc.
  We should avoid the instantiation until unless client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.
 */

/*
Thread safe! Only when you use Laziness, the thread issue comes out
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton uniqueInstance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){
        // This is to defeat singleton
//        if(uniqueInstance != null){
//            throw new RuntimeException();
//        }
    }

    public static EagerInitializedSingleton getInstance(){
        return uniqueInstance;
    }
}


class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
