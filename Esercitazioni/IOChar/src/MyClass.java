import java.io.Serializable;

public class MyClass implements Serializable {
    private int field;

    public MyClass(int f) {
        field = f;
    }

    public String toString() {
        return "<" + field + ">";
    }
}
