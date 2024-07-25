@RestController                                      // 1. Declaramos el controlador rest.
@RequestMapping("/api")                              // 2. Prefijo para todas las rutas.
public class 3_RestController {                      // 3. Prefijo para todas las rutas.
    @GetMapping("/")                                 // 4. Mapeamos los métodos.
    public Map<String, Object> index(){              // 5. Retorna un map.
        Map <String, Object> data = new HashMap<>(); // 6. Declaramos el map.
        data.put("message", "Hello.");               // 7. Añadir datos al map.
        return data;                                 // 8. Retorna el objeto dentro del JSON.
    }
}
