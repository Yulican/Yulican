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
    private static final int fieldX =126;
    private static final int fieldY = 126;
    private static boolean [][]map = new boolean[fieldX][fieldY];
    private static String [][] textures;
    Random rng = new Random();
    
    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
    }
    
   public void setMap(int x,int y){
        
   } 
   
   private void path(int l,int x, int y){
       if(l<0){
           throw new IllegalArgumentException("Path-length can't be negativ");
       }
      boolean t = rng.nextBoolean();
      boolean des =rng.nextBoolean();
      for(int i=0;i<=l;i++){
          if(rng.nextInt(100)>15){
             t = rng.nextBoolean();
             des = rng.nextBoolean();
          }
          if(t){
              if(des){
                  x--;
              }else{
                  x++;
              }    
          }else{
              if(des){
                  y--;
              }else{
                  y++;
              }
          }
          map[x][y]=true;
      }
      
   }
   
   private void room(int l,int b, int x, int y){
       if(l<0 || b<0){
           throw new IllegalArgumentException("Room-size can't be negativ, fucking Turd");
       }
       if(x > fieldX || y>fieldY){
           throw new ArrayIndexOutOfBoundsException("The Coords of this Room are out of the map, Retard");
       }
       for(int i = x; i <= x+l;i++){
           for (int j = y; j < y+b; j++) {
               if(i < fieldX || j < fieldY){
                   map[i][j]=true;
               }
               
           }
       }
   }
    
}
