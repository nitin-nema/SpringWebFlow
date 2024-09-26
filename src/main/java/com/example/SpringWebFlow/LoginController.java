package com.example.SpringWebFlow;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String showLoginForm(Model model) {
        return "login"; // Renders the login page
    }

    @PostMapping("/doLogin")
    public String handleLogin(@RequestParam("username") String username,
                              @RequestParam("password") String password, Model model) {
        if ("admin".equals(username) && "password".equals(password)) {
            return "dashboard"; // Redirect to dashboard on success
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Return to login page on failure
        }
    }
}
