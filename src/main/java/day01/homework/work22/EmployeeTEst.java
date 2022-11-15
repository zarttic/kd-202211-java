/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 16:54
 */

package day01.homework.work22;

import java.util.ArrayList;

public class EmployeeTEst {
    public static void main(String[] args) {
        Employee  e = new Employee();
        e.setSub(new ArrayList<>());
        for(int i = 1; i<=10;i++) {
            e.addSub(new Employee(i,Integer.toString(i),i*1000));
        }
        e.deleteByID(10);
        e.deleteByPaid(5000.0d);
        e.printSub();

    }
}
