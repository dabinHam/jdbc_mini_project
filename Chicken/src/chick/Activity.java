package chick;

import java.util.Timer;
import java.util.TimerTask;

public class Activity {

	static int count = 5;

	public static void main(String[] args) {
		System.out.println("Ÿ�̸ӻ���� �ǽð� ī��Ʈ�ٿ� �� �ڵ�����");

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				if (count >= 0) {
					System.out.println("ī��Ʈ ��" + count);
					--count;
				} else {
					timer.cancel();
					System.out.println("ī��Ʈ �� ����");
				}
			}
		};timer.schedule(task, 1000,1000);
	}
}
