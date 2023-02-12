import java.util.Scanner;

public class Fibonacci {
	public static void calculateFibo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int n1=0,n3;
		int n2=1;
		System.out.println("The series is: ");
		for(int i=0;i<size;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateFibo();
	}

}
