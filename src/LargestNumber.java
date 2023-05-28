
public class LargestNumber {
	
	static int a[]= {22,3,2,6,44,4};
	static int largest_Number=a[0];
	
	public static void main(String[] args) {
		
				
			for(int j=0;j<=a.length-1;j++) {
				
				if(a[j]>largest_Number) {
					largest_Number=a[j];
					
				}
				
			
		}
		System.out.println("Largest Number "+largest_Number);
		
	}
	

}
