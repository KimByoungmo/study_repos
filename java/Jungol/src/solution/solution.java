package solution;
import java.io.*;
public class solution {
public int a, b;

public solution() throws IOException {
	boolean flag = true;
	int x = 0;
	int y = 0;
	while (flag) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			if ((x > 1000 || x < 0) || (y >= 3000 || y < 0)) {
				System.out.println("Input Error");
				Exception e = new Exception("Input Error");
			}
		} catch (Exception e) {
			flag = true;
		}
		flag = false;
	}
	this.a = x;
	this.b = y;
	System.out.println("강아지와 병아리 수는 " + this.a);
	System.out.println("강아지 다리 수와 병아리 다리 수는 " + this.b);
}

public int getDogsNumber(int x, int y) throws Exception {
	if (x % 2 != 0 || y / 2 - x < 0) {
		System.out.println("0");
		Exception e = new Exception("Input Error");
		throw e;
	} else return y / 2 - x;
}

public int getChicksNumber(int x, int y) throws Exception {
	if (x % 2 != 0 || 2 * x - y / 2 < 0) {
		System.out.println("0");
		Exception e = new Exception("Input Error");
		throw e;
	} else return 2 * x - y / 2;
}
}
