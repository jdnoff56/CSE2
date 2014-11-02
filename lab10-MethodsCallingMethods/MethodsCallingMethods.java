// Joseph D'Onofrio
// CSE2
// lab10-MethodsCallingMethods

//
//

public class MethodsCallingMethods{
    
    public static void main(String []  arg){
        
        int a=784,b=22,c;
        
        c=addDigit(a,3);
        
        System.out.println("Add 3 to "+a+" to get "+c);
        
        c=addDigit(addDigit(c,4),5);
        
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
        c=join(a,b);
        
        System.out.println("Join "+a+" to "+b+" to get "+c);
        
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }
    
    public static int addDigit(int number, int digit){
        
        int output;
        
        if (digit >= 0 && digit <= 9){
           
           if (number >= 0){
               
               int loopComparison = 1;
               do {
                   
                   if (number < loopComparison){
                       output = ((digit*loopComparison) + number); 
                       break;
                   }
                   else { loopComparison *= 10; }
                   
               } while (true);
               
           }
           else {
               
              number *= -1;
              
              int loopComparison2 = 1;
              do {
                   
                   if (number < loopComparison2){
                       output = -((digit*loopComparison2) + number); 
                       break;
                   }
                   else { loopComparison2 *= 10; }
                   
               } while (true);
               
           }
        }
        else { output = number; }
        
        return output;
        
    }
    
    public static int join (int first, int second){
        
        int output2 = second;
        int digN = 0;
        int comparison = 10;
        int count;
        
        String preLength = "" + first;
        int firstLength = preLength.length();
        
        if (first >= 0){
        
            for (count = 0; count < firstLength; count++){
                
                while (true){
                    
                    digN = ((first % comparison)-digN)/(comparison/10);
                    
                    if (digN < 10){
                        comparison *= 10;
                        break;
                        
                    }
                    else { comparison *= 10; }
                    
                }
            
                output2 = addDigit(output2,digN);
            }
        }
        else {
            first *= -1;
            second *= -1;
            
            for (count= 0; count < firstLength; count++){
                
                while (true){
                    
                    digN = ((first % comparison)-digN)/(comparison/10);
                    
                    if (digN < 10){
                        comparison *= 10;
                        break;
                        
                    }
                    else { comparison *= 10; }
                    
                }
            
                output2 = addDigit(output2,digN);
               
            }
            output2 = -output2;
        }
        
        return output2;
        
    }
    
}  

/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/

