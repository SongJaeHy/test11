package day03.ifswitch;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/*
		 * ������ ���δٸ� ���ڸ� �Է¹޴´�.(���)
		 * 
		 * �Է¹��� �� �߿��� ���� ū���� ����Ͻÿ�
		 * 
		 * ������� >
		 * ����1 : 10
		 * ����2 : 50
		 * ����3 : 7
		 * 
		 * �ִ� : 50
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int n1 = sc.nextInt();
		System.out.print("����2 : ");
		int n2 = sc.nextInt();
		System.out.print("����3 : ");
		int n3 = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		if (max < n1) max = n1;
		if (max < n2) max = n2;
		if (max < n3) max = n3;
		System.out.println("�ִ� : " + max);
	}
}











