import java.io.*; 
import java.util.*; 


public class HeavyCar extends Vehicle{
	double weight;
	
	HeavyCar(){
		 Scanner scan = new Scanner(System.in);
	     System.out.print("What will be the Weight : ");
		 weight = scan.nextDouble();
		 super.engine = engine_type.diesel;
	 
	 }
	 void show(){
		  System.out.println("Car Type : Heavy");
		 super.show();
		 System.out.println("Weight " + weight);
	     System.out.println("Engine Type: " + engine.toString());
	 }
	 
	 //public static void main(String []args){
	   // HeavyCar hc = new HeavyCar();
		
		//hc.show();
	
	 //}


}
