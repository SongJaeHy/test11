package day04.loop;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 	������ ��� 2���� �Է¹޴´�
		 *  ��, ���� ���ڴ� �Էµ��� �ʴ´�.
		 *  
		 *  �� �Է� : 3
		 *  �� �Է� : 10
		 *  ���� 6�Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int start = sc.nextInt();
		System.out.print("�� �Է� : ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("���� " + sum + "�Դϴ�.");
	}
}






