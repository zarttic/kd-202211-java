/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 15:00
 */

package day01.homework.work22;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double paid;
    List<Employee> sub;
    List<Employee> boss;

    /**
     * 添加下属
     */

    public void addSub(Employee e){
        sub.add(e);
    }

    /**
     * 获取下属数量
     */
    public int getSubSize(){
        return sub.size();
    }

    /**
     * 输出下属
     */
    public void printSub(){
        System.out.println(sub.toString());
    }


    public Employee() {
    }

    public Employee(int id, String name, double paid, List<Employee> sub, List<Employee> boss) {
        this.id = id;
        this.name = name;
        this.paid = paid;
        this.sub = sub;
        this.boss = boss;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return paid
     */
    public double getPaid() {
        return paid;
    }

    /**
     * 设置
     * @param paid
     */
    public void setPaid(double paid) {
        this.paid = paid;
    }

    /**
     * 获取
     * @return sub
     */
    public List<Employee> getSub() {
        return sub;
    }

    /**
     * 设置
     * @param sub
     */
    public void setSub(List<Employee> sub) {
        this.sub = sub;
    }

    /**
     * 获取
     * @return boss
     */
    public List<Employee> getBoss() {
        return boss;
    }

    /**
     * 设置
     * @param boss
     */
    public void setBoss(List<Employee> boss) {
        this.boss = boss;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", paid = " + paid + ", sub = " + sub + ", boss = " + boss + "}";
    }
}
