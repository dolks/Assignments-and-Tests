
public class Recursion {
	public static void main(String[] args){
		int input=IO.readInt();
		System.out.println(fib(input));
	}
	static int fib(int n){
		if (n==1 || n==2){
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
}
