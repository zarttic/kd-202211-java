/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 11:19
 */

package day01;

public class User {
    private int id;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String username) {
        this.username = username;
    }

    public User(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    private  String username;
}
