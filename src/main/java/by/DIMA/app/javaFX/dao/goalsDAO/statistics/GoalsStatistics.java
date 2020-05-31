package by.DIMA.app.javaFX.dao.goalsDAO.statistics;

import by.DIMA.app.javaFX.entity.tables.Goal;
import by.DIMA.app.javaFX.entity.tables.StatisticsData;
import by.DIMA.app.javaFX.dao.DAO;

import java.util.List;

public interface GoalsStatistics extends DAO<Goal> {

    List<StatisticsData> getStatistics(int id);
}
