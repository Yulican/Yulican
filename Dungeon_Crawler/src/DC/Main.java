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
    private  static final int fieldX =126;
    private static final int fieldY = 126;
    private static boolean [][]map = new boolean[fieldX][fieldY];
    private  static String [][] textures;
     static Random  rng = new Random();
    
    public static void main(String[] args) {
        setMap();
        showMap();
        
        
        //launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
    }
    
    private static void showMap(){
        for (int i = 0; i < fieldX; i++) {
            for (int j = 0; j < fieldY; j++) {
                if(map[i][j]){
                    System.out.printf("O");
                }else{
                    System.out.printf("#");
                }
            }
            System.out.println(" ");
        }
    }
    
   public static void setMap(){
        int x = rng.nextInt(fieldX);
        int y = rng.nextInt(fieldY);
        map[x][y]= true;
        boolean t=true;
        
        for(int i = 0; i<10;i++){
            t=true;
            if(rng.nextInt(100)>20){
                do{
                   x = rng.nextInt(fieldX-20)+10;
                   y = rng.nextInt(fieldY-20)+10;
                   if(map[x][y]){
                       path(rng.nextInt(12)+5,x,y);
                       t=false;
                   }
                }while(t);
                
            }else{
                do{
                   x = rng.nextInt(fieldX-20)+10;
                   y = rng.nextInt(fieldY-20)+10;
                   if(map[x][y]){
                       room(rng.nextInt(8)+1,rng.nextInt(8)+1,x,y);
                       t=false;
                   }
                }while(t);
            }
        }
   } 
   
   private  static void path(int l,int x, int y){
       if(l<0){
           throw new IllegalArgumentException("Path-length can't be negativ");
       }
      boolean t = rng.nextBoolean();
      boolean des =rng.nextBoolean();
      for(int i=1;i<=l;i++){
          if(rng.nextInt(100)>1){
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
          if(map[x][y]){
              i--;
          }else{
              map[x][y]=true;
          }
          
      }
      
   }
   
   private  static void room(int l,int b, int x, int y){
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
