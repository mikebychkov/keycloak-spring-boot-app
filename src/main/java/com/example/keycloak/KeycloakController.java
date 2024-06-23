package com.example.keycloak;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@Log4j2
public class KeycloakController {

    private final CustomerDao customerDao;

    @GetMapping(path = "/")
    public String index() {
        log.info("external controller call");
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        log.info("customers controller call");
        model.addAttribute("customers", customerDao.findAll());
        model.addAttribute("username", principal.getName());
        return "customers";
    }
}
