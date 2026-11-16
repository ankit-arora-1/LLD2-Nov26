package clone;

import java.io.Serializable;
import java.util.RandomAccess;

// Way of telling the compiler that it is okay to call clone on this object
public class Student implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
