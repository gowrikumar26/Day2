import java.util.Scanner;

//public class Factorial {
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
//		int result=n;
//		//n!=[[[n*(n-1)]*(n-2)]*(n-3)]*(n-4)
//		for(int i=1;i<n;i++) {
//		
//			//result=	n*(n-i);
//			
//		result=result*(n-i);
//		}
//		System.out.println(n+ " Factorial is :  "+result);
//	}
//}

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();// Getting the input
        System.out.println("The Factorial of " + n + " is : " + Factorial(n));// Calling the Factorial method
    }
    public static int Factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
           result = result*i;   //if n = 4, 4*3*2*1 = 24 
        }
        return result;

    }
}