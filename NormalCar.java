import java.io.*; 
import java.util.*; 



public class NormalCar extends Vehicle{
	
	NormalCar(){
	    Scanner scan = new Scanner(System.in);
		System.out.print("What type of engine do you want? (1. oil  2. diesel 3. gas): ");
        int n = scan.nextInt();
        if(n == 1)
           super.engine = engine_type.oil;	
	    else if(n == 2)
           super.engine = engine_type.diesel;
         else if(n == 3)
           super.engine = engine_type.gas;	   
	
	
	}
     
	  void show(){
		 System.out.println("Car Type :Normal ");
		 super.show();
		 System.out.println("Engine Type: " + engine.toString());
	  }
	  
	 // public static void main(String []args){
	 //   NormalCar nc = new NormalCar();
		
		//nc.show();
	
	 //}




}
