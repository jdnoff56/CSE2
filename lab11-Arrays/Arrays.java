// Joseph D'Onofrio
// CSE2
// lab11-Arrays

// 

import java.util.Scanner;

public class Arrays{
    
    public static void main(String []s){
        
        Scanner myScanner= new Scanner(System.in);
        
        int[] array = new int[10];
        
        for (int i=0;i<array.length;i++){
            
            System.out.print("Enter a number: ");
            
            array[i]=myScanner.nextInt();
            
            System.out.println("");
            
        }
        
        
        int max = array[0];
        
        for (int i=1;i<array.length;i++){
            
            if (array[i] > max){
                max = array[i];
            }
            
        }
        
        System.out.println("max: "+max);
        
        int min = array[0];
        
        for (int i=1;i<array.length;i++){
            
            if (array[i] < min){
                min = array[i];
            }
            
        }
        
        System.out.println("min: "+min);
        
        int sum = 0;
        for (int i=0;i<array.length;i++){
            
            sum += array[i];
            
        }
       
        System.out.println("sum: "+sum);
       
        int[] array2 = new int[array.length];
        
        for (int i=0;i<array.length;i++){
        
            array2[i]=array[(9-i)];
            
        }
        
        for (int i=0;i<array.length;i++){
            
            System.out.println(array[i]+"    "+array2[i]);
            
        }
    }  
    
}