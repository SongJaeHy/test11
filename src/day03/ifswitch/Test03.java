package day03.ifswitch;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * if (�� �Ǵ� ����) {
		 *    ���� ���
		 * } else if (�� �Ǵ� ����) {
		 * 	  ���� ���
		 * } else if (�� �Ǵ� ����) {
		 *    ���� ���
		 * } else {
		 *    ���� ��찡 ��� �ƴ� ���
		 * }
		 */
		/*
		 * ���ڸ� �Է¹ް� 
		 * �Է¹��� ���ڰ� 5�� ���
		 * 5�Դϴ� 
		 * 
		 * ���ڰ� 5���� ū ���
		 * 5���� Ů�ϴ�.
		 * 
		 * ���ڰ� 5���� ���� ���
		 * 5���� �۽��ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		/*
		if (num == 5) {
			System.out.println("5�Դϴ�.");
		}
		if (num > 5) {
			System.out.println("5���� Ů�ϴ�.");
		}
		if (num < 5) {
			System.out.println("5���� �۽��ϴ�.");
		}
		*/
		if (num == 5) {
			System.out.println("5�Դϴ�.");
		} else if (num > 5) {
			System.out.println("5���� Ů�ϴ�.");
		} else {
			System.out.println("5���� �۽��ϴ�.");
		}
	}
}













