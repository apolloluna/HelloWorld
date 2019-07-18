package 异常;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class test {
	
	/*public class NullPointerException extends Exception{
		
	}*/
	public void Compare(String str1,String str2)throws NullPointerException {
		if(str1.isEmpty()) {
			System.out.println("str1 is empty");
			throw new NullPointerException();
		}
		else if (str2.isEmpty()) {
			System.out.println("str2 is empty");
			throw new NullPointerException();
		}
		else {
			System.out.println("没有空字符串");
		}
	}
	
	
	/*int[] arr= new int[3];
	public void method3(){
		System.out.println(arr[3]);
		System.out.println("three");
	}
	public void method2() {
		method3();
		System.out.println("two");
	}
	public void method1() {
		method2();
		System.out.println("one");
	}*/

	public static void main(String[] args) {
		try {
		    new test().Compare("    ", "");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("字符串为空");
			// TODO: handle exception
		}
		
		
		
		
		/*new test().method1();
		System.out.println("main");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int numbers[] = {3,4,5,6};
		
		try {
			for(int i =0;i<numbers.length;i++) {
				int input = new Scanner(System.in).nextInt();
				System.out.println(numbers[i]/input);
			}
		}
		
		catch (InputMismatchException|ArithmeticException e) {
			System.out.println("输入错误");
			// TODO: handle exception
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
			
			//int x=0;
			//int y = 5/x;
			
		} /*catch (Exception e) {
			System.out.println("Exception");
			// TODO: handle exception
		}/*catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			// TODO: handle exception
		}*/
		//System.out.println("finished");
		
		
		
		
		/*int i = 0;
		String[] greeting = {"kiku","cxk","helen"};
		try {
			while(i<4) {
				System.out.println(greeting[i]);
				i++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("数组下标越界");
		}
		catch (RuntimeException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/	
	}


}