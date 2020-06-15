import java.io.*;
import util.javautil;

import static java.lang.System.*;

public class main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out.println("문제번호를 입력하시오.");
        int selection = Integer.parseInt(br.readLine());
        javautil j = new javautil();

        switch(selection) {
            case 1 :
                /* 1번 문제 솔루션 실행 */
                j.Problem1();
                break;
            case 2 :
                /* 2번 문제 솔루션 실행 */
                j.Problem2();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selection);
        }
        }

    }
