/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:51
 */

package day01.homework.work1;

public class Screen{
    private Double size;

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + size +
                '}';
    }
}
