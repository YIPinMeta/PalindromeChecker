package day6;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num =scanner.nextInt();
		  int orgnum =num;
		  int revnum =0;
		  
		  while (num!=0) 
		  {
			  int digit = num%10;
					  revnum=revnum *10+ digit;
			  num/=10;
		  }
		  if(orgnum==revnum) 
		  {
			System.out.println(orgnum + " is a Palindrome!~");  
		  }
		  else 
		  {
			  System.out.println(orgnum + " is NOT a Palindrome.");
		  }
 scanner.close();
	}

}
