import java.util.Scanner;

public class Patterns {
//				n=4 then o/p= 1 3 5 7 
//			ii. n=4 then o/p = 2 4 6 8 
//			iii. n=4 then o/p= 6 9 12 15 
//			iv. n=5 then o/p= 1,4,7,10,13 
//			v. n=5 then o/p= 0,4,8,12,16 
	
	
	
	public static void Add2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int n1=1;
		System.out.println("Output :");
		
		for(int i=0;i<size;i++) {
			System.out.print(" "+n1);
			n1=	n1+2;
		}
	}
		public static void Even() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int n1=0,n3;
			System.out.println("Output :");
			
			for(int i=0;i<size;i++) {
				n3=	n1+2;
				System.out.print(" "+n3);
				n1=n3;
			}
	}
		public static void Add3() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int n1=3,n3;
			
			System.out.println("Output is: ");
			for(int i=0;i<size;i++) {
				n3=	n1+3;
				System.out.print(" "+n3);
				n1=n3;
			}
		}
		public static void Size5() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int n1=1,n3;
			System.out.println("Output is: ");
			for(int i=0;i<size;i++) {
			n3=	n1+3;
			System.out.print(" "+n3);
			n1=n3;
			}
		}
		public static void Add4() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int n1=0;
			System.out.println("Output is:");
			
			for(int i=0;i<size;i++) {
				
				System.out.print(" "+n1);
				n1=	n1+4;
				//n1=n3;
			}
		}
	public static void main(String args[]) {
		//Add2();
		//Even();
		//Add3();
		//Size5();
		Add4();
	}
}