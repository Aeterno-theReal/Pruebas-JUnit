package MisClases;

import java.util.Scanner;

public class Calculadora {
	
	public static int division(int a, int b)
	{
		if(b!=0)
			return a/b;
		else
			return 0;
	}
	
	public static int suma()
	{
		Scanner sc=new Scanner(System.in);
		int suma=0;
		
		int a=sc.nextInt();
		sc.nextLine();
		int b=sc.nextInt();
		sc.nextLine();
		
		suma = a+b;
		
		return suma;
	}
	
	public static void resta()
	{
		Scanner sc=new Scanner(System.in);
		int resta=0;
		
		int a=sc.nextInt();
		sc.nextLine();
		int b=sc.nextInt();
		sc.nextLine();
		
		resta=a-b;
		
		System.out.println("La resta es: " + resta);
	}

}
