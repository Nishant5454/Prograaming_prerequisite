import java.util.Scanner; 
class Areaofcircle{
	public static void main(String[]args){
		System.out.println("Enter the value of radius to calculate the area of circle"); 
		double pie=3.14;
		Scanner sc=new Scanner(System.in); 
		int radius=sc.nextInt(); 
		double volume=pie*radius*radius; 
		System.out.println(volume);
	}
} 

