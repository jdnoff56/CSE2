// Joseph D'Onofrio
// CSE2
// hw11-MatrixSorter
// establishes a random 3d matrix, finds the lowest value,
// then sorts the 3rd slab

import java.util.Random; // import random utility

public class MatrixSorter{ // add class
    
  public static void main(String arg[]){ // add main method
    int mat3d[][][]; // declare 3d array
    mat3d=buildMat3d(); // method that creates the array
    show(mat3d); // displays the array
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d)); // shows min value in array
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]); // sorts 3rd slab
    show(mat3d);// display sorted matrix
   }
   
   public static int[][][] buildMat3d(){ // method, creates 3d array
       
        Random rnd = new Random(); // construct random method
        
        int[][][] mat3d = new int [3][][]; // initialize 3 slabs
        
        for (int k=0;k<3;k++){
            for (int s=0;s<3+2*k;s++){
                for (int j=0;j<k+s+1;j++){
                    mat3d[k] = new int [3+2*k][]; // initialize each row within a slab
                }
            }
        }
        
        for (int k=0;k<3;k++){
            for (int s=0;s<3+2*k;s++){
                for (int j=0;j<k+s+1;j++){
                    mat3d[k][s] = new int [k+s+1]; // initialize each value within a row
                }
            }
        }
        
        for (int k=0;k<3;k++){
            for (int s=0;s<3+2*k;s++){
                for (int j=0;j<k+s+1;j++){
                    mat3d[k][s][j] = rnd.nextInt(100); // assigns values to every array location
                }
            }
        }
        
        return mat3d; // return array
        
   }
   
   public static void show(int[][][] mat3d){
       
       for (int i = 0;i<mat3d.length;i++){
           System.out.println("-----Slab "+(i+1)+"-----");// seperates slabs
           display(mat3d[i]); // calls display method to show each 2d array within the 3d array seperately
       }
       System.out.println("----------------");
       
   }
   
   public static int findMin(int[][][] mat3d){ // finds lowest value
       
       int min = 100; // start min as a high value outside the 0-99 range
       
       for (int k=0;k<3;k++){
            for (int s=0;s<3+2*k;s++){
                for (int j=0;j<k+s+1;j++){
                    if (mat3d[k][s][j] < min){ // if a value is less than min, set as new min and reset loops
                        min = mat3d[k][s][j];
                        k=0;s=0;j=0; //reset all loops after a new min is found
                    }
                }
            }
        }
       
       return min; // return min value
       
   }
   
   public static int[][] sort (int[][] array){ // sorts 2d array by row then first number in column 
      
      int temp = 0; // temp variable for swapping
      int x =0; // declare variable
      while (true){ // infinite loop to repeat sorting process until both conditions are met (rows are sorted and first column is sorted in ascending order)
      x = 0; // resets x to 0 everytime process repeats
      // sorts all rows in ascending order
      for (int i = 0;i<array.length;i++){
        for (int k = 0;k<array[i].length;k++){
          
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
      // takes sorted rows and sorts the first column in ascending order
      for (int i=0;i<array.length;i++){
          if (i>0){
            if (array[i][0] < array[i-1][0]){
                
              temp = array[i][0];
              array[i][0] = array[i-1][0];
              array[i-1][0] = temp;
              i=0;
            }
          }
        }
        // adds to x counter if every first value is less than or equal to every second value so infinite loop can be 0
        for (int p = 0; p<array.length;p++){
            if (array[p][0]<array[p][1]){
                x++;
            }
            else if (array[p][0]==array[p][1]){
                x++;
            }    
        }
        if (x==array.length){ // if every first value is less than or equal to every second value, break infinite loop
            break;
        }
        
      } 
      return array;
  }
   
    public static void display(int[][] array){ // displays array
      
      for (int i = 0;i<array.length;i++){
          
          String out = "{";
          
          for (int j = 0;j<array[i].length;j++){
              
              if(j>0){  // no comma needed until after the first number
                out+=", "; // adds commas
              }
              
              out+=array[i][j];
              
          }
          out+="}";
          System.out.println(out);
      }
      
  }
   
}