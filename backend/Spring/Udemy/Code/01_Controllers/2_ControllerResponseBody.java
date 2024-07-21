@Controller                                          // 1. Declaramos el controlador.
@RequestMapping("/api")                              // 2. Prefijo para todas las rutas.
public class ControllerResponseBody {                // 3. Prefijo para todas las rutas.
    @GetMapping("/")                                 // 4. Mapeamos los métodos.
    @ResponseBody                                    // 5. Devuelve un JSON.
    public Map<String, Object> index(){              // 6. Retorna un map.
        Map <String, Object> data = new HashMap<>(); // 7. Declaramos el map.
        data.put("message", "Hello.");               // 8. Añadir datos al map.
        return data;                                 // 9. Retorna el objeto dentro del JSON.
    }
}
