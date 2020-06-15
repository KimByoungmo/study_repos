package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class javautil {
    public void Problem1() throws Exception {
        String[] participants = {"aa", "bb", "cc", "dd"};
        String[] completions = {"aa", "bb", "dd"};

        Exception e = new Exception("배열의 크기를 초과하였습니다.");
        String str = "";
        int res = 0;
        if (participants.length > 100000 | completions.length > 99999) {
            throw e;
        } else {
            for (int i = 0; i < participants.length; i++) {
                int j;
                for (j = 0; j < completions.length - 1; j++) {
                    if (participants[i].equals(completions[j])) {
                        break;
                    } else {
                        continue;
                    }
                }
                if (!participants[i].equals(completions[j])) {
                    str = participants[i];
                    break;

                }
            }
            System.out.println(str);
        }
    }

    /*Bulls and Cows game*/
    public void Problem2() throws IOException {
//        declare variables
        int cnt = 0;
        int[] target = this.getRandomInts(4, 0, 9);
        int num = 0;
        int[] source = new int[4];

        while (num < 10) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            if (str.length() != 4) {
                System.out.println("4자리 숫자를 입력하시오!");
            } else {

                for (int i = 0; i < str.length(); i++) {

                    source [i] = Integer.parseInt(String.valueOf(str.charAt(i)));

                }

                System.out.println(this.getBulls(source, target) + "Bulls " + this.getCows(source, target) + "Cows " + (num + 1) + "tries");
                num += 1;
            }
        }
    }

    public int[] getRandomInts(int num, int min, int max) {
        Random random = new Random();
        return random.ints(num, min, max + 1).toArray();
    }

    public int getBulls(int[] source, int[] target) {
        int result = 0;
        for (int i = 0; i < target.length; i++) {
            if (source[i] == target[i]) {
                result += 1;
            }
        }
        return result;
    }

    public int getCows(int[] source, int[] target) {
        int result = 0;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < source.length; j++) {
                if (source[i] == target[j]) {
                    result += 1;
                }
            }
        }
        return result;
    }
}




