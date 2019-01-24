package singleton;

public enum EnumSingleton {

    // You can give Enum behavior instead tread it as a type
    // Java ensures that any enum value is instantiated only once in Java
    // Since Java Enum values are globally accessible, so is the singleton

    INSTANCE;

    public static void doSomething(){
        // do something
    }
}
