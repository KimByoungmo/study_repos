import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import solution.*;

public class main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Lesson6 L = new Lesson6();
		Lesson7 L7 = new Lesson7();
		Lesson8 L8 = new Lesson8(10, 20);
		System.out.println("안녕하세요");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		switch (c) {
		case 61:
			L.Problem1();
			break;
		case 62:
			L.Problem2();
			break;
		case 63:
			L.Problem3();
			break;
		case 64:
			L.Problem4();
			break;
		case 65:
			L.Problem5();
			break;
		case 74:
			L7.Problem4();
			break;
		case 85:
			System.out.println("안녕" + L8.getX() + "내친구.");
			System.out.println("Y안녕" + L8.getY() + "내친구.");
			break;
		default:
			System.out.println("안녕내친구");
			break;
		}

	}
}
