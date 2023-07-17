

import java.util.Scanner;

public class Program2 {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int p=0;
	int s=1; 
	while(p<n){
		if(s%2!=0) {
		System.out.println(s);
		p++;
		}
		s++;
	}
	}
 }

