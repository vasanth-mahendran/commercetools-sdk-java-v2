
package com.commercetools.sdk.examples.spring.config;

import org.springframework.ui.Model;
import org.springframework.web.server.WebSession;

//@ControllerAdvice
public class SecurityControllerAdvice {
    //    @ModelAttribute
    public void handleRequest(WebSession session, Model model) {
        model.addAttribute("user", "test");
    }
}
