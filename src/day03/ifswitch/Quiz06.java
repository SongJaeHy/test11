package day03.ifswitch;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * ������ǰ �븮���� ����.
		 * 
		 * ���ǰ��� ���� ������ �����ϰ� �ִ�.
		 * 
		 * --------------------------
		 * ���ǰ�   10���� ����   30���� ����  30���� �ʰ� 
		 * ������   3% ����      5% ����     8% ����
		 * --------------------------
		 * 
		 * �������>
		 * 
		 * ���ǰ�(����) : 10
		 * ���ݾ��� 97000�� �Դϴ�.
		 * 
		 * ���ǰ�(����) : 20
		 * ���ݾ��� 190000�� �Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ǰ�(����) : ");
		int price = sc.nextInt();
		double rate = 0;
		if (price <= 10) {  // 10���� ����
			rate = 0.97;
		} else if (price <= 30) {  // 30���� ����
			rate = 0.95;
		} else {  // 30���� �ʰ�
			rate = 0.92;
		}
		System.out.println(
			"���ݾ��� " + 
			(int)(price * 10000 * rate) + 
			"�� �Դϴ�."
		);
		/*
		System.out.printf(
			"���ݾ��� %d�� �Դϴ�.", (int)(price * 10000 * rate)
		);
		*/
		
		// %d ����, %f �Ǽ�, %s ���ڿ�, %c ����
		System.out.printf(
			"���ݾ��� %.2f�� �Դϴ�.", price * 10000 * rate
		);
	}
}










