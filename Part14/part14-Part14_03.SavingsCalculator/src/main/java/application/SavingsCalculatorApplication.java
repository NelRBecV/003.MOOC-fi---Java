package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class SavingsCalculatorApplication extends Application{
    
    private double rate;
    private double moneyInvested;
    private LineChart<Number,Number> earningsEstimate;
    
    @Override
    public void start(Stage chartWin){        
        
        BorderPane mainWindow = new BorderPane();
        SlideBarContainer moneySlider = new SlideBarContainer(25.0,250.0,25.0);
        SlideBarContainer interestSlider = new SlideBarContainer(0.0,10.0,0.0);
        VBox dataSliders = new VBox();        
                
        moneySlider.showSliderValue(true,"integer");
        moneySlider.showMeasuementScale(true,true);
        moneySlider.setDescription("Monthly savings");
        moneySlider.setSliderTypeValue("integer");
                
        interestSlider.setDescription("Yearly interest rate");
        interestSlider.showMeasuementScale(true, false);
        interestSlider.showSliderValue(true,"double");
                
        dataSliders.getChildren().addAll(moneySlider.retrieveContainer(),interestSlider.retrieveContainer());
        
        moneyInvested = 25;
        rate = 0.0;
        earningsEstimate = updateChart(moneyInvested,rate);
                
        moneySlider.getSlider().setOnMouseDragged((e)-> {            
            moneySlider.updateSliderValue();
            moneyInvested = moneySlider.getSliderValue();
            rate = interestSlider.getSliderValue()/100;
            earningsEstimate = updateChart(moneyInvested,rate);
            mainWindow.setCenter(earningsEstimate);
            
        });        
        interestSlider.getSlider().setOnMouseDragged((e)-> {
            interestSlider.updateSliderValue();
            moneyInvested = moneySlider.getSliderValue();
            rate = interestSlider.getSliderValue()/100;
            earningsEstimate = updateChart(moneyInvested,rate);
            mainWindow.setCenter(earningsEstimate);
            
        });
        
        mainWindow.setTop(dataSliders);
        mainWindow.setCenter(earningsEstimate);
        
        Scene scene = new Scene(mainWindow);
        
        chartWin.setScene(scene);
        chartWin.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("Hello world!");
    }
    
    public static LineChart<Number,Number> updateChart(double money, double rate){
        NumberAxis xYears = new NumberAxis(0,30,1);
        NumberAxis yRate = new NumberAxis(0,100000,25000);
        
        LineChart<Number,Number> chart = new LineChart(xYears,yRate);
        chart.setLegendVisible(false);
        chart.setTitle("Savings Calculator");
                
        XYChart.Series moneyInvested = new XYChart.Series<>();
        XYChart.Series yearlyEarnings = new XYChart.Series<>();
        
        double interestGotPerYear = 0.0;
        double moneyValue = (money * 12);
        
        moneyInvested.getData().add(new XYChart.Data(0,0.0));
        yearlyEarnings.getData().add(new XYChart.Data(0,0.0));
        
        for(int i = 0; i < 31; i++){
            if (i != 0){
                double yearlyEarningSoFar = interestGotPerYear;
                interestGotPerYear = (yearlyEarningSoFar + moneyValue) * (1 + rate);
            }
            moneyInvested.getData().add(new XYChart.Data(i,moneyValue * i));
            yearlyEarnings.getData().add(new XYChart.Data(i,interestGotPerYear));
            
        }
        if(interestGotPerYear > yRate.getUpperBound()){
            yRate.setUpperBound(((int)interestGotPerYear/100000)*100000);
        }
        chart.getData().addAll(moneyInvested,yearlyEarnings);
        
        return chart;
    }
    
}
