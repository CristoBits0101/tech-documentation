public class 2_ProductServiceImpl implements ProductService{

    ProductRepository repository;

    // Se puede utilizar los setters para instanciar en vez del constructor
    // En vez de poner autowired al atributo se lo pones al setter.
    // Hay que poner de esta forma el setter debajo del atributo.
    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }
    
}
