/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 10:18
 */

package day01;

import java.util.Arrays;

public class arrayTest {
    public static void main(String[] args) {
        int a = 10, b = 10;
        System.out.println(a == b);

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};

        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}