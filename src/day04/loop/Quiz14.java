/*
 *  ����ڰ� -1�� �Է��� �� ���� �Է¹��� ���� ���� ���Ѵ�
 *  ��, -1�� �տ� ���� �ʴ´�.
 *  
 *  �� �Է� : 10
 *  �� �Է� : 5
 *  �� �Է� : -1
 *  
 *  ���� ���� 15 �Դϴ�.
 */
package day04.loop;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;  // sum += num;
		while(true) {
			System.out.print("�� �Է� : ");
			int num = sc.nextInt();
			// 1 sum += num;
			
			if (num == -1) {
				break;
			}
			
			// 2 sum += num;
			sum += num;
		}
		System.out.println("���� ���� " + sum + " �Դϴ�.");
	}
}











