import java.util.Scanner;

class celsiustofarenhite{
	public static void main(String[]args){
		System.out.println("Enter the value to change in farenhite");
		Scanner sc=new Scanner(System.in); 
		int celsius=sc.nextInt(); 
		int farenhite=(celsius*9/5)+32; 
		System.out.println(farenhite); 
	}
} 


