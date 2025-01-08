import java.util.Scanner; 
class volumeofcylinder{
	public static void main(String[]args){ 
		System.out.println("Enter the value of radius"); 
		Scanner sc=new Scanner(System.in); 
		int radius=sc.nextInt(); 
		System.out.println("Enter the value of height"); 
		int height=sc.nextInt();
		double ans=3.14*radius*radius*height;
		System.out.println(ans);

	}
}

