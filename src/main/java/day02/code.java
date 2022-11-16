/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-16 14:27
 */

package day02;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length() - 2;
        int s1 = 0,s2 = 0;
        for(int i = len ,t = 0;i >= 0;i--,t++){

            if(t%2 == 0){
                s1 += (str.charAt(i) - '0');
            }
            else {
                s2 += (str.charAt(i) - '0');
            }
        }

        s1 *= 3;
        s2 += s1;
        int cur  = 0;
        while(cur * 10 <= s2){
            cur++;
        }
        System.out.println(cur * 10 - s2);

    }
}
