@SessionScope
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {

    // LISTA DE OBJETO EN MEMORIA
    List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Corsair", 300L),
                new Product(2L, "Intel", 150L),
                new Product(3L, "AMD", 75L));
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data
                .stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}