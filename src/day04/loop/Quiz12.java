package day04.loop;

public class Quiz12 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		/*
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		*/
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				evenSum += i;
				continue;
			}
			
			oddSum += i;
		}
		
		System.out.println("¦�� �� : " + evenSum);
		System.out.println("Ȧ�� �� : " + oddSum);
		System.out.println("��ü �� : " + (evenSum + oddSum));
	}
}







