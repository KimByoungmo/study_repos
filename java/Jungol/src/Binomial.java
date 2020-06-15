import java.io.*;

public class Binomial {
public static void main(String[] args) throws IOException {
	int a, b = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	String[] str2 = str.split(" ", 0);

	a = Integer.parseInt(str2[0]);
	b = Integer.parseInt(str2[1]);
	System.out.println(a + b);
}
}
