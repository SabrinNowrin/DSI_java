import java.io.*; 
import java.util.*; 



public class Vehicle{
	private int model_number;
	enum engine_type{oil, gas, diesel};
	 protected engine_type engine;
	private int engine_power;
	private int tire_size;
	
	
	Vehicle(){
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter your prefered Engine Power: ");
		 int n = Scan.nextInt();
		 engine_power = n;
		 System.out.print("Enter your prefered Tyre Size: ");
		  n = Scan.nextInt();
		  tire_size = n;
		  
		  Random rand = new Random();
		  model_number = rand.nextInt(1000000000);
		 
	}
	public int get_model(){
	     return model_number;
	  }
	
	void show(){
	   System.out.println("Engine Power: " + engine_power);
	   System.out.println("Tyre Size: " + tire_size);
	    System.out.println("Model Number: " + model_number);
	   
	   
	   
	}
	 
	// public static void main(String []args){
	//	 Vehicle vn = new Vehicle();
		 
	//	 vn.show();
		 
	 //}
	
}