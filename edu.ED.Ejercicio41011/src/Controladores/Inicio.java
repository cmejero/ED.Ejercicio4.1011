package Controladores;
import java.util.Scanner;

public class Inicio 
{

	

	public static void main(String[] args) 
	{
		
		Scanner comunicacionTeclado = new Scanner(System.in);
		
		
		double a,b,c;
		
		
		 a= pedirNumero(comunicacionTeclado);
		 b= pedirNumero(comunicacionTeclado);
		 c= pedirNumero(comunicacionTeclado);
		
		if(a>=b & a>=c) 
		{
			if(b>=c) 
			{
			System.out.println("Orden:" +a +b +c);
			}
			else 
			{
			System.out.println("Orden:" +a +b +c);	
			}
		}
		else if(b>=a & b>=c) 
		{
				if(a>=c) 
				{
					System.out.println("Orden:" +b +a + c);
				}
			
			    else 
			    {
				System.out.println("Orden:" +b +a + c);
			    }
			
		}
		else if(c>=a & c>=b) 
		{
				if(a>=b) 
				{
					System.out.println("Orden:" +c +a +b);
				}
				else 
				{
					System.out.println("Orden:" +c +a +b);
				}
		}
		
		
	}	
		
		 public static double pedirNumero(Scanner comunicacionTeclado) 
		{
			
			double num;
			System.out.println("Introduzca un número real");
			num= comunicacionTeclado.nextDouble();
			return num;
		}
	

}
