public class 1_Redirect {
    public String page(String page) {
        if (page.equals("home")) {
            // Template
            return "redirect:/home";    
        }
        // Template
        return "redirect:/welcome";
    }
}
