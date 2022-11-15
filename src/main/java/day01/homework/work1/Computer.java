/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:51
 */

package day01.homework.work1;

public class Computer {
    private Screen screen;
    private double price;
    private String brand;
    private String des;


    public Computer() {
    }

    public Computer(Screen screen, double price, String brand, String des) {
        this.screen = screen;
        this.price = price;
        this.brand = brand;
        this.des = des;
        if (price < 1000 || price > 20000)this.price = 2000;
    }

    /**
     * 获取
     * @return screen
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * 设置
     * @param screen
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {

        this.price = price;
        if (price < 1000 || price > 20000)this.price = 2000;
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

    /**
     * 获取
     * @return des
     */
    public String getDes() {
        return des;
    }

    /**
     * 设置
     * @param des
     */
    public void setDes(String des) {
        this.des = des;
    }

    public String toString() {
        return "Computer{screen = " + screen + ", price = " + price + ", brand = " + brand + ", des = " + des + "}";
    }
}

