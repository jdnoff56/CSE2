//Joseph D'Onofrio
//CSE2
//hw2
//

// converts a list of items purchased into
// a total assesment of cost including tax

// Create Class

public class Arithmetic {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        
        //enter data
        int nSocks=3 ; // number of sock pairs purchased
        double sockCost$=2.58 ; // cost per pair
        
        int nGlasses=6 ; // number of glasses purchased
        double glassCost$=2.29 ; // cost per glass
        
        int nEnvelopes=1 ; // number of boxes of envelopes purchased
        double envelopeCost$=3.25 ; // cost of envelopes
        
        double taxCost$=0.06 ; //cost of tax
        
        
        // define all variables
        double totalSockCost$ ; // define total cost of socks
        double totalGlassCost$ ; // define total cost of glasses
        double totalEnvelopeCost$ ; // define total cost of envelopes 
        
        double totalSockCostTax ; // define cost of tax on socks
        double totalGlassCostTax ; // define cost of tax on glasses
        double totalEnvelopeCostTax ; //define cost of tax on envelopes
        
        double totalSockCostwTax ; // define cost of socks plus tax
        double totalGlassCostwTax ; // define cost of glasses plus tax
        double totalEnvelopeCostwTax ; // define cost of envelopes plus tax
        
        double totalCostTransaction ; // define total cost of whole transaction
        double totalTaxTransaction ; // define total cost of tax on transaction
        double totalCostTransactionwTax ; // define total cost of transaction plus tax
        
       
        
    
        
        // run calculations and store numbers
        totalSockCost$=nSocks*sockCost$ ;
        totalSockCostTax=totalSockCost$*taxCost$ ; 
        totalSockCostwTax=totalSockCost$+totalSockCostTax ;
        
        totalGlassCost$=nGlasses*glassCost$ ;
        totalGlassCostTax=totalGlassCost$*taxCost$ ;
        totalGlassCostwTax=totalGlassCost$+totalGlassCostTax ;
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$ ;
        totalEnvelopeCostTax=totalEnvelopeCost$*taxCost$ ;
        totalEnvelopeCostwTax=totalEnvelopeCost$+totalEnvelopeCostTax ; 
        
        totalCostTransaction=totalSockCost$+totalGlassCost$+totalEnvelopeCost$ ;
        totalTaxTransaction=totalSockCostTax+totalGlassCostTax+totalEnvelopeCostTax ;
        totalCostTransactionwTax=totalSockCostwTax+totalGlassCostwTax+totalEnvelopeCostwTax ; 
        
        
         // convert needed variables to 2 decimal places
        double sockTaxRound ;
        sockTaxRound=Math.round(totalSockCostTax * 100.0) / 100.0 ;
        
        double sockCostwTaxRound ;
        sockCostwTaxRound=Math.round(totalSockCostwTax * 100.0) / 100.0 ;
        
        double glassTaxRound ;
        glassTaxRound=Math.round(totalGlassCostTax * 100.0) / 100.0 ;
        
        double glassCostwTaxRound ;
        glassCostwTaxRound=Math.round(totalGlassCostwTax * 100.0) / 100.0 ;
        
        double envelopeTaxRound ;
        envelopeTaxRound=Math.round(totalEnvelopeCostTax * 100.0) / 100.0 ;
        
        double envelopeCostwTaxRound ;
        envelopeCostwTaxRound=Math.round(totalEnvelopeCostwTax * 100.0) / 100.0 ;
        
        double totalTaxRound ;
        totalTaxRound=Math.round(totalTaxTransaction * 100.0) / 100.0 ;
        
        double totalTransactionwTaxRound ;
        totalTransactionwTaxRound=Math.round(totalCostTransactionwTax * 100.0) / 100.0 ;
        
        
        // print output data
        System.out.println("Item: Socks") ;
        System.out.println("# bought: "+nSocks) ;
        System.out.println("Cost per item: $"+sockCost$) ;
        System.out.println("Total cost before tax: $"+totalSockCost$) ;
        System.out.println("Tax: $"+sockTaxRound) ;
        System.out.println("Total cost with tax: $"+sockCostwTaxRound) ;
        System.out.println("                                                   ") ;
        System.out.println("Item: Glasses") ;
        System.out.println("# bought: "+nGlasses) ;
        System.out.println("Cost per item: $"+glassCost$) ;
        System.out.println("Total cost before tax: $"+totalGlassCost$) ;
        System.out.println("Tax: $"+glassTaxRound) ;
        System.out.println("Total cost with tax: $"+glassCostwTaxRound) ;
        System.out.println("                                                    ") ;
        System.out.println("Item: Envelopes") ;
        System.out.println("# bought: "+nEnvelopes) ;
        System.out.println("Cost per item: $"+envelopeCost$) ;
        System.out.println("Total cost before tax: $"+totalEnvelopeCost$) ;
        System.out.println("Tax: $"+envelopeTaxRound) ;
        System.out.println("Total cost with tax: $"+envelopeCostwTaxRound) ;
        System.out.println("                                                       ") ;
        System.out.println("Total transaction cost before tax: $"+totalCostTransaction) ;
        System.out.println("Total tax on transaction: $"+totalTaxRound) ;
        System.out.println("Total transaction cost with tax: $"+totalTransactionwTaxRound) ;
        
        
    }
}