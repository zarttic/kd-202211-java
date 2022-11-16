/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-16 15:47
 */

package day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethodDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("css");
        list.add("java");

        System.out.println(list.contains("css"));//true

        System.out.println(list.size());//4

        System.out.println(list.indexOf("java"));//0


        System.out.println(list);//[java, css, java]

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("====");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("======");
        list.forEach(e-> System.out.println(e));
        System.out.println("=====");
        list.forEach(System.out::println);
        System.out.println("=======");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String n = iter.next();
            System.out.println(n);
        }
    }
}