package by.DIMA.app.javaFX.datapool;

import by.DIMA.app.javaFX.message.MessageType;
import by.DIMA.app.javaFX.client.connection.Connection;
import by.DIMA.app.javaFX.entity.tables.Goal;
import by.DIMA.app.javaFX.entity.tables.StatisticsData;
import by.DIMA.app.javaFX.entity.tables.StatisticsDataProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class DataPool {


    private ObservableList<StatisticsDataProperty> statisticsDataPropertyList = setList();

    private ObservableList<Goal> goalsList = set2List();


    public  ObservableList<StatisticsDataProperty> setList(){
        ObservableList<StatisticsDataProperty> statisticsDataPropertyList = FXCollections.observableArrayList();
        Connection.getInstance().sendMessage(MessageType.GET_STATISTICS);
        List<StatisticsData> statisticsDataList = (List)  Connection.getInstance().readMessageList();
        for(StatisticsData data: statisticsDataList){
            statisticsDataPropertyList.add(new StatisticsDataProperty(data));
        }
        return statisticsDataPropertyList;
    }
    public  ObservableList<Goal> set2List(){
        ObservableList<Goal> goalsList = FXCollections.observableArrayList();
        Connection.getInstance().sendMessage(MessageType.GET_GOALS);
        goalsList.setAll((List)  Connection.getInstance().readMessageList());
        return goalsList;
    }



    public  ObservableList<StatisticsDataProperty> getStatisticsDataPropertyList() {
        return statisticsDataPropertyList;
    }

    public  ObservableList<Goal> getGoalsList() {
        return goalsList;
    }

}
