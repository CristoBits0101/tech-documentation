public class 8_ControllerJson {

    // El objeto del JSON tiene que coincidir con el del modelo.
    @GetMapping("/libro/{name}")                                 
    public UserDto index(@RequestBody User user) {
        return bookDto;
    }

}
