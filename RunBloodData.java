import java.util.Scanner;
public class RunBloodData {
    
  public static void main(String[] args) {
    Scanner iskan = new Scanner(System.in);   
    	System.out.print("Enter blood type of patient: ");
    	String bt= iskan.nextLine(); 
    		
    	System.out.print("Enter the Rhesus Factor (+ or -): ");
    	String rf = iskan.nextLine();
    	
    	if(bt.equals("") && rf.equals("")){
    		BloodData bd = new BloodData();
    		bd.display();
    	}
    
    	else if(bt.equals("A") || bt.equals("B") || bt.equals ("O") || bt.equals("AB") && rf == ("+") || rf == ("-")){
    		BloodData bd = new BloodData(bt,rf);
    		bd.display();
    	}
    
    	else{
    		System.out.println("Invalid Input");
    		
    	}
    
    	
    	
    	
   
    }
}
