package by.DIMA.app.javaFX.dao.tableDateDAO;

import by.DIMA.app.javaFX.entity.tables.StatisticsData;
import by.DIMA.app.javaFX.dao.DAO;

import java.util.List;

public interface TableDateDAO extends DAO<StatisticsData> {
    StatisticsData find(int id);
    boolean delete(List<StatisticsData> entities);



}
