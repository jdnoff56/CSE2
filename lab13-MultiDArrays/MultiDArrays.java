// Joseph D'Onofrio
// CSE2
// lab13-MultiDArrays
// 

import java.util.Random; // import random

public class MultiDArrays { // add class
    
  public static void main(String [] arg){ // add main method
  
    Random rnd = new Random(); // construct random method
    
    int[][] array = new int [5][];
    
    for (int j=0;j<array.length;j++){
        array[j] = new int [j*3+5];
    }
    
    for (int i = 0;i<array.length;i++){
        for (int k = 0;k<(i*3+5);k++){
            array[i][k] = rnd.nextInt(40);
        }
    }
    
    display(array);
    sort(array);
    display(array);
  }  
  
  public static void display(int[][] array){
      
     
      
      for (int i = 0;i<array.length;i++){
          
          String out = "{";
          
          for (int j = 0;j<(i*3+5);j++){
              
              if(j>0){  // no comma needed until after the first number
                out+=", "; // adds commas
              }
              
              out+=array[i][j];
              
          }
          out+="}";
          System.out.println(out);
      }
      
  }
  
  public static int[][] sort (int[][] array){
      
      System.out.println("Sorting...Done.");
      
      int temp = 0;
      
      for (int i = 0;i<array.length;i++){
        for (int k = 0;k<(i*3+5);k++){
          
          if (k>0){
            if (array[i][k-1] > array[i][k] ){
              
              temp = array[i][k-1];
              array[i][k-1] = array [i][k];
              array[i][k] = temp;
              k=0;
            }
          }

        }
      }
      return array;
  }
}