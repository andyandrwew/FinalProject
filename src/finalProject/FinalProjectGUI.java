/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import finalProject.MainTester;
import java.io.Console;
import java.io.PrintStream;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;



/**
 *
 * @author andrew
 */
public class FinalProjectGUI extends Application {
    
    final TextField arraySize= new TextField();;
    final TextField searchInt= new TextField();;
    final TextField lowBound = new TextField();;
    final TextField hiBound = new TextField();;
    public RunGUI run;
    public StringBuilder sb = new StringBuilder();
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Run");
        arraySize.setPromptText("Array Size");
        searchInt.setPromptText("Search Int");
        lowBound.setPromptText("Lower Bound");
        hiBound.setPromptText("Upper Bound");
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
        
        
            @Override
            public void handle(ActionEvent event) {
                
                arraySize.setPromptText("Enter the size of the array: ");
                arraySize.getPrefColumnCount();
                
                int size = Integer.parseInt(arraySize.getText());
                
                searchInt.setPromptText("Number to find: ");
                searchInt.getPrefColumnCount();
                
                int find = Integer.parseInt(searchInt.getText());
                
                lowBound.setPromptText("Lower bound: ");
                lowBound.getPrefColumnCount();
                
                int min = Integer.parseInt(lowBound.getText());
                
                hiBound.setPromptText("Higher bound: ");
                hiBound.getPrefColumnCount();
                
                int max = Integer.parseInt(hiBound.getText());
                
                run = new RunGUI(size, find, min, max);
            }
        });
        
        GridPane root = new GridPane();
        
        GridPane.setConstraints(root, 4, 0);
                root.addRow(0, arraySize);
                root.addRow(1, searchInt);
                root.addRow(2, lowBound);
                root.addRow(3, hiBound);
                root.addRow(4, btn);
                       
        Scene scene = new Scene(new VBox(root), 400, 400);
        primaryStage.setTitle("Sort && Search");
        primaryStage.setScene(scene);
        primaryStage.show();    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
