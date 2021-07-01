package day01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		if(year % 4 ==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}