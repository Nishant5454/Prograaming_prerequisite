import java.util.Scanner; 
class perimeterofrectangle{
	public static void main(String[]args){
		System.out.println("Enter the value of length"); 
		Scanner sc=new Scanner(System.in); 
		int length=sc.nextInt(); 
		System.out.println("Enter the value of width"); 
		int width=sc.nextInt();
		int result=2*(length+width);
		System.out.println(result);
	}
}

