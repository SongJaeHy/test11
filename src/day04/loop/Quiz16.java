package day04.loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(1000) + 1; // 1 ~ 1000
		System.out.println("���� : " + answer);
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		for (; i <= 10; i++) {
			System.out.print(i + ". ���� �Է��ϼ���(1 - 1000) : ");
			int input = sc.nextInt();
			if (input == answer) {
				System.out.println("�����Դϴ�.");
				break;
			}
			/*
			if (input > answer) {
				System.out.println("�����Դϴ�.(���� ���Դϴ�.)");				
			} else {
				System.out.println("�����Դϴ�.(ū ���Դϴ�.)");				
			}
			*/
			System.out.printf(
				"�����Դϴ�.(%s ���Դϴ�.)\n", 
				input > answer ? "����" : "ū"
			);
		}
		if (i == 11) {
			// ������ �� ������ ��� 10ȸ�ȿ� ���߱� ���ӿ� �����Ͽ����ϴ�.
			System.out.println("10ȸ�ȿ� ���߱� ���ӿ� �����Ͽ����ϴ�.");
			System.out.printf("������ %d �Դϴ�.", answer);
		}
		
		/*
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;
			System.out.print(num + " ");
		}
		*/
	}
}
