/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:51
 */

package day01.homework.work1;

public class Computer {
    private Screen screen;
    private int price;
    private String brand;
    private String des;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "screen=" + screen +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}

