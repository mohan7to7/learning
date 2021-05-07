package day1;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciSerise {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number upto which Fibonacci series to print ");
		int number=new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto "+number+" numbers");
		for(int i=1;i<=number;i++) {
			//System.out.print(fibonacciOne(i)+" ");
			System.out.print(fibonacciThree(i)+" ");
		}
	}
	public static int fibonacciOne(int number) {
		if(number==1 || number==2) {
			return 1;
		}
		return fibonacciOne(number-1)+fibonacciOne(number-2);
	}
	
	public static int fibonacciTwo(int number) {
		if(number ==1 || number==2) {
			return 1;
		}
		int fibo1=1, fibo2=1, fibo3=1;
		for(int i=3;i<=number;i++) {
			fibo3=fibo1+fibo2;
			fibo1=fibo2;
			fibo2=fibo3;
		}
		return fibo3;
	}
	//performance improvement
	public static int fibonacciThree(int number) {
		HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
		
		Integer fibonacci=cache.get(number);
		if(fibonacci!=null) {
			return fibonacci;
		}
		fibonacci=fibonacciTwo(number);
		cache.put(number, fibonacci);
		return fibonacci;
		
	}
}
