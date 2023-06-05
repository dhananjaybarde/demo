
package pattern;

public class abcdpattern {
	public static void  main(String[] args) {
		int n=121; 
		int t=n;
		int rev=0;
		while (n!=0) {
			int d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}if( rev==t	) {System.out.println("no is palindrone"); }
		else System.out.println("no is not palindrome");
		
			
	
	
	
	
	
	}}	
			
