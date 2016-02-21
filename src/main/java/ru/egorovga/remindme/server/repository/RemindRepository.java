package ru.egorovga.remindme.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorovga.remindme.server.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
