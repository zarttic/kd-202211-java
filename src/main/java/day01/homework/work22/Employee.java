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
    private List<Employee> sub;
    private List<Employee> boss;

    public Employee(int id, String name, double paid) {
        this.id = id;
        this.name = name;
        this.paid = paid;
    }

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
        for (Employee employee : sub) {
            System.out.println(employee);
        }
    }


    public Employee() {
    }

    /**
     * 根据id删除下属
     */
    public void deleteByID(int id){
        for (int i = 0; i < sub.size(); i++) {
            if(sub.get(i).id == id){
                sub.remove(sub.get(i));
                return;
            }
        }
        System.out.println("未找到");
    }
    /**
     * 删除薪资大于(?)的
     */
    public void deleteByPaid(double paid){
        for (int i = 0; i < sub.size(); i++) {
            if(sub.get(i).paid > paid){
//                System.out.println(sub.get(i));
                sub.remove(sub.get(i));
                i--;
            }
        }

    }
    /**
     *
     * @param id
     * @param name
     * @param paid
     * @param sub
     * @param boss
     */

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
        return "Employee{id = " + id + ", name = " + name + ", paid = " + paid + "}";
    }
}
