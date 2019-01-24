package singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main (String[] args) throws Exception{
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        // getDeclaredConstructors() returns all the constructors (regardless access public or private)
        Constructor<?>[] declaredConstructors = EagerInitializedSingleton.class.getDeclaredConstructors();

        for(Constructor<?> constructor : declaredConstructors){
            constructor.setAccessible(true);
            instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
            break;
        }

        System.out.println(instanceOne == instanceTwo); // False! They are not pointed to the same object
    }
}
