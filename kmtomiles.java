import java.util.Scanner; 
class kmtomiles{ 
	public static void main(String[]args){ 
		System.out.println("Enter the value of km"); 
		Scanner sc=new Scanner(System.in); 
		int km=sc.nextInt(); 
		double result=km*0.621371; 
		System.out.println(result);
	}
}

