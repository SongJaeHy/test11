/*
 *    1���� 10������ ���ڸ� ����Ѵ�.
 *    3�� ����� �״�� ����ϰ�
 *    3�� ����� �ƴ� ���ڴ� 2����� ����Ѵ�.
 *    
 *    �������>
 *    2
 *    4
 *    3
 *    8
 *    10
 *    6
 *    ..
 *    ..
 *    20
 */
package day04.loop;

public class Quiz08 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			/*
			if (i % 3 == 0) {
				System.out.println(i);
			} else {
				System.out.println(i * 2);
			}
			*/
			System.out.printf(
					"%d\n", i % 3 == 0 ? i : i * 2
			);
		}
	}
}












