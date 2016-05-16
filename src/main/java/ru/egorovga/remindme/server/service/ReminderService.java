package ru.egorovga.remindme.server.service;

import ru.egorovga.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> getAll();
    Remind getByID(long id);
    Remind save(Remind remind);
    void remove(long id);
}
