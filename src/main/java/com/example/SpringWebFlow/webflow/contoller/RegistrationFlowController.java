package com.example.SpringWebFlow.webflow.contoller;

package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class RegistrationFlowController {

    public String savePersonalDetails(User user) {
        // Simulate saving personal details
        return "contactDetails";
    }

    public String saveContactDetails(User user) {
        // Simulate saving contact details
        return "review";
    }

    public String completeRegistration(User user) {
        // Complete the registration process
        return "thankYou";
    }
}
