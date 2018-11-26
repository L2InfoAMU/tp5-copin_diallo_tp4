package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private int width, height;
    private Color color;
    private Color[][] colors;
    private int x, y;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public BruteRasterImage(Color[][] colors) {
        this.colors[x][y] = colors[x][y];
    }

    public void createRepresentation(){
        Object[][] matrice = new Object[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y]=color;
    }

    public void setPixelsColor(Color[][] pixels){
        colors[x][y]=pixels[x][y];
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
