package day04.loop;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		/*
		 *  1���� �Է¹��� �������� ���� ���ϴ� ���α׷� �ۼ�
		 *  
		 *  �� �Է� : -1
		 *  0���� ū ���� �Է��ϼ���
		 *  �� �Է� : -9
		 *  0���� ū ���� �Է��ϼ���
		 *  �� �Է� : 5
		 *  1���� 5������ ���� 15�Դϴ�.
		 */
		// Scanner ����
		Scanner sc = new Scanner(System.in);
		
		int num = -1;
		while (true) {
			// �� �Է� �޴� �ڵ�
			System.out.print("�� �Է� : ");
			num = sc.nextInt();
			if (num > 0) {
				break;
			}
			System.out.println("0���� ū ���� �Է��ϼ���");
		}
		
		// 1���� - �Է¹��� �� ������ ���� ���ϴ� �ݺ���
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// ��� ����ϱ�
		System.out.printf(
				"1���� %d������ ���� %d�Դϴ�.", num, sum
		);
	}
}









