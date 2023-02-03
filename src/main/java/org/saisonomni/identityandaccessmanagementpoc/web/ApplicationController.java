package org.saisonomni.identityandaccessmanagementpoc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @RequestMapping(value = "/protected", method = RequestMethod.GET)
    public String handleProtected() {
        return "protected";
    }

    @RequestMapping(value = "/protected/premium", method = RequestMethod.GET)
    public String handlePremium() {
        return "premium";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String handleAccessDenied() {
        return "access-denied";
    }
}
