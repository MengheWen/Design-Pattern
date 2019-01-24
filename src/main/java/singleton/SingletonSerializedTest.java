package singleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException,
        IOException, ClassCastException{
        SerializationSingleton instanceOne = SerializationSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
            "someFileName.doc"
        ));

        out.writeObject(instanceOne);
        out.close();
    }
}
