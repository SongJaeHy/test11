package day02.operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ��� : ");
		int time = sc.nextInt();
		// ��°��
		// 7451�ʴ� ??�ð� ??�� ??�� �Դϴ�.
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;
		System.out.printf(
				"%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.",
				time, hour, minute, second
		);
	}
}
