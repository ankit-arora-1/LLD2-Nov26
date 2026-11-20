package decorator.fileReader;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class Client {
    public static void main(String[] args) throws Exception {
        // Given a serialized compressed file of java object,
        // obtain the objects from it

        ObjectInputStream in = new ObjectInputStream(
                    new BufferedInputStream(
                new FileInputStream("/Users/ankit/Documents/scaler-lld-sep26/LLD2/src/decorator/fileReader/people.ser.gz")

            )
        );

        int count = in.readInt();
        for (int i = 0; i < count; i++) {
            Person p = (Person) in.readObject();
            System.out.println(p);
        }
        in.close();
    }
}
