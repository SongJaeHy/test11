package day04.loop;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		/*
		 *  ���� 5���� �Է¹ް� �Է¹��� ������ �հ� ����� ���ϴ� ���α׷� �ۼ�
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 5;
		for (int i = 0; i < cnt; i++) {
			System.out.print("�� �Է� : ");
			int num = sc.nextInt();
//			sum = sum + num;
			sum += num;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum / cnt);
	}
}







