package dimension;

public class Dimension {

    private int width = 0;
    private int height = 0;

    public Dimension() {}

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Dimension(Dimension dimension) {
        this.width = dimension.width;
        this.height = dimension.height;
    }

    public void setWidth(int width) { this.width = width; }
    public int getWidth() { return width; }

    public void setHeight(int height) { this.height = height; }
    public int getHeight() { return height; }

}