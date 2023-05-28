
public class vinod {
	static String s="ainodi";
	
	static int total_a;
	static int total_e;
	static int total_i;
	static int total_o;
	static int total_u;
	
	public static void main(String[] sd) {
		
		for(int i=1;i<=s.length()-1;i++) {
			
			if(Character.toLowerCase(s.charAt(i))=='a'||Character.toLowerCase(s.charAt(i))=='e' || Character.toLowerCase(s.charAt(i))=='i' || Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u'){
				
				
				if(Character.toLowerCase(s.charAt(i))=='a') {
					total_a++;
					
				}
				if(Character.toLowerCase(s.charAt(i))=='e') {
					total_e++;
					
				}
				if(Character.toLowerCase(s.charAt(i))=='i') {
					total_i++;
					
				}
				if(Character.toLowerCase(s.charAt(i))=='o') {
					total_o++;
					
				}
				if(Character.toLowerCase(s.charAt(i))=='u') {
					total_u++;
					
				}
				
			}
			
		}
		System.out.println("Total count of A vowel "+total_a);
		System.out.println("Total count of E vowel "+total_e);
		System.out.println("Total count of I vowel "+total_i);
		System.out.println("Total count of O vowel "+total_o);
		System.out.println("Total count of U vowel "+total_u);
		
	}

}
