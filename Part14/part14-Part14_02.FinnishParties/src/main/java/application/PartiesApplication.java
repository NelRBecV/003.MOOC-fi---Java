package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

public class PartiesApplication extends Application{

    @Override
    public void start(Stage win ){        
        NumberAxis yAxis = new NumberAxis(0.0,30.0,3);
        NumberAxis xAxis = new NumberAxis(1964,2012,4);
        
        HashMap<String,HashMap<Integer,Double>>chartData = getDatabase("partiesdata.tsv");

        LineChart<Number,Number>finnishParties = new LineChart(xAxis,yAxis);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Support (%)");
        
        finnishParties.setTitle("Relative Support in the years 1968-2008");
        
        chartData.entrySet().forEach((partyData) -> {
            XYChart.Series party = new XYChart.Series();
            
            party.setName(partyData.getKey());
            
            partyData.getValue().entrySet().forEach((support) -> {
                party.getData().add(new XYChart.Data<>(support.getKey(), support.getValue()));
            });
            
            finnishParties.getData().add(party);
        });
        
        Scene scene = new Scene(finnishParties);
        
        win.setScene(scene);
        win.setTitle("Finnish Parties Support");
        win.show();
        
    }
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
        
        
        
        
    }
    
    
    public static HashMap<String,HashMap<Integer,Double>> getDatabase(String filename){
        HashMap<String, HashMap<Integer,Double>> data = new HashMap();
        ArrayList<String[]> inputs = new ArrayList();
        
        File filedata = new File(filename);
        
        try(Scanner scan = new Scanner(filedata)){
            while(scan.hasNext()){
                String[] record = scan.nextLine().split("\t");
                inputs.add(record);
            }
            
        }catch (FileNotFoundException e){
            System.out.println("There was a problem openning the file.");
        }
        String[] years = inputs.get(0);
        inputs.remove(0);
        
        inputs.forEach((value)-> {            
            data.put(value[0].trim(), new HashMap());
            for(int index = 1; index < value.length;index++){                
                if(!value[index].equals("-")){
                    data.get(value[0]).put(Integer.valueOf(years[index]), Double.valueOf(value[index]));
                }
            }
        });
            
        return data;
    }

}
