import java.util.Scanner;
class simpleinterest{
	public static void main(String[]args){
		System.out.println("Enter the principle amount");
		Scanner sc=new Scanner(System.in); 
		int p=sc.nextInt();
		System.out.println("Enter the rate of interest");
		int r=sc.nextInt();
		System.out.println("Enter the time"); 
		int t=sc.nextInt();
		int result=(p*r*t)/100; 
		System.out.println(result);
	}
}

