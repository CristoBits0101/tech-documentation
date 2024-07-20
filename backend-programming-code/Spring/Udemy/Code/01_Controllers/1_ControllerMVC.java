@Controller                                      // 1. Declaramos el controlador.
@RequestMapping("/mvc")                          // 2. Prefijo para todas las rutas.
public class ControllerMVC {
    @GetMapping("/")                             // 3. Mapeamos los métodos.
    public String index(Model model){            // 4. Retorna una String porque el HTML es texto.
        model.addAttribute("message", "Hello."); // 5. Pasamos datos a la vista con Model de spring.
        return "index";                          // 6. Retorna la vista index dentro de templates.
    }
}
