/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DC;

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Yulican
 */
public class Main extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
    }
    
   public String[][] setMap(int x,int y){
       Random rd = new Random();
       String[][] map = new String[x][y];
       
       
       
       return map;
   } 
    
}
