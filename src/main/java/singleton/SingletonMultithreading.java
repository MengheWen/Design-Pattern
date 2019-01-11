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



class SingletonMultithreading1 {

    private static SingletonMultithreading1 uniqueInstance = new SingletonMultithreading1();

    private SingletonMultithreading1(){}

    public static synchronized SingletonMultithreading1 getInstance(){
        return uniqueInstance;
    }
}



class SingletonMultithreading2 {

    private volatile static SingletonMultithreading2 uniqueInstance2;
    // The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
    // when it is being initialized to the Singleton instance. 

    private SingletonMultithreading2(){}

    public static synchronized SingletonMultithreading2 getInstance(){

        if(uniqueInstance2 == null){  // check for an instance, if there isn't one, enter synchronized black

            synchronized (SingletonMultithreading2.class){
                if(uniqueInstance2 == null){
                    uniqueInstance2 = new SingletonMultithreading2();  // Once in the black, check again and if still null, craete an instance
                }
            }
        }
        return uniqueInstance2;
    }
}
