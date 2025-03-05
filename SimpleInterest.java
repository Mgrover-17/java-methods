import java.util.Scanner;

class SimpleInterest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		System.out.println("The Simple Interest is "+calculate(principal,rate,time)+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
	public static int calculate(int p,int r,int t){
		return (p*r*t)/100;
	}
}

		