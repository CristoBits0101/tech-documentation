import java.util.ArrayList;
import java.util.List;

public class MyWildcard {

    // Retorna una lista de algún tipo desconocido.
    public List<?> getList() {
        
        return new ArrayList<String>();
    }

    // No necesita casting, pero no se puede hacer operaciones específicas del tipo.
    public void example() {
        List<?> list = getList();
    }

}
