package com.example.SpringWebFlow;

package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class RegistrationFlowController {

    public String savePersonalDetails(User user) {
        // Save personal details logic (to DB or service)
        return "contactDetails";  // Move to the next step
    }

    public String saveContactDetails(User user) {
        // Save contact details logic
        return "review";  // Move to the review step
    }

    public String completeRegistration(User user) {
        // Save user and complete the flow
        return "thankYou";  // End of flow
    }
}
