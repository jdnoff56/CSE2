import java.util.Scanner;

public class Enigma2{
    
  public static void main(String [] arg){
      
    int n=40,k=60;
    
    String out="";
    
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    
    System.out.println(out);
  }
}

 /* Error Report
 
    Error 1: java.lang exception runtime error at java:14
        Fix: reading the error gives a pretty clear picture where the error is, it says / by zero and 
             gives the line that the error occurs at. remove the /0 after 40 on line 14 to fix.
 
 */