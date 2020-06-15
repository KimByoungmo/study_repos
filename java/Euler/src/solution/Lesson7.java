/**
 * 
 */
package solution;

import java.io.*;

/**
 * @author ksd20
 *
 */
public class Lesson7 {

	private int res;
	private int var;

	public void Problem4 () throws NumberFormatException, IOException {
		int[] x = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		res = 0;
		System.out.println("5명의 시험 점수를 입력하십시오");

		for (int i = 0; i <= x.length-1; i++) {
			x[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i <= x.length-1; i++) {
			res += x[i];
		}

		for (int k = 0; k <= x.length-1; k++) {
			if(k == 0) {
				var = x[k];
			}
			else if (var > x[k]) {
				//pass
			}
			else {
				var = x[k];
			}

		}

		for (int j = 0; j <= x.length-1; j++) {
			System.out.println((j + 1) + "번째 사람의 점수는 " + x[j] + "입니다.");
		}

		System.out.println("점수 합계는 " + res + "이고, 평균은 " + res / x.length + "입니다.");
		System.out.println("가장 큰 점수는 " + var + "입니다.");
	}

}
