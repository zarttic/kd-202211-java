/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-16 10:37
 */

package day02;

import java.nio.charset.StandardCharsets;

public class StringApi {
    public static void main(String[] args) {
        String s = "hello";
        char t1 = s.charAt(1);
        System.out.println(t1);
        int t2 = s.codePointAt(1);
        System.out.println(t2);
        int t3 = s.codePointBefore(1);
        System.out.println(t3);
        int t4 = s.codePointCount(0, 1);
        System.out.println(t4);
        int t5 = s.compareTo("woo");
        System.out.println(t5);
        String t6 = s.concat("world");
        System.out.println(t6);
        String ww = s.concat("ww");
        System.out.println(ww);
        boolean www = s.contentEquals("www");
        System.out.println(www);
        boolean s1 = s.endsWith("s");
        System.out.println(s1);
        boolean s2 = s.startsWith("s");
        System.out.println(s2);
        boolean sss = s.equals("sss");
        System.out.println(sss);
        boolean ww1 = s.equalsIgnoreCase("ww");
        System.out.println(ww1);
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);
        int i = s.hashCode();
        System.out.println(i);
        int i1 = s.indexOf(1);
        System.out.println(i1);
        int i2 = s.indexOf(1, 2);
        System.out.println(i2);
        String intern = s.intern();
        System.out.println(intern);
        boolean empty = s.isEmpty();
        System.out.println(empty);
        int s3 = s.lastIndexOf("s");
        System.out.println(s3);
        int length = s.length();
        System.out.println(length);
        int i3 = s.offsetByCodePoints(1, 2);
        System.out.println(i3);
        boolean hel = s.regionMatches(1, "hel", 2, 2);
        System.out.println(hel);
        String replace = s.replace("w", "ww");
        System.out.println(replace);
        String s4 = s.replaceAll("w", "ww");
        System.out.println(s4);
        String s5 = s.replaceFirst("w", "ww");
        System.out.println(s5);
        CharSequence charSequence = s.subSequence(1, 2);
        System.out.println(charSequence);
        String substring = s.substring(2);
        System.out.println(substring);
        String substring1 = s.substring(1, 2);
        System.out.println(substring1);
        char[] chars = s.toCharArray();
        System.out.println(chars);
        String s6 = s.toLowerCase();
        System.out.println(s6);
        String s7 = s.toUpperCase();
        System.out.println(s7);
        String trim = s.trim();
        System.out.println(trim);


    }
}
