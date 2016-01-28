package ru.egorovga.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/")
public class RootController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getRoot(ModelMap model) {
        String out = "Now is " + new Date().toString();

        return out;
    }

}
