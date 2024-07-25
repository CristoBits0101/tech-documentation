/**
 * Los parámetros son obligatorios.
 * Todos los parámetros tienen el tipo String.
 * Para api rest
 */
public class 6_HttpServletRequest() {

    // localhost:8080/libro/mi_libro
    @GetMapping("/libro/{name}")                                 
    public UserDto index(@PathVariable() String name) {
        BookDto bookDto = new BookDto(name);
        return bookDto;
    }

    // localhost:8080/libro/mi_libro
    @GetMapping("/product/{product}/{id}")                                 
    public UserDto index(@PathVariable() String product, @PathVariable() String id) {
        ProductDto productDto = new ProductDto(product, id);
        return productDto;
    }

}
