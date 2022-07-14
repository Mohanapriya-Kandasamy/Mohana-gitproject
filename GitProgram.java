package org.git;

import java.util.Scanner;

public class GitProgram {

	public static void main(String[] args) {
		
		System.out.println("Reverse Number");
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		int reverse=0,lastdigit;
		
		while(input > 0) {
			lastdigit=input%10;
			reverse=reverse*10 + lastdigit;
			input=input/10;
			
			
		}
		
		System.out.println("After reverse:"+reverse);
	}

}
