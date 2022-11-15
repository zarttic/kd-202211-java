/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:51
 */

package day01.homework.work1;

public class Screen{
    private int size;
    private String type;
    private String brand;


    public Screen() {
    }

    public Screen(int size, String type, String brand) {
        this.size = size;
        this.type = type;
        this.brand = brand;
        if (size != 17 && size != 23 && size != 19 && size != 25)this.size = 17;
    }

    /**
     * 获取
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
        if (size != 17 && size != 23 && size != 19 && size != 25)this.size = 17;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Screen{size = " + size + ", type = " + type + ", brand = " + brand + "}";
    }
}
