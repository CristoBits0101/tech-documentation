public class 2_Forward {

    GetMapping("/action")
    public String action(String action) {
        if (page.equals("saludar")) {
            // Controller
            return "forward:/hello";
        }
        // Controller
        return "redirect:/bye";
    }

    GetMapping("/hello")
    public String action(String action) {
        return "hello";
    }

    GetMapping("/bye")
    public String action(String action) {
        return "bye";
    }

}
