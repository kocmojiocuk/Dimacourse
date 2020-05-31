package by.DIMA.app.javaFX.dao.goalsDAO;

import by.DIMA.app.javaFX.entity.tables.Goal;
import by.DIMA.app.javaFX.dao.DAO;

import java.util.List;

public interface GoalsDAO extends DAO<Goal> {
    List<Goal> findAll();
}
