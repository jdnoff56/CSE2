//Joseph D'Onofro
//Demo 0
//Hello World Java Program
//
//  first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//  define a Class
public class HelloWorld{
    
// add main method
    public static void main(String[] args) {
       
        int [] x={1,10,3,7} ;
        int[] y={2,3,7,1,10,9};
        
        
        int[] overlap=overlap(x,y);
        
        String out = listArray(overlap);
        System.out.println(out);
// test
    }
    
    public static int[] overlap(int[] x, int[] y){
        
        int i;
        int j;
        int count = 0;
        int index = 1;
        int[] result = new int [x.length+y.length];
        
        for (i=0;i<x.length;i++){
            for(j=0;j<y.length;j++){
                if (x[i]==y[j]){
                    result[index] = x[i];
                    count++;
                    index++;
                }
            }
        }
        
        result[0]=count;
        return result;
        
    }
    
    public static String listArray(int num[]){  // method that lists the entered numbers in string form 
                                              // so that it can be place in the output sentence
    String out="{"; // beginning bracket, entered numbers will become strings and added to this bracket
    
    for(int j=0;j<num.length;j++){ // loop that goes through each number entered and converts it to a string by adding it to "out"
         
      if(j>0){  // no comma needed until after the first number
        out+=", "; // adds commas
      }
      out+=num[j]; // casts the currently accessed number of the array to a string and adds it to the output string
    }
    
    out+="} "; // closes the bracket
    return out; // returns whole array as a string in form "{#,#,#}"
  }
    
    
    
    
    
}