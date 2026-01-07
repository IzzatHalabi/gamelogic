package dimension;

public interface Dimensionable {

    Dimension getDimension();

    void setDimension(Dimension dimension);

    default void setDimension(int width, int height) {
        this.setDimension(new Dimension(width, height));
    }

}