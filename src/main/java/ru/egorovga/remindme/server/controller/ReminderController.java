package ru.egorovga.remindme.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.egorovga.remindme.server.entity.Remind;
import ru.egorovga.remindme.server.repository.RemindRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){
        List<Remind> list = remindRepository.findAll();
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
