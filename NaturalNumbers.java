import java.util.Scanner;

class NaturalNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0){
			System.out.println("Sum of "+number+" natural numbers is: "+sum(number));
		}
		else{
			System.out.println(number+" is not a natural number.");
		}
	}
	public static int sum(int n){
		return (n*(n+1))/2;
	}
}
