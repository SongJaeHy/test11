package day04.loop;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���ѷ��� - �ݺ����� ���๮�忡�� �ݺ����� ���������� �ؾ� �Ѵ�.
		while (true) {
			System.out.print("�� �Է� : ");
			int num = sc.nextInt();
			System.out.println("�Է��� �� : " + num);
			if (num == -1) {
				break;  // ������� �Է°��� -1�϶� �����Ѵ�.
			}
		}
		System.out.println("�ݺ� ��������");
	}
}
