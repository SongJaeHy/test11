package day03.ifswitch;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/*
		 *   if ���� ��� 
		 *   
		 *   if(�� �Ǵ� ����)
		 *      ���ϰ�� ������ ����
		 *      
		 *   if(�� �Ǵ� ����) {
		 *   	���ϰ�� ������ ����
		 *   	���ϰ�� ������ ����
		 *   	���ϰ�� ������ ����
		 *   	���ϰ�� ������ ����
		 *   }
		 */
		// ���̸� �Է¹޾Ƽ� �Է¹��� ���̰�
		// 18 �̻� �� ���
		// "��ǥ ������ �����Դϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		int age = sc.nextInt();
		/*
		if (age >= 18) 
			System.out.println("��ǥ ������ �����Դϴ�");
		*/
		if (age >= 18) {
			System.out.println("����� ���̴� " + age);
			System.out.println("��ǥ ������ �����Դϴ�");
		}
		System.out.println("���α׷� ����");
	}
}












