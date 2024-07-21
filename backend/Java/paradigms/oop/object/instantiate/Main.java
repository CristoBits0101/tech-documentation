package paradigms.oop.object.instantiate;

import paradigms.oop.object.instantiate.clases.MyEmpty;
import paradigms.oop.object.instantiate.clases.MyParameters;

public class Main {
    public static void main(String[] args) {

        MyEmpty empty = new MyEmpty();
        MyParameters parameters = new MyParameters("Cristo", 18);

        System.out.println(empty);
        System.out.println(parameters.name);

    }
}
