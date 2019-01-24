package singleton;

import java.io.Serializable;

/*
Never use it unless you have no choice
 */
public class SerializationSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationSingleton() {
    }

    private static class SingletonHelper{
        private static final SerializationSingleton uniqueInstance = new SerializationSingleton();
    }

    public static SerializationSingleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }
}
