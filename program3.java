package program3;

import java.util.Scanner;

public class program3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	if(n%2!=0) {
		System.out.println((2*i-1)+"");
	}
	 else{
			int a=(2*(i-1)-1);
			if(a>0) {
			System.out.println(a+" ");
		}
	}
	
}
}

