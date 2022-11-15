/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:08
 */

package day01;

public class Student {
    private int id;
    private String username;
    private  int age;

    public Student() {
    }

    public Student(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{id = " + id + ", username = " + username + ", age = " + age + "}";
    }
}
