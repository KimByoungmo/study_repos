package solution;
import java.io.*;

public class Lesson6 {

	public void Problem1() {
		System.out.println("1~10까지의 짝수를 출력합니다");
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
	}

	public void Problem2() throws IOException {
		boolean i = true;
		int res = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("시험점수를 입력하십시오. (0으로 종료)");
		while(i) {
			int temp = Integer.parseInt(br.readLine());
			if(temp == 0) {
				System.out.println("시험 점수의 합계는 " + res + " 입니다.");
				i = false;
			} 
			else {
				res += temp;
			}
		}
	}

	public void Problem3() {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
				if(j == 9) {
					System.out.println("\n");
				}
			}
		}
	}

	public void Problem4() {
		for(int i = 1;i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public void Problem5() throws IOException {
		System.out.println("2이상의 정수를 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		if(x > 2) {
		if(this.CheckPrime(x)) {
			System.out.println(x + "는 소수입니다.");
		}
		else {
			System.out.println(x + "는 소수가 아닙니다.");
		}
		}
		else {
			System.out.println("다시 입력하십시오.");
		}

	}
	
	public boolean CheckPrime(int x) {
		for (int i = 2; i <= x-1; i++) {
			if(x % i == 0) {
				return false;
			}
			else {
				continue;
			}
		}

		return true;
	}
}
