package chick;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class egg extends Thread {
	static int x;// ���ڸ�
	static int y;// ���ڸ�
	static int z;// ������Է°�
	static int answer;// ��*��=�����
	static int num;
	static int score;// ����
	static int plus = 10;// �߰�����
	static int count = 2;// ���ѽð�

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Timer timer = new Timer();

		System.out.println("������ ������ �����մϴ�." + count + "�� �ȿ� �Է����ּ���");

		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				x = random.nextInt(9) + 1;
				y = random.nextInt(9) + 1;
				answer = x * y;//
				if (count > 0) {
//					System.out.println("ī��Ʈ �ٿ�" + count);
					count--;
				} else if (count == 0) {
					cancel();
					System.out.println("�ð��ʰ�");
				}
			
				System.out.print(x + "x" + y + "=>");

				// z = sc.nextInt();
				if (z == answer) {
					score += 10;
					System.out.println("�����Դϴ�! " + plus + "�� �߰� " + " ���� =>" + score);
				}

//				else {
//					System.out.println("�����Դϴ�! ������ " + answer + " �Դϴ�");
//					System.out.println("���� ����");
//					break;
//				}
			}

		};
		timer.schedule(task, 1000, 1000);
	}

}
