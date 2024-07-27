import java.util.ArrayList;

public class MyObject {

    // Retorna una ArrayList, pero como Object
    public Object getValue() {
        return new ArrayList<String>();
    }

    // Necesita casting
    public void example() {
        ArrayList<String> list = (ArrayList<String>) getValue();
    }

}
