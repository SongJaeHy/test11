package day04.loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 7�� ��� 10���� ����϶�
		/*
		 *   7 		7 * 1
		 *   14		7 * 2
		 *   21		7 * 3
		 *   28		7 * 4
		 *   ..
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(num * i);
		}
	}
}










