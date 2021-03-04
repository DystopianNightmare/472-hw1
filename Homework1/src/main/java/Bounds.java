import java.awt.*;

public class Bounds {
   private int height;
   private int width;
   private Point point;

   public Bounds(Point point, int height, int width){
       this.point = point;
       this.height = height;
       this.width =width;

   }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point.x = point.x;
        this.point.y=point.y;
    }

    public void setPointX(int x){
       this.point.x=x;
    }
    public void setPointY(int y){
        this.point.y=y;
    }


}
