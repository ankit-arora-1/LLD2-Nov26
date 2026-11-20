package decorator.fileReader;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class Client {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new GZIPInputStream(
                        new BufferedInputStream(
                                new FileInputStream("/Users/ankit/Documents/scaler-lld-sep26/LLD2/src/decorator/fileReader/people.ser.gz"))));

        int count = in.readInt();
        for (int i = 0; i < count; i++) {
            Person p = (Person) in.readObject();
            System.out.println(p);
        }
        in.close();   // closing the outer layer closes all inner layers too
    }
}
