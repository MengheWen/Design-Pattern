package singleton;

public class SingletonMultithreading {

    private static SingletonMultithreading uniqueInstance;

    private SingletonMultithreading(){}

    public static synchronized SingletonMultithreading getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonMultithreading();
        }
        return uniqueInstance;
    }
}


class ThreadSafeSingleton {

//    private volatile static ThreadSafeSingleton uniqueInstance2;
    private static ThreadSafeSingleton uniqueInstance2;
    // The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
    // when it is being initialized to the Singleton instance. 

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){

        if(uniqueInstance2 == null){  // check for an instance, if there isn't one, enter synchronized black

            synchronized (ThreadSafeSingleton.class){
                if(uniqueInstance2 == null){
                    uniqueInstance2 = new ThreadSafeSingleton();  // Once in the black, check again and if still null, craete an instance
                }
            }
        }
        return uniqueInstance2;
    }
}

/*
Notice the private inner static class that contains the instance of the singleton class.
When the singleton class is loaded,
SingletonHelper class is not loaded into memory and only when someone calls the getInstance method,
this class gets loaded and creates the Singleton class instance.
This is the most widely used approach for Singleton class as it doesn’t require synchronization
 */

/*
    This example is very Language specific
 */

class BillPughSingleton {

    private BillPughSingleton(){}

    // This private static class does not get loaded in memory until the parent method is called
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
