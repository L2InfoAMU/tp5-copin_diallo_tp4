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
        this.colors[x][y]=color;
    }

    public void setPixelsColor(Color[][] pixels){
        for(y=0; y<this.height; y++){
            for(x=0; x<this.width; x++){
                this.colors[x][y]=pixels[x][y];
            }
        }
    }

    public void setPixelsColor(Color color){
        for(y=0; y<this.height;y++) {
            for (x = 0; x < this.width; x++) {
                this.colors[x][y] = color;
            }
        }
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
