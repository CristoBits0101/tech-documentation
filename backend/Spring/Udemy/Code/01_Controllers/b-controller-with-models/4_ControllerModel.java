import code.02_Models.1_User;

@RestController                                      
@RequestMapping("/api")                              
public class 4_RestControllerWithModel {               
    @GetMapping("/")                                 
    public Map<String, Object> index(){                     // Object permite retornar cualquier tipo.   
        User user = new User("John Doe", 30); 
        Map <String, Object> data = new HashMap<>();
        data.put("title", "Ejemplo de retornar objetos."); 
        data.put("user", user);               
        return data;                                        // Se podría retornar un pdf, un excel...             
    }
}
