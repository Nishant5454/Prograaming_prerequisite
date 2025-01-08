import java.util.Scanner; 
class average{
	public static void main(String[]args){ 
		System.out.println("Enter the 1st number"); 
		Scanner sc=new Scanner(System.in);
	       int num1=sc.nextInt();
               System.out.println("Enter the 2nd number"); 
               int num2=sc.nextInt(); 
               System.out.println("Enter the 3rd number"); 
               int num3=sc.nextInt(); 
              double result=(num1+num2+num3)/3; 
System.out.println(result); 
	}
}

