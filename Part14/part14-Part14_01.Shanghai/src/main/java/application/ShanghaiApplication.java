package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class ShanghaiApplication extends Application{

    @Override
    public void start(Stage winChart){
        NumberAxis xAxis = new NumberAxis(2006,2018,1);
        NumberAxis yAxis = new NumberAxis(0,100,10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> universitiesRank = new LineChart(xAxis, yAxis);
        
        XYChart.Series helsinkiRanking = new XYChart.Series();
        
        helsinkiRanking.setName("University of Helsinki");
        
        helsinkiRanking.getData().add(new XYChart.Data<>(2007,73));
        helsinkiRanking.getData().add(new XYChart.Data<>(2008,68));
        helsinkiRanking.getData().add(new XYChart.Data<>(2009,72));
        helsinkiRanking.getData().add(new XYChart.Data<>(2010,72));
        helsinkiRanking.getData().add(new XYChart.Data<>(2011,74));
        helsinkiRanking.getData().add(new XYChart.Data<>(2012,73));
        helsinkiRanking.getData().add(new XYChart.Data<>(2013,76));
        helsinkiRanking.getData().add(new XYChart.Data<>(2014,73));
        helsinkiRanking.getData().add(new XYChart.Data<>(2015,67));
        helsinkiRanking.getData().add(new XYChart.Data<>(2016,56));
        helsinkiRanking.getData().add(new XYChart.Data<>(2017,56));
        
        universitiesRank.getData().add(helsinkiRanking);
        
        Scene scene = new Scene(universitiesRank);
        
        winChart.setScene(scene);
        winChart.show();
    }
    
    public static void main(String[] args) {
        Application.launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
