/**
 * Obtener todos los parámetros.
 * Todos los parámetros tienen el tipo String.
 */
public class 6_ControllerHttpServletRequest() {

    // localhost:8/libro?name="mibook"&price="23.2"
    @GetMapping("/")                                 
    public UserDto index(HttpServletRequest request) {
        
        // Evitar que la edad sea nula.
        Integer age = 0;

        try {
            age = Integer.parseInt(request.getParameter("age"));
        } catch (Exception NumberFormatException e) {

        }

        User user = new User(name);
        UserDto userDto = new UserDto(user);

        return userDto;
        
    }
    
}
