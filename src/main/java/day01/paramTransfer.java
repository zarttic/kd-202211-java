/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 10:18
 */

package day01;

import java.util.Arrays;

public class paramTransfer {
    public static void main(String[] args) {

        int a = 10,b = 20;

        swap(a,b);

        System.out.println("main-a:"+a);
        System.out.println("main-b:"+b);

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        add(arr1,arr2);

        System.out.println("main-arr1->"+ Arrays.toString(arr1));
        System.out.println("main-arr2->"+ Arrays.toString(arr2));
    }

    private static void add(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 10;
        }

        arr1 = arr2;

        System.out.println("add->"+ Arrays.toString(arr1));
        System.out.println("add->"+ Arrays.toString(arr2));
    }

    private static void swap(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println(a+" __ "+ b);
    }
}
