import java.io.*; 
import java.util.*; 



public class SportsCar extends Vehicle{
	 boolean turbo;
	 
	 SportsCar(){
		 Scanner scan = new Scanner(System.in);
	     System.out.print("will there be any turbo? 0 or 1: ");
		 int n = scan.nextInt();
		 turbo = n != 0;
		 super.engine = engine_type.oil;
	 
	 
	 }
     void show(){
		 System.out.println("Car Type :Sports ");
		 super.show();
		  System.out.println("Turbo: " + turbo);
	   System.out.println("Engine Type: " + engine.toString());
	   
	 }
	 
	// public static void main(String []args){
	  //  SportsCar sp = new SportsCar();
		
		//sp.show();
	 
	 
	 //}

}