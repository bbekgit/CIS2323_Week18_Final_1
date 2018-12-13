public class BoomerSooner {
    	public static void main(String args[]) {
		System.out.println("\nDivided by 3 print Boomer: ");		
		for (int i=1; i<1000; i++) {
			if (i%3==0) 
			System.out.print(i +" Boomer");			
		}			
				
		System.out.println("\n\nDivided by 5 print Sooner: ");
		for (int i=1; i<1000; i++) {
			if (i%5==0) System.out.print(i +" Sooner ");			
		}
				
		System.out.println("\n\nDivided by 3 & 5 print Boomer Sooner: ");			
		for (int i=1; i<1000; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +" Boomer Sooner ");			
		}
		System.out.println("\n");
  }
}