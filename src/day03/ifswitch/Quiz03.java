package day03.ifswitch;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 *   ���ڸ� �Է¹޾Ƽ� 
		 *   �Է¹��� ���ڰ� "¦��"���� "Ȧ��" ���� ���
		 *   
		 *   �������>
		 *   ���� : 10
		 *   ¦��
		 *   
		 *   ���� : 9
		 *   Ȧ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}
}














