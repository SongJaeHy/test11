/*
 * �ݺ��� ����������(������ �ݺ�ó�� ������ ��ŵ��)
 * break
 * 
 * ���� �������� �ݺ�ó�� ������ ��ŵ��
 * continue
 * 
 * switch(����) {
 *    case ��1:
 *       ���๮��;
 *       break;
 * }
 */
package day04.loop;

public class Test03 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i == 5) {  // i�� 5 .. 
				break;
			}
			System.out.println(i);
		}
		System.out.println("break �ݺ� ��������");
		
		for (int i = 1; i < 11; i++) {
			if (i == 5) {  // i�� 5 .. 
				continue;
			}
			System.out.println(i);
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
		}
		System.out.println("continue �ݺ� ��������");
		
	}
}






