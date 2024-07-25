// Si tienes un constructor es de forma automatica no necesitas autowired.
public class 3_Constructor {

    ProductRepository repository;

    public 3_Constructor(ProductRepository repository) {
        this.repository = repository;
    }
    
}
