package io.openshift.booster;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.security.Principal;
import io.openshift.booster.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class WebController {

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

   @GetMapping(path = "/customers")
   public Greeting customers(@QueryParam("name") @DefaultValue("World") String name) {
        final String message = String.format(Greeting.FORMAT, name);
        return new Greeting(message);
    } 

}