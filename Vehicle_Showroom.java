import java.io.*; 
import java.util.*; 


public class Vehicle_Showroom{
	private int expected_visitor ;
	
	private HashMap<Integer,NormalCar> map_normalCar = new HashMap<Integer,NormalCar>();
	private HashMap<Integer,SportsCar> map_sportsCar = new HashMap<Integer,SportsCar>();
	private HashMap<Integer,HeavyCar> map_heavyCar = new HashMap<Integer,HeavyCar>();
	
	Vehicle_Showroom(){
		expected_visitor = 30;
	}
	public static void main(String []args){
	    Scanner scan = new Scanner(System.in);
		Vehicle_Showroom vh = new Vehicle_Showroom();
		while(true){
			System.out.println("Four Functions Available: A for add, D for delete , S for Show List With Details , s for Showing The list without Details,E for Exit");
	    char ch = scan.next().charAt(0);
		if(ch == 'A')
			vh.Add_Car();
		else if (ch == 'D')
			vh.Delete_Car();
		else if(ch == 'S')
			vh.Show_List();
		else if(ch == 's')
			vh.Show_List_Without_Details();
		else if(ch == 'E')
			break;
		}
		
	}
	
	
	public void Add_Car(){
		System.out.print("Which type of Car will be added? (1.normal 2. sports 3. heavy )");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n== 1)
		{ 
	        NormalCar nc = new NormalCar();
			
			map_normalCar.put(nc.get_model(),nc);
			System.out.println("Car has been added to the showroom successfully, Model Number is : " + nc.get_model());
			
		}
		else if(n== 2){
		
		SportsCar sc = new SportsCar();
		map_sportsCar.put(sc.get_model(),sc);
			System.out.println("Car has been added to the showroom successfully, Model Number is : " + sc.get_model());
			expected_visitor += 20;
		
		}
		else if(n== 3){
			
			HeavyCar hc = new HeavyCar();
		    map_heavyCar.put(hc.get_model(),hc);
			System.out.println("Car has been added to the showroom successfully, Model Number is : " + hc.get_model());
		}

	}
	public void Delete_Car(){
	    System.out.print("Enter the model number to delete certain Car: " );
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(map_normalCar.containsKey(n)){
		   map_normalCar.remove(n);
		
		}
		else if(map_sportsCar.containsKey(n)){
		   map_sportsCar.remove(n);
		   expected_visitor -= 20;
		
		}
		else if(map_heavyCar.containsKey(n)){
		   map_heavyCar.remove(n);
		
		}
		
	
	} 
	public void Show_List(){
	           for(NormalCar m:map_normalCar.values()){    
			   //NormalCar mnc = m.getValue();
               m.show();
              }  
			  for(SportsCar m:map_sportsCar.values()){    
                m.show();     
              } 
               for(HeavyCar m:map_heavyCar.values()){    
                m.show();    
              }  			  
	
	}
	public void Show_List_Without_Details(){
	       
		    for(NormalCar m:map_normalCar.values()){    
               System.out.println("Car Type: Normal, Model : "+ m.get_model());
              }  
		    for(SportsCar m:map_sportsCar.values()){    
               System.out.println("Car Type: Sports, Model : "+ m.get_model());
              }  
			 for(HeavyCar m:map_heavyCar.values()){    
               System.out.println("Car Type: Heavy, Model : "+ m.get_model());
              }  
		   
		   System.out.println("Expected Visitor: " +expected_visitor);
	
	
	
	}
	
	
}