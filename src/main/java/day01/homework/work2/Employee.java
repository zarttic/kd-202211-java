/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:47
 */

package day01.homework.work2;

import java.util.List;

/**
 * 二.完成员工类 Employee,需要包含员工的基本属性
 * (编号,姓名,工资)和上司以及下属,提供如下方法:
 * 属性的存/取方法
 * 业务方法包含:
 *    添加下属的方法
 *    输出自己所属下属的方法
 *    获取自己下属的人数个数.
 * =============================
 */
public class Employee {
    private int id;
    private String name;
    private double paid;
    List<sub> subs;
    boss boss;

    /**
     * 添加下属
     */

    public int addSub(sub sub){
        subs.add(sub);
        return subs.size();
    }

    /**
     * 获取下属数量
     * @return
     */
    public int getSubSize(){
        return subs.size();
    }

    /**
     * 输出下属
     */
    public void printSub(){
        System.out.println(subs.toString());
    }


    public Employee() {
    }

    public Employee(int id, String name, double paid, List<sub> subs, boss boss) {
        this.id = id;
        this.name = name;
        this.paid = paid;
        this.subs = subs;
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
     * @return subs
     */
    public List<sub> getSubs() {
        return subs;
    }

    /**
     * 设置
     * @param subs
     */
    public void setSubs(List<sub> subs) {
        this.subs = subs;
    }


    /**
     * 获取
     * @return boss
     */
    public boss getBoss() {
        return boss;
    }

    /**
     * 设置
     * @param boss
     */
    public void setBoss(boss boss) {
        this.boss = boss;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", paid = " + paid + ", subs = " + subs + ", boss = " + boss + "}";
    }
}
