package ru.egorovga.remindme.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.egorovga.remindme.server.entity.Remind;

import java.util.Date;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){
        return createmMockRemind();
    }

    private Remind createmMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setTitle("My first remind title");
        remind.setRemindDate(new Date());

        return remind;
    }
}
