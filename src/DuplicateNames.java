
public class DuplicateNames {
	
	
	//getting duplicate name 
	static String [] name= {"Vinod","Vijay","Vishal","vinod","vijay","vinod"};
	static String s="Vinod";
	static int count=0;
	
	public static void countOfDuplicates() {
		
				
				for(int j=0;j<=name.length-1;j++) {
						
					if(s.equalsIgnoreCase(name[j])) {
						count++;							
							
					}
						
				
		}
		System.out.println("Count of "+s+" "+count);
		
		
	}
	public static void totalDuplcaites() {
		for(int i=0;i<=name.length-1;i++) {
					
					
					for(int j=i+1;j<=name.length-1;j++) {
						
						if(name[i].equalsIgnoreCase(name[j])) {
							System.out.println(" "+name[i]);
							name[i]="0";
							
						}
						
					}
					
				}
			}
	
	
	public static void main( String[] args) {
		
		countOfDuplicates();
		totalDuplcaites();
				
		
	}

}
