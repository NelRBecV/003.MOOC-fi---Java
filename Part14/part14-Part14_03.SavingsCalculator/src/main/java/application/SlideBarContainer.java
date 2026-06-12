/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class SlideBarContainer {
    
    private BorderPane container;
    private Label description;
    private Slider slider;
    private Label sliderValue;
    private String numberType;
    
    public SlideBarContainer (double first, double last, double interval){
        this.container = new BorderPane();
        this.description = new Label("");
        this.slider = new Slider(first, last, interval);
        this.sliderValue = new Label("");
        this.numberType = "";
    }
    
    public void setDescription(String description){
        this.description.setText(description);
    }
    
    public void showSliderValue(boolean visible, String type){
        if(visible){
            this.updateSliderValue();
        }
        this.numberType = type;
        
    }
    
    public void updateSliderValue(){
        if(this.numberType.equals("integer")){
            this.sliderValue.setText("" + (int)this.slider.getValue());
            return;
        }
        double value = (int)((this.getSliderValue()*100));
        this.sliderValue.setText("" + value/100);
    }
    
    public void customizeLabel(String fontName, int fontSize){
        this.description.setFont(Font.font(fontName,fontSize));
        this.sliderValue.setFont(Font.font(fontName,fontSize));
    }
    
    public void showMeasuementScale(boolean labels, boolean marks){        
        this.slider.setShowTickLabels(labels);
        this.slider.setShowTickMarks(marks);
    }
    
    public double getSliderValue(){
        return this.slider.getValue();        
    }
    
    public void setSliderTypeValue(String type){
        this.numberType = type;
    }
    
    public Slider getSlider(){
        return this.slider;
    }
    
    public BorderPane retrieveContainer(){
        this.container.setPadding(new Insets(10,20,10,20));
        
        this.container.setLeft(description);
        this.container.setCenter(slider);
        this.container.setRight(sliderValue);       
        
        return container;
    }
    
}
