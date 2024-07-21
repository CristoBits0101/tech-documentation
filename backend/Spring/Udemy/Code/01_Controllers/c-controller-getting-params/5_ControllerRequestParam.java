/**
 * Obtener parámetros uno a uno.
 * Respeta los tipos de los datos.
 */
public class 5_RestControllerParam() {
    @GetMapping("/")                                 
    public UserDto index(@RequestParam String name, @RequestParam(requited = false, defaultValue = null) Integer age) {
        
        User user = new User(name);
        user.setAge(age);
        
        UserDto userDto = new UserDto(user);
        
        return userDto;

    }
}
