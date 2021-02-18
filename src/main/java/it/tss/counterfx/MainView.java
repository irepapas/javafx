/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.counterfx;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author tss
 */
public class MainView extends BorderPane{
    
    private final HBox box;
    private final Button b1;
    private final Button b2;
    private final Label value;
    private int incremento;

    public MainView() {
        incremento = 0;
        box = new HBox(10);
        b1 = new Button("+");
        b2 = new Button("-");
        value= new Label("Valore: " + incremento);
        value.setTextFill(Color.CORAL);
        box.getChildren().addAll(b1,b2,value);
        box.setAlignment(Pos.CENTER);
        this.setCenter(box);
        b1.setOnAction(this::incrementa);
        b2.setOnAction(this::decrementa);
    }

    private void incrementa(ActionEvent t) {
       value.setText("Valore: " + String.valueOf(incremento++));
    }
    
    private void decrementa(ActionEvent t) {
       value.setText("Valore: " + String.valueOf(incremento--));
    }
    
    
    
    
    
    
    
}
