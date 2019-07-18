package 工具类;

import java.util.Scanner;

public class 必做题 {

	public static void main(String[] args) {
		/*
		 * 必做题1
		 * Scanner inScanner = new Scanner(System.in);
		String aString = inScanner.nextLine();
		String bString = inScanner.nextLine();
		Integer a = Integer.valueOf(aString);
		Integer b = Integer.valueOf(bString);
		System.out.println(a+b);*/
		
		/*
		 * 必做题2
		 * Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		String findtext	= "e";
		int num = appearNumber(string, findtext);
		System.out.println(num);*/
		
		/*
		 * 必做题三
		 */ int[] list = new int[10];
		for(int x=0;x<list.length;x++) {
			list[x]=(int) (Math.random()*100)+1;
		}
		int temp = 0;
		int len = list.length;
		for(int i =0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(list[j]>list[j+1]) {
					temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					
				}
			}
		}
		for(int x:list) {
			System.out.print(x+" ");
		}

	}
	
	
	
	
	/*
	 * public static int appearNumber(String srcText, String findText) {
	    int count = 0;
	    int index = 0;
	    while ((index = srcText.indexOf(findText, index)) != -1) {
	        index = index + findText.length();
	        count++;
	    }
	    return count;
	}
	*/
}

