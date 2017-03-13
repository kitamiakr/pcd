
package gambar;

import java.awt.Point;


public class Gambar {
    public double x;
    public double y;

    
    //konstruktor
    public Gambar() {
        x = 0;
        y = 0;
    }
    
    public Gambar(double x, double y) {
        setLocation(x, y);
    }
    
    
   
    public double getX() {
        return x;
    }

    
    public double getY() {
        return y;
    }

    
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "DoublePoint[x: " + x + ", y: " + y + "]";
    }
    
    public Point toPoint() {
        return new Point((int) Math.round(this.x), (int) Math.round(this.y));
    }
}
