package Test;

import java.util.Scanner;

public class C00Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0,j=0,k=0;
		int h = sc.nextInt();
		
		while(i<h)
			{
				j=0;
				while(j<=(h-2)-i)
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i)
				{
					System.out.print("*");
					k++;
				}
				System.out.println();
				i++;
			}
		
		for(i=0;i<h;i++) {
			for(j=0;j<=(h-2)-i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
